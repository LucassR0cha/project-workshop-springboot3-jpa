package com.protxprts.demo.entities.enums;

public enum OrderStatus {

	WAITIGN_PAYMENT(1), PAID(2), SHIPPED(3), DELIVERED(4), CANCELED(5);

	// codigo do tipo enumerado
	private int code;

	private OrderStatus(int code) {
		this.code = code;
	}

	// criando metodo para deixar visivel aos pacotes
	public int getCode() {
		return code;
	}

	// metodo estatico para converter um valor
	// numerico para o tipo enumerado
	public static OrderStatus valueOf(int cod) {
		for (OrderStatus value : OrderStatus.values()) {
			if (value.getCode() == cod) {
				return value;
			}
		}
		throw new IllegalArgumentException("Codigo OrderStatus Invalido");
	}
}
