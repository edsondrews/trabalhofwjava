package br.edu.unoescsmo.aluno.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.unoescsmo.aluno.model.Disciplina;

public interface DisciplinaRepository 
		extends JpaRepository<Disciplina, Long>{

}