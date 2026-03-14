package com.recharge_service.controller;

import org.springframework.web.bind.annotation.*;

import com.recharge_service.DTO.RechargeProducerDTO;
import com.recharge_service.Service.RechargeService;

@RestController
public class RabbitController {
	
	private final RechargeService rs ;
	public RabbitController(RechargeService rs) {
		this.rs = rs ;
	}
	@PostMapping("/recharge")
	public String doRechar(@RequestBody RechargeProducerDTO dto) {
		return rs.sendRechargeStatus(dto) ;
	}
}
