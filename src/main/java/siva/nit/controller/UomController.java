package siva.nit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletContext;

import siva.nit.model.Uom;
import siva.nit.service.UomService;
import siva.nit.util.UomChartsUtil;
import siva.nit.view.excel.UomExcelView;
import siva.nit.view.pdf.UomPdfView;

@Controller
@RequestMapping("/uom")
public class UomController {

	@Autowired
	private UomService uomService;
	@Autowired
	private ServletContext servletContext;
	@Autowired
	private UomChartsUtil uomChartsUtil;
	
	
	// 1.Register Page
	@RequestMapping("/register")
	public String showUomRegisterPage(Model model) {
		model.addAttribute("uom", new Uom());
		return "UomRegister";
	}

	// 2.save method(UI to Controller)---DB(Insert)
	@RequestMapping(value = "/save", method = POST)
	public String saveUomRegister(@ModelAttribute Uom uom, Model model) {
		Integer id = uomService.saveUom(uom);
		String message = "UomRegister '" + id + "'saved";
		model.addAttribute("UomMessage", message);
		model.addAttribute("uom", new Uom());

		return "UomRegister";

	}

	// 3.gellAll Records method------DB(select)
	@RequestMapping("/all")
	public String fetchAllUoms(Model model) {
		List<Uom> list = uomService.getAllUoms();
		model.addAttribute("listUomData", list);
		return "UomData";
	}

	// 4.delete method------DB(delete)
	@RequestMapping("/delete")
	public String deleteOneUom(@RequestParam("uid") Integer id, Model model) {
		uomService.deleteUom(id);
		String message = "Uom '" + id + "' is Deleted";
		model.addAttribute("UomMessage", message);
		// fetch new Data
		List<Uom> list = uomService.getAllUoms();
		model.addAttribute("listUomData", list);

		return "UomData";
	}

	// 5.One record Data edit method----DB(alter)
	@RequestMapping("/edit")
	public String showUomEditPage(@RequestParam("uid") Integer id, Model model) {

		Uom uomEditPagedata = uomService.getOneUom(id);
		model.addAttribute("uom", uomEditPagedata);

		return "UomEdit";
	}

	// 6.Update Method--------DB(Update)
	@RequestMapping(value = "/update", method = POST)
	public String updateUomObject(@ModelAttribute Uom uom, Model model) {
		uomService.updateUom(uom);
		String message = "Uom '" + uom.getUomId() + "' Updated";
		model.addAttribute("updateMessage", message);
		List<Uom> list = uomService.getAllUoms();
		model.addAttribute("listUomData", list);
		return "UomData";
	}

	// 7.fetch One Record Data
	@RequestMapping("/view")
	public String showOneUom(@RequestParam("uid") Integer id, Model model) {

		Uom uom = uomService.getOneUom(id);
		model.addAttribute("showOneUomData", uom);
		return "UomView";
	}

	// 8. Excel files
	@RequestMapping("/excel")
	public ModelAndView showExcel(@RequestParam(value = "id", required = false) Integer id) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setView(new UomExcelView());
		if (id == null) {
			// export all rows
			List<Uom> list = uomService.getAllUoms();
			modelAndView.addObject("showUomExcelData", list);
		} else {
			// export one row by id
			Uom uom = uomService.getOneUom(id);
			modelAndView.addObject("showUomExcelData", Arrays.asList(uom));
		}

		return modelAndView;
	}

	// 9.PDF files
	@RequestMapping("/pdf")
	public ModelAndView showPdf(@RequestParam(value = "id", required = false) Integer id) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setView(new UomPdfView());

		if (id == null) {
			// export all rows
			List<Uom> list = uomService.getAllUoms();
			modelAndView.addObject("showUomPdfData", list);
		} else {
			// export one row by id
			Uom uom = uomService.getOneUom(id);
			modelAndView.addObject("showUomPdfData", Arrays.asList(uom));
		}
		return modelAndView;
	}
	
	//10.JFreeCharts(PieChart,BarChart)
		@RequestMapping("/charts")
		public String showCharts() {
			List<Object[]> list=uomService.getUomTypeCount();
			String path=servletContext.getRealPath("/");
			uomChartsUtil.generatePieChart(path, list);
			uomChartsUtil.generateBarChart(path, list);
			return "UomCharts";
		}
}
