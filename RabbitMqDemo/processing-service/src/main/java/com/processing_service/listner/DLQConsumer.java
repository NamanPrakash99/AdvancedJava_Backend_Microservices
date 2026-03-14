package com.processing_service.listner;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.processing_service.DTO.RechargeProducerDTO;
import com.processing_service.config.RabbitConfig;

@Component
public class DLQConsumer {
	
	@RabbitListener(queues =  RabbitConfig.DLQ)
	public void readFailMessage(RechargeProducerDTO dto) {
		System.out.println("There is an error in the code" + dto.getAmount()) ; 
	}
}
