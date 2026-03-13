package com.order_service.service;

import java.util.List;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

import com.order_service.entity.Order;
import com.order_service.repository.OrderRepository;

@Service
public class OrderService {

	private final OrderRepository orderRepository;
	private final RabbitTemplate rabbitTemplate;

	public OrderService(OrderRepository orderRepository, RabbitTemplate rabbitTemplate) {
		this.orderRepository = orderRepository;
		this.rabbitTemplate = rabbitTemplate;
	}

	public Order createOrder(Order order) {

		order.setStatus("CREATED");

		Order savedOrder = orderRepository.save(order);

		// send message to RabbitMQ
		rabbitTemplate.convertAndSend("bookQueue", savedOrder);

		return savedOrder;
	}

	public List<Order> getOrders() {
		return orderRepository.findAll();
	}

	public Order getOrder(Long id) {
		return orderRepository.findById(id).orElseThrow();
	}

	public Order updateOrder(Long id, Order order) {

		Order existing = orderRepository.findById(id).orElseThrow();

		existing.setBookId(order.getBookId());
		existing.setQuantity(order.getQuantity());
		existing.setTotalPrice(order.getTotalPrice());
		existing.setStatus(order.getStatus());

		return orderRepository.save(existing);
	}

	public void deleteOrder(Long id) {
		orderRepository.deleteById(id);
	}
}