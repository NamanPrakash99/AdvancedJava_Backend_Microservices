package com.ReachargeService.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ReachargeService.dto.RechargeProducerdto;
import com.ReachargeService.service.RechargeService;

@RestController
public class RechargeController {
	
	private RechargeService service;
	

	public RechargeController(RechargeService service) {
		this.service = service;
	}

	
	@PostMapping("/recharge")
	public String doRecharge(@RequestBody RechargeProducerdto dto) {
		return service.sendRechargeRequest(dto);
		
	}
}
