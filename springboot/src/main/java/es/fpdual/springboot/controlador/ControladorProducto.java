package es.fpdual.springboot.controlador;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import es.fpdual.springboot.modelo.Producto;
import es.fpdual.springboot.request.ProductoRequest;
import es.fpdual.springboot.request.ProductoRequestMapper;
import es.fpdual.springboot.servicio.ServicioProducto;

@RestController
public class ControladorProducto {

	private ServicioProducto servicioProducto;
	
	@Autowired
	public ControladorProducto(ServicioProducto servicioProducto) {
		this.servicioProducto = servicioProducto;
	}
	
	@GetMapping("/cargarProductos")
	public List<Producto> cargarProductos() {
		System.out.println(new Date() + " - Cargando lista de productos.");
		return this.servicioProducto.cargarProductos();
	}

}
