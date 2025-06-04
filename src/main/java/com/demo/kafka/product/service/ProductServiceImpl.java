package com.demo.kafka.product.service;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

import com.demo.kafka.model.Product;

@Service
public class ProductServiceImpl implements ProductService {
	KafkaTemplate<String, ProductCreatedEvent> kafkaTemplate;
	// Example method to create a product
	@Override
	public String createProduct(Product product) {
		String productId = generateProductId();
		ProductCreatedEvent productCreatedEvent = new ProductCreatedEvent(productId, product.getTitle(), product.getPrice(), product.getQuantity());
		kafkaTemplate.send("product-topic",productId, productCreatedEvent);
		CompletableFuture<SendResult<String, ProductCreatedEvent>> future=kafkaTemplate.send("product-topic",productId, productCreatedEvent);
		future.whenComplete((result,exception)->{
			if (exception != null) {
				System.out.println("Error while sending message to kafka"+exception.getMessage());
			} else {
				System.out.println("Message sent successfully"+result.getRecordMetadata());
			}
		});
		// Wait for the future to complete
		future.join();
		return productId;
	}

	private String generateProductId() {
		// TODO Auto-generated method stub
		return UUID.randomUUID().toString();
	}

}
