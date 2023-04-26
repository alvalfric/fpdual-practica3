package es.fpdual.springboot.modelo;

import lombok.Data;

@Data
public class Producto {

	private final Integer id;
	
	private final String nombre;
	
	private final Double precio;
	
	private final Integer cantidad;

	public Producto(String nombre, Double precio, Integer cantidad) {
		this(null, nombre, precio, cantidad);
	}
	
	public Producto(Integer id, String nombre, Double precio, Integer cantidad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
	}
	
	public Producto(Integer id, String nombre, Integer precio, Integer cantidad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = Double.valueOf(precio);
		this.cantidad = cantidad;
	}

}
