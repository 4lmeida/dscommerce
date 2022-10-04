package com.devsuperior.dscommerce.services.exception;

public class ResourceNotFoundExeption extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public ResourceNotFoundExeption(String msg) {
		super(msg);
	}
}
