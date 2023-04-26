package es.fpdual.springboot.repositorio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import es.fpdual.springboot.modelo.Producto;

@Repository
public class RepositorioProductoImpl implements RepositorioProducto {

	private final List<Producto> productos = new ArrayList<>();

	@Override
	public Integer getSiguienteId() {
		return this.productos.isEmpty() ? 1 : this.productos.get(this.productos.size()-1).getId() + 1;
	}

	@Override
	public List<Producto> cargarProductos() {
		this.productos.add(new Producto(this.getSiguienteId(), "Teclado", 15, 12));
		this.productos.add(new Producto(this.getSiguienteId(), "Ratón", 7.99, 8));
		this.productos.add(new Producto(this.getSiguienteId(), "Monitor", 259, 2));
		this.productos.add(new Producto(this.getSiguienteId(), "Ordenador portatil", 890, 1));
		
		return this.productos;
	}

}
