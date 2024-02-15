package com.reto02.microservicios.gerente.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.reto02.microservicios.gerente.models.entity.Gerente;

public interface GerenteRepository extends CrudRepository<Gerente, Long>
{
	
}
