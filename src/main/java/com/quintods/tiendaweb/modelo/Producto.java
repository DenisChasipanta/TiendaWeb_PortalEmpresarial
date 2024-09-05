package com.quintods.tiendaweb.modelo;

import java.math.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter
@Setter
public class Producto {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Hidden
	private int id;
	
	@Column(length = 45)
	private String nombre;
	
	@Money
	private BigDecimal precio;
	
	// Método para calcular el precio total sin IVA
    public BigDecimal getPrecioTotalSinIva() {
        return precio.multiply(new BigDecimal(stock));
    }
    
    // Método para calcular el precio total con IVA
    public BigDecimal getPrecioTotalConIva() {
        BigDecimal precioTotal = getPrecioTotalSinIva();
        BigDecimal iva = new BigDecimal("0.15");
        return precioTotal.add(precioTotal.multiply(iva));
    }
	
	private int stock;
	
	
	@ManyToOne
	(fetch=FetchType.LAZY,optional=true)
	@DescriptionsList
	private Categoria categoria;
	
	@File
	private String imagen;

}
