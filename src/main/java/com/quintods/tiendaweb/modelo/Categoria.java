package com.quintods.tiendaweb.modelo;

import javax.persistence.*;

import lombok.*;

@Entity
@Getter
@Setter
public class Categoria {
	@Id
	private String codigo;
	
	@Column(length = 10)
	private String descripcion;
	
	@Embedded
	Marca marca;

}
