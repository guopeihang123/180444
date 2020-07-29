package com.gph.Controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gph.Serivce.UserSerivce;
import com.gph.bean.User;

@Controller
public class UserController {

	@Resource
	public UserSerivce us;
	@RequestMapping("list")
	public String list(Model model) {
		List<User> list = us.sel();
		model.addAttribute("list", list);
		return "list";
		
	}
}
