package edu.poly.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import edu.poly.spring.dtos.AdminDTO;
import edu.poly.spring.models.Admin;

@Controller
public class QuanLyController {
	@PostMapping("/update")
	public String add(ModelMap model,AdminDTO quanLy) {
		
		model.addAttribute("quanLyDTO",quanLy);
		return "quanly/Edit";
	}
}
	