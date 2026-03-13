package com.book_service.Listner;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.book_service.dto.OrderDto;
import com.book_service.service.BookService;

@Component
public class OrderConsumer {
	private final BookService bookService;

	public OrderConsumer(BookService bookService) {
		this.bookService = bookService;
	}

	@RabbitListener(queues = "bookQueue")
	public void consume(OrderDto order) {

		bookService.reduceStock(Math.toIntExact(order.getBookId()), order.getQuantity());

		System.out.println("Stock updated for book " + order.getBookId());
	}
}
