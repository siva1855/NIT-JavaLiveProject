package siva.nit.controller;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import siva.nit.model.WhUserType;
import siva.nit.service.WhUserTypeService;
import siva.nit.view.excel.WhUserTypeExcelView;
import siva.nit.view.pdf.WhUserTypePdfView;

@Controller
@RequestMapping("/whusertype")
public class WhUserTypeController {

	@Autowired
	private WhUserTypeService whUserTypeServcie;

	// 1.Register Page
	@RequestMapping("/register")
	public String showRegisterPage(Model model) {
		model.addAttribute("whUserType", new WhUserType());
		return "WhUserTypeRegister";
	}

	// 2.save method(UI to Controller)---DB(Insert)
	@RequestMapping(value = "/save", method = POST)
	public String saveWhUserTypeRegister(@ModelAttribute WhUserType whUserType, Model model) {
		Integer id = whUserTypeServcie.saveWhUserType(whUserType);
		String message = "WhUserType '" + id + "' has Saved";
		model.addAttribute("saveWhUserTypeRegisterData", message);
		model.addAttribute("whUserType", new WhUserType());
		return "WhUserTypeRegister";
	}

	// 3.gellAll Records method------DB(select)
	@RequestMapping(value = "/all")
	public String fetchAllWhUserTypes(Model model) {
		List<WhUserType> whUserTypeList = whUserTypeServcie.getAllWhUserTypes();
		model.addAttribute("fetchAllWhUserTypesData", whUserTypeList);
		return "WhUserTypeData";
	}

	// 4.delete method------DB(delete)
	@RequestMapping("/delete")
	public String deleteWhUserTypeObject(@RequestParam("wid") Integer id, Model model) {
		whUserTypeServcie.deleteWhUserType(id);
		String messgae = "WhUserType '" + id + "' has Deleted";
		model.addAttribute("deleteWhUserTypeTypeObjectData", messgae);
		// fetch new Data
		List<WhUserType> whUserTypeList = whUserTypeServcie.getAllWhUserTypes();
		model.addAttribute("fetchAllWhUserTypesData", whUserTypeList);
		return "WhUserTypeData";
	}

	// 5.One record Data edit method----DB(alter)
	@RequestMapping("/edit")
	public String showWhUserTypeEditPage(@RequestParam("wid") Integer id, Model model) {
		WhUserType whUserTypeObj = whUserTypeServcie.getOneWhUserType(id);
		model.addAttribute("whUserType", whUserTypeObj);
		return "WhUserTypeEdit";
	}

	// 6.Update Method--------DB(Update)
	@RequestMapping(value = "/update", method = POST)
	public String updateWhUserTypeObject(@ModelAttribute WhUserType whUserType, Model model) {
		whUserTypeServcie.updateWhUserType(whUserType);
		String message = "WhUserType '" + whUserType.getWhUserTypeId() + "' Updated";
		model.addAttribute("updateShipmentTypeObjectData", message);
		List<WhUserType> list = whUserTypeServcie.getAllWhUserTypes();
		model.addAttribute("fetchAllWhUserTypesData", list);
		return "WhUserTypeData";
	}

	// 7.fetch One Record Data
	@RequestMapping("/view")
	public String showOneShipmentTypeObject(@RequestParam("wid") Integer id, Model model) {

		WhUserType whUserType = whUserTypeServcie.getOneWhUserType(id);
		model.addAttribute("showOneWhUserTypeObjectData", whUserType);
		return "WhUserTypeView";
	}

	// 8. Excel files
	@RequestMapping("/excel")
	public ModelAndView showExcel(@RequestParam(value = "id", required = false) Integer id) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setView(new WhUserTypeExcelView());
		if (id == null) {
			// export all rows
			List<WhUserType> list = whUserTypeServcie.getAllWhUserTypes();
			modelAndView.addObject("showWhUserTypeExcelData", list);
		} else {
			// export one row by id
			WhUserType whUserType = whUserTypeServcie.getOneWhUserType(id);
			modelAndView.addObject("showWhUserTypeExcelData", Arrays.asList(whUserType));
		}

		return modelAndView;
	}

	// 9.PDF files
	@RequestMapping("/pdf")
	public ModelAndView showPdf(@RequestParam(value = "id", required = false) Integer id) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setView(new WhUserTypePdfView());

		if (id == null) {
			// export all rows
			List<WhUserType> list = whUserTypeServcie.getAllWhUserTypes();
			modelAndView.addObject("showWhUserTypePdfData", list);
		} else {
			// export one row by id
			WhUserType whUserType = whUserTypeServcie.getOneWhUserType(id);
			modelAndView.addObject("showWhUserTypePdfData", Arrays.asList(whUserType));
		}
		return modelAndView;
	}

}
