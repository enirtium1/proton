package com.eim.ms.product.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.eim.ms.common.model.product.Product;

@RestController
public class ProductServiceImpl {

	@GetMapping(value = "/product/{productId}", produces = "application/json")
	Product getProduct(@PathVariable int productId) {
		// LOG.debug("/product return the found product for productId={}", productId);

		if (productId < 1) {
			throw new RuntimeException("Invalid productId: " + productId);
		}

		if (productId > 20) {
			throw new RuntimeException("No product found for productId: " + productId);
		}

		return new Product(productId, "name-" + productId, 99);
	}
}
