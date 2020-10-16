package com.escalab.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;



@Entity
@Table(name = "producto")
public class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idProducto;
	
	@ManyToOne
	@JoinColumn( name = "id_marca", nullable = false , foreignKey = @ForeignKey(name = "FK_producto_marca"))
	private Marca marca;
	
	@Size(min = 3, message = "Nombres debe tener minimo 3 caracteres")
	@Column(name = "descripcion", nullable = false, length = 70)
	private String descripcion;
	
	@Size(min = 1, max = 9, message = "Valor debe tener minimo 1 caracteres")
	@Column(name = "valor", nullable = true, length = 9)
	private double valor;

	@Size(min = 3, max = 30, message = "Producto debe tener 30 caracteres")
	@Column(name = "producto", nullable = true, length = 30)
	private String producto;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idProducto == null) ? 0 : idProducto.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		if (idProducto == null) {
			if (other.idProducto != null)
				return false;
		} else if (!idProducto.equals(other.idProducto))
			return false;
		return true;
	}
	
}
