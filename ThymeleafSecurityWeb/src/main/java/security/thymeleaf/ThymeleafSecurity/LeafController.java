package security.thymeleaf.ThymeleafSecurity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LeafController 
{
	@Autowired
	RepoHub serv;
	
	List<Hub> got;
	
	@RequestMapping("/list")
	public String list(Model model)
	{
		System.out.println("Controller invoked");
		got=serv.findAll();
		model.addAttribute("record", got);
		System.out.println(got+" will be forwarded to page");
		//return new ModelAndView("index").addObject("record", got);
		return "list";
	}
	
}
