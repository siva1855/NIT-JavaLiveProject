package siva.nit.controller;

import static org.springframework.web.bind.annotation.RequestMethod.POST;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import siva.nit.model.WhUserType;
import siva.nit.service.WhUserTypeService;

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
		Integer id=whUserTypeServcie.saveWhUserType(whUserType);
		String message="WhUserType '"+id+"' has Saved";
		model.addAttribute("saveWhUserTypeRegisterData",message);
		model.addAttribute("whUserType", new WhUserType());
		return "WhUserTypeRegister";
	}
}
