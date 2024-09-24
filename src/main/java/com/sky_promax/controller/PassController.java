package com.sky_promax.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sky_promax.dto.PassDto;
import com.sky_promax.entity.Pass;
import com.sky_promax.service.PassService;
import com.sky_promax.utils.PassEmailSevice;

@Controller
public class PassController {
	@Autowired
	private PassService passSer;
	@Autowired
	private PassEmailSevice passemail;
	
	
	@RequestMapping("/view")
	public String view() {
		return "view";
	}
	
	@RequestMapping("/save")
	public String PassData(Pass pass) {
		passSer.PassSave(pass);
		passemail.PassengerEmailService(pass.getEmail(), "From SKY PROMAX ","Thank you for choosing our airlines");
		return "view";
	}
	@RequestMapping("/listall")
    public String ListAllPass(Pass pass,ModelMap map) {
		List<Pass>passdata= passSer.ListSavePass(pass);
		map.addAttribute("passdata",passdata); 
		return "listall";
    	
    }
	@RequestMapping("/deletepass") 
	public String deletepass(@RequestParam("id")long id,Pass pass,ModelMap map) {
		passSer.delelepassId(id);
		List<Pass>passdata= passSer.ListSavePass(pass);
		map.addAttribute("passdata",passdata); 
		return "listall";
		
	}
	@RequestMapping("/updatepass")
	public String updatepass(@RequestParam("id")long id,Pass pass,ModelMap map) {
		Pass passde = passSer.updatePassDet(id);
		map.addAttribute("passde",passde);
		return "update";
		
	}
	@RequestMapping("/updatepassdata")
	public String updatepass(PassDto passdto,ModelMap map,Pass pass) {
		passSer.UpdatePassengerInfo(passdto);
		List<Pass>passdata= passSer.ListSavePass(pass);
		map.addAttribute("passdata",passdata); 
		return "listall";
		
	}
}
