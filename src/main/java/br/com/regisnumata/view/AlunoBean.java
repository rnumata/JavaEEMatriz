package br.com.regisnumata.view;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.omnifaces.util.Messages;

import br.com.regisnumata.entidade.Aluno;
import br.com.regisnumata.servicos.ServicoAluno;

@Named
@ViewScoped
public class AlunoBean implements Serializable {

	private static final long serialVersionUID = 5278265623370585916L;
	
	
	private Aluno aluno;
	
	@Inject
	private ServicoAluno servicoAluno;

	
	public AlunoBean() {
		
	}

	@PostConstruct
	public void init() {
		this.aluno = new Aluno();
	}
	
	
	
	public void cadastrar() {
		try {
			this.servicoAluno.cadastrar(this.aluno);
			Messages.addGlobalInfo("Cadastro OK!");
			this.aluno = new Aluno();
		} catch (Exception e) {
			Messages.addGlobalInfo("Cadastro NÃO realizado!");
		}
	}
	
	
	
	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public ServicoAluno getServicoAluno() {
		return servicoAluno;
	}

	public void setServicoAluno(ServicoAluno servicoAluno) {
		this.servicoAluno = servicoAluno;
	}
	
	
	
	
	
	
	
	
}
