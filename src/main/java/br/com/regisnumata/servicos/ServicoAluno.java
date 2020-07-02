package br.com.regisnumata.servicos;

import javax.ejb.Stateless;

import br.com.regisnumata.entidade.Aluno;

@Stateless
public class ServicoAluno extends ServicoComum<Aluno> {

	@Override
	protected void validarCadastro(Aluno t) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
