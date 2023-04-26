package es.fpdual.springboot.repositorio;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import es.fpdual.springboot.modelo.Usuario;

@Repository
public class RepositorioUsuarioImpl implements RepositorioUsuario {

	private final List<Usuario> usuarios = new ArrayList<>();

}
