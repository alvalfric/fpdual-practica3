package es.fpdual.springboot.request;

import es.fpdual.springboot.modelo.Producto;

public class ProductoRequestMapper {

	public static Producto toProducto(ProductoRequest productoRequest) {
		return new Producto(productoRequest.getNombre(), productoRequest.getPrecio(), productoRequest.getCantidad());
	}
}
