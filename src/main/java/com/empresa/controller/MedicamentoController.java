package com.empresa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.empresa.entity.Medicamento;
import com.empresa.service.MedicamentoService;

@Controller
@RequestMapping("rest/medicamento")
public class MedicamentoController {
	
	@Autowired
	private MedicamentoService medicamentoService; 

	@GetMapping("/id/{idMedicamento}")
	@ResponseBody
	public ResponseEntity<Medicamento> buscarMedicamentoId(@PathVariable int idMedicamento){
		Optional<Medicamento> objSalida = medicamentoService.buscarMedicamentoID(idMedicamento);
		
		if (objSalida.isPresent()) {
			return ResponseEntity.ok(objSalida.get());
		} else {
			return ResponseEntity.badRequest().build();
		}
	}
	
	@GetMapping("/nombre/{nombreMedicamento}")
	@ResponseBody
	public ResponseEntity<List<Medicamento>> buscarMedicamnetoNombre(@PathVariable String nombreMedicamento){
		List<Medicamento> medicamentos = medicamentoService.findByNombreLike(nombreMedicamento);
		
		if (!CollectionUtils.isEmpty(medicamentos)) {
			return ResponseEntity.ok(medicamentos); 
		} else {
			return ResponseEntity.badRequest().build();
		}
	}
	
	@GetMapping("/stock/{stockMedicamento}")
	@ResponseBody
	public ResponseEntity<List<Medicamento>> buscarMedicamnetoStock(@PathVariable int stockMedicamento){
		List<Medicamento> medicamentos = medicamentoService.fidnByStock(stockMedicamento);
		
		if (!CollectionUtils.isEmpty(medicamentos)) {
			return ResponseEntity.ok(medicamentos); 
		} else {
			return ResponseEntity.badRequest().build();
		}
	}
	
	
}
