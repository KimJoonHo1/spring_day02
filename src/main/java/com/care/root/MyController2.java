package com.care.root;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController2 {
	@RequestMapping(value="/member/index")
	public String memberIndex(Model model) {
		model.addAttribute("req", "기본 페이지 입니다.");
		return "/member02/index";
	}
	
	@RequestMapping(value="/member/login")
	public String memberLogin(Model model) {
		model.addAttribute("login", "로그인 페이지 입니다.");
		return "/member02/login";
	}
	
	@RequestMapping(value="/member/logout")
	public String memberLogout() {
		return "member02/logout";
	}
}
