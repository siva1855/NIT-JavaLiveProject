package siva.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import siva.nit.model.OrderMethod;
import siva.nit.service.OrderMethodService;

@Controller
@RequestMapping("/ordermethod")
public class OrderMethodController {
	@Autowired
	private OrderMethodService orderMethodService;

	// 1.Register Page
	@RequestMapping("/register")
	public String showOrderMethodRegisterPage(Model model) {
		model.addAttribute("orderMethod", new OrderMethod());
		return "OrderMethodRegister";
	}

	// 2.save method(UI to Controller)---DB(Insert)
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveOrderMethodRegister(@ModelAttribute OrderMethod orderMethod, Model model) {
		Integer id = orderMethodService.saveOrderMethod(orderMethod);
		String message = "orderMethod '" + id + "' has saved";
		model.addAttribute("saveOrderMethodRegisterData", message);
		return "OrderMethodRegister";
	}
	// 3.gellAll Records method------DB(select)
	@RequestMapping("/all")
	public String fetchAllOrderMethods(Model model) {
		List<OrderMethod> list = orderMethodService.getAllOrderMethods();
		model.addAttribute("fetchAllOrderMethodsData", list);
		return "OrderMethodData";
	}

}
