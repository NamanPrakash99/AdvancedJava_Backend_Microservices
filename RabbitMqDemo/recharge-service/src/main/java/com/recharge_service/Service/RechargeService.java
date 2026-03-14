package com.recharge_service.Service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

import com.recharge_service.DTO.RechargeProducerDTO;
import com.recharge_service.config.JsonConfig;
import com.recharge_service.config.RabbitConfig;
import java.util.*;

@Service
public class RechargeService {

    private final JsonConfig jsonConfig;
	Set<Integer> st = new HashSet<>() ;
	private  final RabbitTemplate  rabbit;
	public RechargeService(RabbitTemplate rabbit, JsonConfig jsonConfig) {
		this.rabbit = rabbit ;
		this.jsonConfig = jsonConfig;
	}
	public String sendRechargeStatus(RechargeProducerDTO dto) {
		if(!st.contains(dto.getId())) {
			st.add(dto.getId()) ;
			rabbit.convertAndSend(RabbitConfig.Queue_Name , dto);
			return "Message has been sent to the broker" ;
		}
		return "Message cannot be sent as this id exists" ; 
		
	}
}
