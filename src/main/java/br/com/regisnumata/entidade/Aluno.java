package br.com.regisnumata.entidade;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "TB_CAD_ALUNO")
public class Aluno implements Serializable {

	private static final long serialVersionUID = 6711316474681265878L;

	@Id
	@SequenceGenerator(name = "SEQUENCIAL_ALUNO", sequenceName = "NUM_SEQ_ALUNO", allocationSize = 0)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQUENCIAL_ALUNO")
	@Column(name = "NUM_SEQ_ALUNO")
	private Long id;
	
	@NotEmpty
	private String nome;
	@NotEmpty
	private String sobrenome;

	
	public Aluno() {
		
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	
	
	
	
	
	
	
	
	
	
	
} // fim classe
