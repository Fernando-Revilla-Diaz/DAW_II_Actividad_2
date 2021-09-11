package com.empresa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Medicamento")
public class Medicamento {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idMedicamento;
	
	private String nombre;
	
	private double precio;
	
	private int stock;
	
	private String laboratorio;
	
}
