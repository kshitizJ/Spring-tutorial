package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.format.datetime.joda.LocalDateTimeParser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	// @RequestMapping() will simply tell what we will see after passing the /home
	// to our url and the return type of the method is the name of the page which is
	// linked to the url and will show the content when we navigate to that url
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String home(Model model) {
		// you can set n number of attributes and get all the attributes in .jsp pages
		model.addAttribute("name", "Kshitiz Jain");
		model.addAttribute("id", 19102015);
		List<String> friends = new ArrayList<String>();
		friends.add("Nidhi");
		friends.add("Omkar");
		friends.add("Soumyo");
		model.addAttribute("friends", friends);
		System.out.println("This is working..");
		return "index";
	}

	@RequestMapping("/about")
	public String about() {
		return "about";
	}

	@RequestMapping("/help")
	public ModelAndView help() {
		LocalDateTime localDateTime = LocalDateTime.now();
		List<Integer> marks = new ArrayList<Integer>();

		marks.add(45);
		marks.add(69);
		marks.add(98);

		// creating ModelAndView Object for passing the data from controller to view
		ModelAndView modelAndView = new ModelAndView();

		// setting the data
		modelAndView.addObject("name", "Kshitiz");
		modelAndView.addObject("date", localDateTime);
		modelAndView.addObject("marks", marks);

		// setting the view name
		modelAndView.setViewName("help");

		return modelAndView;
	}
}