package com.ReachargeService.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

import com.ReachargeService.config.RabbitConfig;
import com.ReachargeService.dto.RechargeProducerdto;

@Service
public class RechargeService {
	public Set<String> set=new HashSet<>();
	

	
	private final RabbitTemplate rabbitTemplate;

	public RechargeService(RabbitTemplate rabbitTemplate) {
		this.rabbitTemplate=rabbitTemplate;
	}
	
	
	public String sendRechargeRequest(RechargeProducerdto request) {
		
		if(set.contains(request.getMobilenumber())) {
			return "Already request was done";
		}
		set.add(request.getMobilenumber());
		rabbitTemplate.convertAndSend(RabbitConfig.Queue_Name, request);
		return "Message has been send to broker";
	}
}
