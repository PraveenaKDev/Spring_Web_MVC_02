package in.praveena.controller;

import java.util.List;

import org.aspectj.weaver.patterns.ThisOrTargetAnnotationPointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import in.praveena.entities.Ticket;
import in.praveena.service.TicketService;

@Controller
@RequestMapping("/test")
public class TestController {
	@Autowired
	private TicketService ticketServ;
	
	
	@GetMapping("/Hi")
	@ResponseBody
	public String sayHi() {
		return "Hello Beautiful";
	}
	
	
	@GetMapping("/greet")
	public ModelAndView greetMsg(){
		ModelAndView mView=new ModelAndView();
		mView.addObject("msg","Welcome to the world of spring web mvc");
		mView.setViewName("index");
		return mView;
		
	}
	
		
	@GetMapping("/welcome")
	public String welcomeMsg(Model model) {
		model.addAttribute("msg","This is an alternate way of sending the response using Model object");
		return "index";
	}
	
	@GetMapping("/allTicketInfo")
	public ModelAndView getAllTickets(){
		ModelAndView mView=new ModelAndView();
		List<Ticket> allList= ticketServ.getAllTickets();
		mView.addObject("tickets",allList);
		mView.setViewName("allTicketsInfo");
		return mView;		
	}
	

}
