package com.reto02.microservicios.gerente.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import java.util.Date;

@Entity
@Table(name="gerente")
public class Gerente
{
	
	@Column(name = "IDGERENTE")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idGerente;
    
    @Column(name = "DESCGERENTE")
    private String descGerente;
    
    @Column(name = "FECHAREGISTRO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    
    @PrePersist
    public void prePersist() {
    	this.fechaRegistro = new Date();
    }

	public Long getIdGerente() {
		return idGerente;
	}

	public void setIdGerente(Long idGerente) {
		this.idGerente = idGerente;
	}

	public String getDescGerente() {
		return descGerente;
	}

	public void setDescGerente(String descGerente) {
		this.descGerente = descGerente;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	

}

