package es.fpdual.springboot.repositorio;

import java.util.List;

import es.fpdual.springboot.modelo.Producto;

public interface RepositorioProducto {
	
	public List<Producto> cargarProductos();
	
	public Integer getSiguienteId();

}
