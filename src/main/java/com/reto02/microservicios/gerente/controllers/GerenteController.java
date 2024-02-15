package com.reto02.microservicios.gerente.controllers;

import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.reto02.microservicios.commons.controllers.CommonController;
import com.reto02.microservicios.gerente.models.entity.Gerente;
import com.reto02.microservicios.gerente.services.GerenteService;

@RestController
public class GerenteController extends CommonController<Gerente, GerenteService>
{
	
	@PutMapping("/{id}")
	public ResponseEntity<?> editar(@RequestBody Gerente gerente, @PathVariable Long id)
	{
		Optional<Gerente> g = service.findById(id);
		
		if(g.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		
		Gerente gerenteDb = g.get();
		gerenteDb.setDescGerente(gerente.getDescGerente());
		
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(gerenteDb));
		
	}
	
}
