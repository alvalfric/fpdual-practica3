package es.fpdual.springboot.request;

import lombok.Data;

@Data
public class ProductoRequest {
	
	private String nombre;
	
	private Double precio;
	
	private Integer cantidad;

	public ProductoRequest() {
		super();
	}

	public ProductoRequest(String nombre, Double precio, Integer cantidad) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
	}

}
