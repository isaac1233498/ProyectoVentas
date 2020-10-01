package com.escalab.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
//import javax.validation.constraints.Size;

@Entity
@Table(name = "venta")
public class Venta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idVenta;
	
	@ManyToOne
	@JoinColumn(name = "id_vendedor", nullable = false, foreignKey = @ForeignKey(name = "PK_vendedor "))
	private Vendedor vendedor;

	@ManyToOne
	@JoinColumn(name = "id_clienter", nullable = false, foreignKey = @ForeignKey(name = "PK_cliente "))
	private Cliente cliente;
	
	@OneToMany(mappedBy = "producto", cascade = {CascadeType.ALL},orphanRemoval = true)
	private List<CompraProducto> CompraProducto;
	
	@Column(name = "costo", nullable = true, length = 9)
	private double costo;

	private LocalDateTime fecha;

	public Integer getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(Integer idVenta) {
		this.idVenta = idVenta;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<CompraProducto> getCompraProducto() {
		return CompraProducto;
	}

	public void setCompraProducto(List<CompraProducto> compraProducto) {
		CompraProducto = compraProducto;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	
}
