package br.edu.unoescsmo.aluno.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.edu.unoescsmo.aluno.model.Aluno;

public interface AlunoRepository
		extends JpaRepository<Aluno, Long>{

	List<Aluno> findByNomeLike(String nome);
	
	@Query("select p from Aluno p where p.cpf = :cpf")
	List<Aluno> porCpf(@Param("cpf") String cpf);
	
	@Query("select p from Aluno p left join fetch p.notas")
	List<Aluno> dadosGrid();
}