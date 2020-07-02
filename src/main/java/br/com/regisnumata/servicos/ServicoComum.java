package br.com.regisnumata.servicos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class ServicoComum<T> {

	@PersistenceContext
	protected EntityManager em;
	
	
	public T cadastrar(T t)throws Exception {
		validarCadastro(t);
		em.persist(t);
		return t;
	}	

	
	//Construtor
	public ServicoComum() {
		
	}


	// Metodos abstratos a desenvolver no Servico especifico
	protected abstract void validarCadastro(T t) throws Exception;
	
	
}// fim classe
