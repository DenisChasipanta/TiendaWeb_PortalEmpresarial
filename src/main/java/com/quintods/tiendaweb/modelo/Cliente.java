package com.quintods.tiendaweb.modelo;

import java.time.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter
@Setter
@View(name="vistaSimple",
         members="id,nombre,apellido;"
		)
public class Cliente {
	@Id
	@GeneratedValue( strategy=GenerationType.IDENTITY)
	@Hidden
	private int id;
	
	@Column (length = 10 )
	private String nombre;
	
	@Column (length = 10 )
	private String apellido;
	
	@Column (length = 10 )
	private String telefono;
	
	private String email;
	
	private LocalDate fechaRegistro;

}
