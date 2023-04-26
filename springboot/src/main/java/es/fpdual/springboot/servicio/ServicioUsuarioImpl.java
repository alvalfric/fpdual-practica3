package es.fpdual.springboot.servicio;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.fpdual.springboot.modelo.Producto;
import es.fpdual.springboot.modelo.Usuario;
import es.fpdual.springboot.repositorio.RepositorioUsuario;

@Service
public class ServicioUsuarioImpl implements ServicioUsuario {

	private RepositorioUsuario repositorio;

	private ServicioProducto servicioProducto;

	@Autowired
	public ServicioUsuarioImpl(RepositorioUsuario repositorioUsuario, ServicioProducto servicioProducto) {
		this.repositorio = repositorioUsuario;
		this.servicioProducto = servicioProducto;
	}

}
