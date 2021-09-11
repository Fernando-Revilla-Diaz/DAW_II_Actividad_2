package com.empresa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresa.entity.Medicamento;

public interface MedicamentoRepository extends JpaRepository<Medicamento, Integer>{
	
	// Métodos adicionales
	List<Medicamento> findByNombreLike(String nombre);
	
	List<Medicamento> findByStock(int stock);
	
}
