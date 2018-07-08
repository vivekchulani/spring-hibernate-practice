package controllers;

import hibernate.Users;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import business.IDAODelegate;

@Controller
@RequestMapping("/registerSubmit")
public class RegisterController {
	@Autowired
	IDAODelegate dd; 
	@Autowired
	Users users;


	@RequestMapping(method = RequestMethod.POST)
	public String register(ModelMap modelMap, HttpServletRequest request) {

		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String email = request.getParameter("email");
		String user = request.getParameter("username");
		String pass = request.getParameter("password");

		users.setUsername(user);
		users.setPassword(pass);
		users.setFname(fname);
		users.setLname(lname);
		users.setEmail(email);

		System.out.println(users.getFname());
		
		dd.addUsers(users);

		HttpSession session = request.getSession();
		session.setAttribute("username", user);
		session.setAttribute("password", pass);

		return "login";
	}
}
