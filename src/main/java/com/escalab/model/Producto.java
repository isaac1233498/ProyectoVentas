package com.escalab.model;

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
import javax.validation.constraints.Size;

@Entity
@Table(name = "producto")
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idProducto;
	
	@ManyToOne
	@JoinColumn(name = "idMarca", nullable = false, foreignKey = @ForeignKey(name = "FK_Marca"))
	private Marca marca;

	@Column(name = "descripcion", nullable = false, length = 300)
	private String descripcion;
	
	@Size(min = 1, max = 9, message = " Valor debe tener 9 caracteres")
	@Column(name = "valor", nullable = true, length = 9)
	private double valor;
	
	@Column(name = "producto", nullable = false, length = 50)
	private String producto;
	
	@OneToMany(mappedBy = "producto", cascade = { CascadeType.ALL }, orphanRemoval = true)
	
	private List<CompraProducto> compraProductos;

	public Integer getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public List<CompraProducto> getCompraProductos() {
		return compraProductos;
	}

	public void setCompraProductos(List<CompraProducto> compraProductos) {
		this.compraProductos = compraProductos;
	}

	
}
