package com.reto02.microservicios.gerente.services;
import org.springframework.stereotype.Service;

import com.reto02.microservicios.commons.services.CommonServiceImpl;
import com.reto02.microservicios.gerente.models.entity.Gerente;
import com.reto02.microservicios.gerente.models.repository.GerenteRepository;

@Service
public class GerenteServiceImpl extends CommonServiceImpl<Gerente, GerenteRepository> implements GerenteService 
{
	
}
