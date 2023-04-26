package es.fpdual.springboot.controlador;

import java.util.Date;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import es.fpdual.springboot.modelo.Usuario;
import es.fpdual.springboot.request.UsuarioRequest;
import es.fpdual.springboot.request.UsuarioRequestMapper;
import es.fpdual.springboot.servicio.ServicioUsuario;

@RestController
public class ControladorUsuario {

	private ServicioUsuario servicioUsuario;

	@Autowired
	public ControladorUsuario(ServicioUsuario servicioUsuario) {
		this.servicioUsuario = servicioUsuario;
	}

}
