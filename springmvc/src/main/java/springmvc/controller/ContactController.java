package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;

@Controller
public class ContactController {

	@RequestMapping(path = "/contact")
	public String showForm() {
		return "contact";
	}

	// @RequestParam("") will take the value from the parameter's name and assign it
	// to the variable.

	/*
	 * @RequestMapping(path = "/processform", method = RequestMethod.POST) public
	 * String form(@RequestParam(name = "name", required = true) String
	 * name, @RequestParam("email") String email,
	 * 
	 * @RequestParam("password") String password, Model model) { //
	 * System.out.println(name + "     " + email + "     " + password); User user =
	 * new User(); model.addAttribute("name",name);
	 * model.addAttribute("email",email); return "success"; }
	 */
	
	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String form(@ModelAttribute User user, Model model) {
		//	System.out.println(name + "     " + email + "     " + password);
		return "success";
	}
}
