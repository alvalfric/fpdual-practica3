package es.fpdual.springboot.servicio;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.fpdual.springboot.modelo.Producto;
import es.fpdual.springboot.repositorio.RepositorioProducto;

@Service
public class ServicioProductoImpl implements ServicioProducto {

	private RepositorioProducto repositorio;
	
	@Autowired
	public ServicioProductoImpl(RepositorioProducto repositorioProducto) {
		this.repositorio = repositorioProducto;
	}
	
	@Override
	public List<Producto> cargarProductos() {
		return this.repositorio.cargarProductos();
	}

}
