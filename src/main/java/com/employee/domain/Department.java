package com.employee.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "DEPARTAMENTOS")
public class Department extends AbstractEntity<Long>{

	@Column(name = "nome", nullable = false, unique = true, length = 60)
	private String nome;
	
	@OneToMany(mappedBy = "department")
	private List<Office> office;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Office> getOffice() {
		return office;
	}

	public void setOffice(List<Office> office) {
		this.office = office;
	}
}
