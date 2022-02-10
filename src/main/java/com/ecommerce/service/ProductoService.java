package com.ecommerce.service;

import java.util.List;
import java.util.Optional;

import com.ecommerce.model.Producto;

public interface ProductoService {
	public Producto save(Producto producto);
	public Optional<Producto> get(Integer id);
	public void delete(Integer id);
	public List<Producto> findAll();
	public void update(Producto producto);

}
