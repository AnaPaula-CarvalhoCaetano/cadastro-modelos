package com.cadastro.modelos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cadastro.modelos.models.Modelos;

public interface ModelosRepository extends JpaRepository<Modelos, Long>{
	
	Modelos findById(long id);

}
