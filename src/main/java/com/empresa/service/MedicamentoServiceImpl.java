package com.empresa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Medicamento;
import com.empresa.repository.MedicamentoRepository;

@Service
public class MedicamentoServiceImpl implements MedicamentoService{

	// Instancia del repositorio
	@Autowired
	private MedicamentoRepository medicamentoRepository;

	@Override
	public Optional<Medicamento> buscarMedicamentoID(int idMedicamento) {
		return medicamentoRepository.findById(idMedicamento);
	}

	@Override
	public List<Medicamento> findByNombreLike(String nombre) {
		return medicamentoRepository.findByNombreLike(nombre);
	}

	@Override
	public List<Medicamento> fidnByStock(int stock) {
		return medicamentoRepository.findByStock(stock);
	}
	
}
