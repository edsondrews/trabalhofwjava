package br.edu.unoescsmo.aluno.regras;

import java.util.List;

import br.edu.unoescsmo.aluno.model.Aluno;

public interface AlunoRegra {

	void salvar(Aluno aluno);
	
	void delete(Aluno aluno);
	
	List<Aluno> listar();
	
	List<Aluno> listarPorNome(String nome);
	
	List<Aluno> listarPorCPF(String cpf);
	
	Aluno buscarPorCodigo(Long codigo);
	
	List<Aluno> dadosGrid();
	
}