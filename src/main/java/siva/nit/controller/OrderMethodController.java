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

import siva.nit.charts.OrderMethodCharts;
import siva.nit.model.OrderMethod;

import siva.nit.service.OrderMethodService;

import siva.nit.view.excel.OrderMethodExcelView;
import siva.nit.view.pdf.OrderMethodPdfView;

@Controller
@RequestMapping("/ordermethod")
public class OrderMethodController {
	@Autowired
	private OrderMethodService orderMethodService;
	@Autowired
	private ServletContext servletContext;
	@Autowired
	private OrderMethodCharts orderMethodCharts;
	
	
	// 1.Register Page
	@RequestMapping("/register")
	public String showOrderMethodRegisterPage(Model model) {
		model.addAttribute("orderMethod", new OrderMethod());
		return "OrderMethodRegister";
	}

	// 2.save method(UI to Controller)---DB(Insert)
	@RequestMapping(value = "/save", method =POST)
	public String saveOrderMethodRegister(@ModelAttribute OrderMethod orderMethod, Model model) {
		Integer id = orderMethodService.saveOrderMethod(orderMethod);
		String message = "orderMethod '" + id + "' has saved";
		model.addAttribute("saveOrderMethodRegisterData", message);
		model.addAttribute("orderMethod", new OrderMethod());   
		return "OrderMethodRegister";
	}
	// 3.gellAll Records method------DB(select)
	@RequestMapping("/all")
	public String fetchAllOrderMethods(Model model) {
		List<OrderMethod> list = orderMethodService.getAllOrderMethods();
		model.addAttribute("fetchAllOrderMethodsData", list);
		return "OrderMethodData";
	}
	
	// 4.delete method------DB(delete)
		@RequestMapping("/delete")
		public String deleteOrderMethodObject(@RequestParam("oid") Integer id, Model model) {
			orderMethodService.delectOrderMarhod(id);
			String message = "OrderMethod '" + id + "' is deleted";
			model.addAttribute("deleteOrderMethodObjectData", message);
			// fetch new Data
			/*
			 * String opr="DEL"; model.addAttribute("opr",opr);
			 */
			List<OrderMethod> list = orderMethodService.getAllOrderMethods();
			model.addAttribute("fetchAllOrderMethodsData", list);
			return "OrderMethodData";
		}

		// 5.One record Data edit method----DB(alter)
		@RequestMapping("/edit")
		public String showOrderMethodEditPage(@RequestParam("oid") Integer id, Model model) {
			OrderMethod orderMethodObj = orderMethodService.getOneOrderMethod(id);
			model.addAttribute("orderMethod", orderMethodObj);
			return "OrderMethodEdit";
		}

		// 6.Update Method--------DB(Update)
		@RequestMapping(value = "/update", method = POST)
		public String updateOrderMethodObject(@ModelAttribute OrderMethod orderMethod , Model model) {
			orderMethodService.updateOrderMethod(orderMethod);
			String message = "OrderMethod '" + orderMethod.getOrderMethodId() + "' Updated";
			model.addAttribute("updateOrderMethodObjectData", message);
			List<OrderMethod> list = orderMethodService.getAllOrderMethods();
			model.addAttribute("fetchAllOrderMethodsData", list);
			return "OrderMethodData";
		}

		// 7.fetch One Record Data
		@RequestMapping("/view")
		public String showOneOrderMethod(@RequestParam("oid") Integer id, Model model) {

			OrderMethod orderMethod = orderMethodService.getOneOrderMethod(id);
			model.addAttribute("showOneOrderMethodData", orderMethod);
			return "OrderMethodView";
		}

		// 8. Excel files
		@RequestMapping("/excel")
		public ModelAndView showExcel(@RequestParam(value = "id", required = false) Integer id) {
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setView(new OrderMethodExcelView());
			if (id == null) {
				// export all rows
				List<OrderMethod> list = orderMethodService.getAllOrderMethods();
				modelAndView.addObject("showOrderMethodExcelData", list);
			} else {
				// export one row by id
				OrderMethod orderMethod = orderMethodService.getOneOrderMethod(id);
				modelAndView.addObject("showOrderMethodExcelData", Arrays.asList(orderMethod));
			}

			return modelAndView;
		}

		// 9.PDF files
		@RequestMapping("/pdf")
		public ModelAndView showPdf(@RequestParam(value = "id", required = false) Integer id) {
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setView(new OrderMethodPdfView());

			if (id == null) {
				// export all rows
				List<OrderMethod> list = orderMethodService.getAllOrderMethods();
				modelAndView.addObject("showOrderMethodPdfData", list);
			} else {
				// export one row by id
				OrderMethod orderMethod = orderMethodService.getOneOrderMethod(id);
				modelAndView.addObject("showOrderMethodPdfData", Arrays.asList(orderMethod));
			}
			return modelAndView;
		}
		
		//10.JFreeCharts(PieChart,BarChart)
		@RequestMapping("/charts")
		public String showCharts() {
			List<Object[]> list=orderMethodService.getOrderMethodTypeCount();
			String path=servletContext.getRealPath("/");
			orderMethodCharts.generatePieChart(path, list);
			orderMethodCharts.generateBarChart(path, list);
			return "OrderMethodCharts";
		}
		

}
