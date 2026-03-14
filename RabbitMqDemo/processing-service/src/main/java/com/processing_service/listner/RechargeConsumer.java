package com.processing_service.listner;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.processing_service.DTO.RechargeProducerDTO;
import com.processing_service.ProcessingServiceApplication;
import com.processing_service.config.RabbitConfig;


@Component
public class RechargeConsumer {
	
	@RabbitListener(queues = RabbitConfig.Queue_Name)
	public void processRecharge(RechargeProducerDTO dto)  throws InterruptedException {
		System.out.println("message recieved from queue") ; 
		System.out.println("Recharge processing for mobile " + dto.getMobileNumber());
		if(dto.getAmount() < 0) {
			System.out.println("Due to the amount it is throwing the error ");
			throw new RuntimeException("Amount cannot be zero" + dto.getAmount()) ; 
		}
		else {
			Thread.sleep(5000);
			System.out.println("Recharge done" + dto.getMobileNumber());
		}
		
	}
}
