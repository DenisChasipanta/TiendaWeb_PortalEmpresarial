package com.quintods.tiendaweb.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter
@Setter
public class Pais {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Hidden
	private int id;
	
	@Column(length=10)
	private String nombre;
	

}
