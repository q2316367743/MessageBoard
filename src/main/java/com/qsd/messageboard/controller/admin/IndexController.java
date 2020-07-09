package com.qsd.messageboard.controller.admin;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qsd.messageboard.dao.TemporaryDao;
import com.qsd.messageboard.po.Temporary;

/**
 * @Description 
 * @Author Esion
 * @Data 2020年7月8日
 */
@Controller
@RequestMapping("admin")
public class IndexController {
	
	@Autowired
	private TemporaryDao temporaryDao;
	
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
		if (page == null) page = 1;
		if (limit == null) limit = 9;
		Page<Temporary> temporarys = temporaryDao.selectPage(new Page<>(page, limit), null);
		model.addAttribute("temporarys", temporarys);
		return "admin/message";
	}
	
}
