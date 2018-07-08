package controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/loginSubmit")
public class LoginController {

	@RequestMapping(method = RequestMethod.POST)
	public String confirm(ModelMap modelMap, HttpServletRequest request){
	
	// get parameters
	
	String userInput = request.getParameter("username");
	String passInput = request.getParameter("password");
	
	// business logic
	
	System.out.println("username is " + userInput+ " and password is: " +passInput);
	modelMap.addAttribute("name", userInput);

	HttpSession session = request.getSession();
	//return type
	if (userInput.equals(session.getAttribute("username"))&& passInput.equals(session.getAttribute("password"))){
	return "success";
	}else
		return "login";
	}
}
