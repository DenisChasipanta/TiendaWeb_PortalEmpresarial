package com.quintods.tiendaweb.modelo;

import java.math.*;
import java.time.*;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.calculators.*;

import lombok.*;

@Entity
@Getter
@Setter
public class Factura {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Hidden
	private int id;
	
	@Required
	@DefaultValueCalculator(CurrentLocalDateCalculator.class)
	private LocalDate fecha;
	
	@ManyToOne
	(fetch=FetchType.LAZY,optional=true)
	@ReferenceView("vistaSimple")
	private Cliente cliente;
	
	@TextArea
	private String observacion;
	
	@ManyToOne(fetch=FetchType.LAZY, optional=true)
    @DescriptionsList
    private Producto producto;
	
	
	@Stereotype("MONEY")
    public BigDecimal getPrecioConIva() {
        return producto != null ? producto.getPrecioTotalConIva() : BigDecimal.ZERO;
    }

}
