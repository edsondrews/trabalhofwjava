package br.edu.unoescsmo.aluno.regras;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.unoescsmo.aluno.model.Aluno;
import br.edu.unoescsmo.aluno.repository.AlunoRepository;

@Service
public class AlunoPadrao implements AlunoRegra{

	@Autowired
	private AlunoRepository AlunoRepository; 
	
	@Override
	public void salvar(Aluno Aluno) {
		AlunoRepository.save(Aluno);
	}
	
	public void delete(Aluno Aluno){
		AlunoRepository.delete(Aluno);
	}
	
	public List<Aluno> listar(){
		return AlunoRepository.findAll();
	}
	
	@Override
	public List<Aluno> listarPorCPF(String cpf) {
		return AlunoRepository.porCpf(cpf);
	}
	
	@Override
	public List<Aluno> listarPorNome(String nome) {
		return AlunoRepository.findByNomeLike("%"+nome+"%");
	}

	@Override
	public Aluno buscarPorCodigo(Long codigo) {
		return AlunoRepository.findById(codigo).orElse(new Aluno());
	}
	
	@Override
	public List<Aluno> dadosGrid(){
		return AlunoRepository.dadosGrid();
	}
	
}