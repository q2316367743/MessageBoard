package com.qsd.messageboard.controller.admin;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description 
 * @Author Esion
 * @Data 2020年7月8日
 */
@Controller
@RequestMapping("admin")
public class IndexController {
	
	@GetMapping("")
	public String index() {
		return "admin/index";
	}
	
	@GetMapping("login")
	public String login(
			String username, 
			String password, 
			HttpServletRequest request, 
			Model model) {
		if(username == null || password == null) {
			return "admin/login";
		}else {
			if("admin".equals(username) && "admin".equals(password)) {
				request.getSession().setAttribute("admin", "admin");
				return "redirect:";
			}else {
				model.addAttribute("message", true);
				return "admin/login";
			}
		}
	}
	
	@GetMapping("exit")
	public String exit(HttpServletRequest request) {
		request.getSession().removeAttribute("admin");
		return "redirect:../";
	}
	
	@GetMapping("dashboard")
	public String dashboard() {
		return "admin/dashboard";
	}
	
	@GetMapping("message")
	public String message(Integer page, Integer limit, Model model) {
		return "admin/message";
	}
	
}
