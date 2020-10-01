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
@Table(name = "idSupervisor")
public class Vendedor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idVendedor;
	
	@ManyToOne
	@JoinColumn(name = "id_supervisor", nullable = false, foreignKey = @ForeignKey(name = "FK_supervisor"))
	private Supervisor supervisor;
	
	@Size(min = 3, message = "Nombres debe tener minimo 3 caracteres")
	@Column(name = "nombre_vendedor", nullable = false, length = 70)
	private String nombre_vendedor;

	@Size(min = 9, max = 9, message = "Telefono debe tener 9 caracteres")
	@Column(name = "tel_vendedor", nullable = true, length = 9)
	private String tel_vendedor;

	public Integer getIdVendedor() {
		return idVendedor;
	}

	public void setIdVendedor(Integer idVendedor) {
		this.idVendedor = idVendedor;
	}

	public Supervisor getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(Supervisor supervisor) {
		this.supervisor = supervisor;
	}

	public String getNombre_vendedor() {
		return nombre_vendedor;
	}

	public void setNombre_vendedor(String nombre_vendedor) {
		this.nombre_vendedor = nombre_vendedor;
	}

	public String getTel_vendedor() {
		return tel_vendedor;
	}

	public void setTel_vendedor(String tel_vendedor) {
		this.tel_vendedor = tel_vendedor;
	}

	
}
