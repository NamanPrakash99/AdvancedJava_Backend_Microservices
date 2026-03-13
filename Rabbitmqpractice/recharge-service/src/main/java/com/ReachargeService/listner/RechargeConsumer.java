package com.ReachargeService.listner;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.ReachargeService.config.RabbitConfig;
import com.ReachargeService.dto.RechargeProducerdto;

@Component
public class RechargeConsumer {
	
	@RabbitListener(queues = RabbitConfig.Queue_Name)
	public void processRecharge(RechargeProducerdto dto) throws InterruptedException {
		System.out.println("message received from queue");
		System.out.println("Recharge processing for mobile "+dto.getMobilenumber());
		Thread.sleep(5000);
		System.out.println("Recharge done "+dto.getMobilenumber());
		

	}
}
