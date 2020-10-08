package com.wpaluno.cursowp;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.wpaluno.cursowp.domain.Categoria;
import com.wpaluno.cursowp.repository.CategoriaRepository;

@SpringBootApplication
// CommandLineRunner{ faz com que possamos executar um metodo auxiliar ao carregar a app.

public class CursowpApplication implements CommandLineRunner {

	@Autowired
	private CategoriaRepository categoriaRepository;

	public static void main(String[] args) {
		SpringApplication.run(CursowpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Categoria cat1 = new Categoria(null, "Informatica");
		Categoria cat2 = new Categoria(null, "Contabilidade");
		Categoria cat3 = new Categoria(null, "Suporte");

		categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3));

	}

}
