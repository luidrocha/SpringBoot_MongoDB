package com.wpaluno.cursowp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wpaluno.cursowp.domain.Categoria;

// 
@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
