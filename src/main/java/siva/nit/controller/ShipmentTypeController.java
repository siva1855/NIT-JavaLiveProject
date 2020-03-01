package siva.nit.controller;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import siva.nit.model.ShipmentType;
import siva.nit.service.ShipmentTypeService;
import siva.nit.util.ShipmentTypeChartsUtil;
import siva.nit.view.excel.ShipmentTypeExcelView;
import siva.nit.view.pdf.ShipmentTypePdfView;

@Controller
@RequestMapping("/shipmenttype")
public class ShipmentTypeController {

	@Autowired
	private ShipmentTypeService shipmentTypeService;
	@Autowired
	private ServletContext servletContext;
	@Autowired
	private ShipmentTypeChartsUtil shipmentTypeChartsUtil;

	// 1.Register Page
	@RequestMapping("/register")
	public String showShipmentTypeRegisterPage(Model model) {
		model.addAttribute("shipmentType", new ShipmentType());
		return "ShipmentTypeRegister";
	}

	// 2.save method(UI to Controller)---DB(Insert)
	@RequestMapping(value = "/save", method = POST)
	public String saveShipmentTypeRegister(@ModelAttribute ShipmentType shipmentType, Model model) {

		Integer id = shipmentTypeService.saveShipmentType(shipmentType);
		String message = "ShipmentType :" + id + " saved";
		model.addAttribute("shipmentMessage", message);
		model.addAttribute("shipmentType", new ShipmentType());
		return "ShipmentTypeRegister";
	}

	// 3.gellAll Records method------DB(select)
	@RequestMapping("/all")
	public String fetchAllShipmentTypes(Model model) {
		List<ShipmentType> list = shipmentTypeService.getAllShipmentTypes();
		model.addAttribute("listData", list);
		return "ShipmentTypeData";
	}

	// 4.delete method------DB(delete)
	@RequestMapping("/delete")
	public String deleteShipmentTypeData(@RequestParam("sid") Integer id, Model model) {
		shipmentTypeService.delectShipmentType(id);
		String message = "ShipmentType '" + id + "' is deleted";
		model.addAttribute("messageData", message);
		// fetch new Data
		List<ShipmentType> list = shipmentTypeService.getAllShipmentTypes();
		model.addAttribute("listData", list);
		return "ShipmentTypeData";
	}

	// 5.One record Data edit method----DB(alter)
	@RequestMapping("/edit")
	public String showShipmentTypeEditPage(@RequestParam("sid") Integer id, Model model) {
		ShipmentType shipmentTypeObj = shipmentTypeService.getOneShipmentType(id);
		model.addAttribute("shipmentType", shipmentTypeObj);
		return "ShipmentTypeEdit";
	}

	// 6.Update Method--------DB(Update)
	@RequestMapping(value = "/update", method = POST)
	public String updateShipmentTypeObject(@ModelAttribute ShipmentType shipmentType, Model model) {
		shipmentTypeService.updateShipmentType(shipmentType);
		String message = "ShipmemtType '" + shipmentType.getShipmentTypeId() + "' Updated";
		model.addAttribute("updateMessage", message);
		List<ShipmentType> list = shipmentTypeService.getAllShipmentTypes();
		model.addAttribute("listData", list);
		return "ShipmentTypeData";
	}

	// 7.fetch One Record Data
	@RequestMapping("/view")
	public String showOneShipmentType(@RequestParam("sid") Integer id, Model model) {

		ShipmentType shipmentType = shipmentTypeService.getOneShipmentType(id);
		model.addAttribute("showOneShipmentTypeData", shipmentType);
		return "ShipmentTypeView";
	}

	// 8. Excel files
	@RequestMapping("/excel")
	public ModelAndView showExcel(@RequestParam(value = "id", required = false) Integer id) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setView(new ShipmentTypeExcelView());
		if (id == null) {
			// export all rows
			List<ShipmentType> list = shipmentTypeService.getAllShipmentTypes();
			modelAndView.addObject("showShipmentTypeExcelData", list);
		} else {
			// export one row by id
			ShipmentType shipmentType = shipmentTypeService.getOneShipmentType(id);
			modelAndView.addObject("showShipmentTypeExcelData", Arrays.asList(shipmentType));
		}

		return modelAndView;
	}

	// 9.PDF files
	@RequestMapping("/pdf")
	public ModelAndView showPdf(@RequestParam(value = "id", required = false) Integer id) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setView(new ShipmentTypePdfView());

		if (id == null) {
			// export all rows
			List<ShipmentType> list = shipmentTypeService.getAllShipmentTypes();
			modelAndView.addObject("showShipmentTypePdfData", list);
		} else {
			// export one row by id
			ShipmentType shipmentType = shipmentTypeService.getOneShipmentType(id);
			modelAndView.addObject("showShipmentTypePdfData", Arrays.asList(shipmentType));
		}
		return modelAndView;
	}
	//9.JFreeCharts(PieChart,BarChart)
	@RequestMapping("/charts")
	public String showCharts() {
		List<Object[]> list=shipmentTypeService.getShipmentTypeModeCount();
		String path=servletContext.getRealPath("/");
		shipmentTypeChartsUtil.generatePieChart(path, list);
		shipmentTypeChartsUtil.generateBarChart(path, list);
		return "ShipmentTypeCharts";
	}
	
}
