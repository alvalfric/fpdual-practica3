package es.fpdual.springboot.request;

import lombok.Data;

@Data
public class UsuarioRequest {
	
	private String username;
	
	private String password;
	
	public UsuarioRequest() {
		super();
	}

	public UsuarioRequest(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

}
