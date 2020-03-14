package siva.nit.controller;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import siva.nit.model.Part;
import siva.nit.service.OrderMethodService;
import siva.nit.service.PartService;
import siva.nit.service.UomService;
import siva.nit.util.CommonIntegrationUtil;
import siva.nit.view.excel.PartExcelView;
import siva.nit.view.pdf.PartPdfView;

@Controller
@RequestMapping("/part")
public class PartController {

	@Autowired
	private PartService partService;

	@Autowired
	private UomService uomService;

	@Autowired
	private OrderMethodService orderMethodService;

	// 1.Register Page
	@RequestMapping("/register")
	public String showPartRegisterPage(Model model) {
		model.addAttribute("part", new Part());
		CommonUI(model);
		return "PartRegister";
	}

	// 2.save method(UI to Controller)---DB(Insert)
	@RequestMapping(value = "/save", method = POST)
	public String savePartRegister(@ModelAttribute Part part, Model model) {

		Integer id = partService.savePart(part);
		String message = "Part :" + id + " saved";
		model.addAttribute("savePartRegisterData", message);
		model.addAttribute("part", new Part());
		CommonUI(model);
		return "PartRegister";
	}

	// 3.gellAll Records method------DB(select)
	@RequestMapping("/all")
	public String fetchAllParts(Model model) {
		List<Part> list = partService.getAllParts();
		model.addAttribute("fetchAllPartsData", list);
		return "PartData";
	}

	// 4.delete method------DB(delete)
	@RequestMapping("/delete")
	public String deletePartObject(@RequestParam("pid") Integer id, Model model) {
		partService.delectPart(id);
		String message = "Part '" + id + "' is deleted";
		model.addAttribute("deletePartObjectData", message);
		// fetch new Data
		List<Part> list = partService.getAllParts();
		model.addAttribute("fetchAllPartsData", list);
		return "PartData";
	}

	// 5.One record Data edit method----DB(alter)
	@RequestMapping("/edit")
	public String showPartEditPage(@RequestParam("pid") Integer id, Model model) {
		Part partObj = partService.getOnePart(id);
		model.addAttribute("part", partObj);
		CommonUI(model);
		return "PartEdit";
	}

	// 6.Update Method--------DB(Update)
	@RequestMapping(value = "/update", method = POST)
	public String updatePartObject(@ModelAttribute Part part, Model model) {
		partService.updatePart(part);
		String message = "Part '" + part.getPartId() + "' Updated";
		model.addAttribute("updatePartObjectData", message);
		List<Part> list = partService.getAllParts();
		model.addAttribute("fetchAllPartsData", list);
		CommonUI(model);
		return "PartData";
	}

	// 7.fetch One Record Data
	@RequestMapping("/view")
	public String showOnePartObject(@RequestParam("pid") Integer id, Model model) {

		Part part = partService.getOnePart(id);
		model.addAttribute("showOnePartObjectData", part);
		return "PartView";
	}

	// 8. Excel files
	@RequestMapping("/excel")
	public ModelAndView showExcel(@RequestParam(value = "id", required = false) Integer id) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setView(new PartExcelView());
		if (id == null) {
			// export all rows
			List<Part> list = partService.getAllParts();
			modelAndView.addObject("showPartExcelData", list);
		} else {
			// export one row by id
			Part part = partService.getOnePart(id);
			modelAndView.addObject("showPartExcelData", Arrays.asList(part));
		}

		return modelAndView;
	}

	// 9.PDF files
	@RequestMapping("/pdf")
	public ModelAndView showPdf(@RequestParam(value = "id", required = false) Integer id) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setView(new PartPdfView());

		if (id == null) {
			// export all rows
			List<Part> list = partService.getAllParts();
			modelAndView.addObject("showPartPdfData", list);
		} else {
			// export one row by id
			Part part = partService.getOnePart(id);
			modelAndView.addObject("showPartPdfData", Arrays.asList(part));
		}
		return modelAndView;
	}

	// Module Integreation add HAS-A variable
	private void CommonUI(Model model) {
		// Uom Module
		List<Object[]> uomList = uomService.getUomIdAndUomModel();
		Map<Integer, String> uomMap = CommonIntegrationUtil.convert(uomList);
		model.addAttribute("CommonUIuomMapData", uomMap);

		// OrderMethod Module(Sale)
		List<Object[]> orderMethodSaleList = orderMethodService.getOrderMethodIdAndOrderMethodCode("Sale");
		Map<Integer, String> orderMethodSaleMap = CommonIntegrationUtil.convert(orderMethodSaleList);
		model.addAttribute("CommonUIorderMethodSaleMapData", orderMethodSaleMap);

		// OrderMethod Module(Purchase)
		List<Object[]> orderMethodPurchaseList = orderMethodService.getOrderMethodIdAndOrderMethodCode("Purchase");
		Map<Integer, String> orderMethodPurchaseMap = CommonIntegrationUtil.convert(orderMethodPurchaseList);
		model.addAttribute("CommonUIorderMethodPurchaseMapData", orderMethodPurchaseMap);

	}

}
