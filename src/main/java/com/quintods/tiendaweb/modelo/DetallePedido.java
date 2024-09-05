package com.quintods.tiendaweb.modelo;

import java.time.*;
import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter
@Setter
public class DetallePedido {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Hidden
	private int id;
	
	@ManyToOne
	(fetch=FetchType.LAZY,optional=true)
	@ReferenceView("vistaSimple")
	private Cliente cliente;
	
	private LocalDate fechaPedido;
	
	@ElementCollection
	@ListProperties("producto.id,producto.nombre,cantidad")
	Collection<Factura> Factura;
	
	
	@TextArea
	private String observacion;	

}
