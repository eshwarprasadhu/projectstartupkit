package com.nous.project.template.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(HttpStatus.NOT_FOUND)
public class ProductNotPurchased extends RuntimeException {
	

	public ProductNotPurchased(String exception) {
		super(exception);
	}


}
