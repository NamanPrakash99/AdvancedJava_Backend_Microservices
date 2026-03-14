package com.recharge_service.config;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.config.SimpleRabbitListenerContainerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;

import java.util.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.amqp.rabbit.connection.ConnectionFactory;

@Configuration
public class RabbitConfig {
	
	public static final String Queue_Name="recharge.queue" ; 
	
	public static final String DLQ="recharge.dlq" ; // dead letter queue 
	
	
//	@Bean
//	public Queue queue() {
//		return new Queue(Queue_Name,true) ;
//	}
	
//	
	
//	@Bean
//	public RabbitTemplate rabbitTemplate(ConnectionFactory conn) {
//		RabbitTemplate rabbitTemplate = new RabbitTemplate(conn) ;
//		rabbitTemplate.setObservationEnabled(true);
//		return rabbitTemplate ;
//	}
//	
//	@Bean 
//	public SimpleRabbitListenerContainerFactory rabbitListnerContainerFacory(ConnectionFactory conn) {
//		SimpleRabbitListenerContainerFactory factory = new SimpleRabbitListenerContainerFactory() ;
//		factory.setConnectionFactory(conn);
//		factory.setObservationEnabled(true);
//		return factory ; 
//	}
	
	@Bean
	public Queue rechargeQueue() {
		HashMap<String,Object>  args = new HashMap<>() ;
		args.put("x-message-ttl", 10000) ; 
		args.put("x-dead-letter-exchange" , "") ;
		args.put("x-dead-letter-routing-key", DLQ) ; 
		return new Queue(Queue_Name , true , false ,false ,  args) ; 
	}
	
	@Bean
	public Queue deadLetterQueue() {
		return new Queue(DLQ,true) ;
	}
	
	
}
