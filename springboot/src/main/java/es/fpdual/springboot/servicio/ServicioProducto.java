package es.fpdual.springboot.servicio;

import java.util.List;

import es.fpdual.springboot.modelo.Producto;

public interface ServicioProducto {
	
	public List<Producto> cargarProductos();
	
}
