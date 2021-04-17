package com.bemyfriend.bmf.member.user.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("member/user/resume")
public class ResumeController {
	
	
	@GetMapping("list")
	public String ListResume() {
		
		return "member/user/listresume";
	}
	
	
	
	@GetMapping("create")
	public String createResume() {
		
		return "member/user/createresume";
	}
	
	
	@PostMapping("upload")
	@ResponseBody
	public String uploadResume(@RequestBody Map<String, String> resume
								, HttpSession session) {
	
		System.out.println(resume);
		
		return null;
	}
	
	

}
