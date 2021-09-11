package com.empresa.service;

import java.util.List;
import java.util.Optional;

import com.empresa.entity.Medicamento;

public interface MedicamentoService {

	public abstract Optional<Medicamento> buscarMedicamentoID(int idMedicamento);
	
	public abstract List<Medicamento> findByNombreLike(String nombre);
	
	public abstract List<Medicamento> fidnByStock(int stock);
}
