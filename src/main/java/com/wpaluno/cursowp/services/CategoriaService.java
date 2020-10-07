package com.wpaluno.cursowp.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wpaluno.cursowp.domain.Categoria;
import com.wpaluno.cursowp.repository.CategoriaRepository;

@Service
public class CategoriaService {

	// Dependencia

	@Autowired
	private CategoriaRepository repo;

	public Categoria Busca(Integer id) {

		Optional<Categoria> obj = repo.findById(id);

		return obj.orElse(null);
	}

}
