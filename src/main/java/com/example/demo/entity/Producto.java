package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name= "producto")
@Data
public class Producto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "id_producto")
	private int id_producto;
	
	private String nombre;
	private String stock;
	private String precio;
	private String tipo;
	private String fechaPro;
	public void setId_producto(String string) {
		// TODO Auto-generated method stub
		
	}
	

}
