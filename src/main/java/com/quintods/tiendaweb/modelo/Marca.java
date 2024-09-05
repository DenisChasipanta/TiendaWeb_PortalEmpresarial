package com.quintods.tiendaweb.modelo;

import javax.persistence.*;

import lombok.*;

@Embeddable
@Getter
@Setter
public class Marca {
	private String nombre;
	
	@Column(length=5)
	private String codigoMarca;

}
