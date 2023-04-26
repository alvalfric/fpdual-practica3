package es.fpdual.springboot.modelo;

import java.util.List;

import lombok.Data;

@Data
public class Usuario {

	private final Integer id;

	private final String username;

	private final String password;

	private List<Producto> carrito;

	private List<Producto> productosComprados;

	public Usuario(String username, String password) {
		this(null, username, password, null, null);
	}

	public Usuario(Integer id, String username, String password, List<Producto> carrito,
			List<Producto> productosComprados) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.carrito = carrito;
		this.productosComprados = productosComprados;
	}

}
