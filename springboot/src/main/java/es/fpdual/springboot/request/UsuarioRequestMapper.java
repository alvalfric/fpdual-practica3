package es.fpdual.springboot.request;

import es.fpdual.springboot.modelo.Usuario;

public class UsuarioRequestMapper {

	public static Usuario toUsuario(UsuarioRequest usuarioRequest) {
		return new Usuario(usuarioRequest.getUsername(), usuarioRequest.getPassword());
	}
}
