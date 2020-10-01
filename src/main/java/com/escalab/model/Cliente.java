package com.escalab.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCliente;
	
	@Size(min = 3, message = "Nombres debe tener minimo 3 caracteres")
	@Column(name = "nombre_cliente", nullable = false, length = 70)
	private String nombre_cliente;
	
	@Size(min = 3, max = 150, message = "Dirección debe tener minimo 3 caracteres")
	@Column(name = "dir_cliente", nullable = true, length = 150)
	private String dir_cliente;

	@Size(min = 9, max = 9, message = "Telefono debe tener 9 caracteres")
	@Column(name = "tel_cliente", nullable = true, length = 9)
	private String tel_cliente;

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombre_cliente() {
		return nombre_cliente;
	}

	public void setNombre_cliente(String nombre_cliente) {
		this.nombre_cliente = nombre_cliente;
	}

	public String getDir_cliente() {
		return dir_cliente;
	}

	public void setDir_cliente(String dir_cliente) {
		this.dir_cliente = dir_cliente;
	}

	public String getTel_cliente() {
		return tel_cliente;
	}

	public void setTel_cliente(String tel_cliente) {
		this.tel_cliente = tel_cliente;
	}

}
