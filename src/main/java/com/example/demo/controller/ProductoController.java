package com.example.demo.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.example.demo.entity.Producto;
import com.example.demo.repository.ProductoRepository;
@Controller
public class ProductoController {
	
	@Autowired
	private ProductoRepository prod;
	
	@QueryMapping
	public List<Producto> listarProductos(){
		return prod.findAll();
	}
	
	/*
	@QueryMapping
	public Producto listarProductosId(@Argument String id) {
		return prod.findById(id).orElseTgrow(
				() -> new RuntimeException(String.format("Producto %s no encontrado", id))
				
				);
	}
*/
	@MutationMapping
	public Producto guardarProducto(@Argument Producto producto) {
		producto.setId_producto(UUID.randomUUID().toString());
		return prod.save(producto);
		
	}
	
}
