package br.edu.unoescsmo.aluno.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.edu.unoescsmo.aluno.model.Aluno;
import br.edu.unoescsmo.aluno.regras.AlunoRegra;
import br.edu.unoescsmo.aluno.repository.DisciplinaRepository;

@Controller
@RequestMapping("/Aluno")
public class AlunoController {

	@Autowired
	private AlunoRegra AlunoRegra;
	@Autowired
	private DisciplinaRepository DisciplinaRepository;

	@PostMapping("/salvar")
	public String salvar(@Valid Aluno Aluno, BindingResult erros) {
		if(erros.hasErrors()){
			return "Aluno/novo";
		}
		AlunoRegra.salvar(Aluno);
		return "redirect:/Aluno/listar";
	}
	
	@PostMapping("/alterar")
	public String alterar(@Valid Aluno Aluno, BindingResult erros) {
		if(erros.hasErrors()){
			return "Aluno/visualizar";
		}
		AlunoRegra.salvar(Aluno);
		return "redirect:/Aluno/listar";
	}

	@GetMapping("/listar")
	public String listar(Model model) {
		// Torna a lista de Aluno acessivel no JSP
		model.addAttribute("Alunos", AlunoRegra.dadosGrid());
		// Caminho + Nome do jsp que será renderizado para a tela
		return "Aluno/lista";
	}

	@GetMapping("/novo")
	public String novo(Model model) {
		model.addAttribute("Disciplinas", DisciplinaRepository.findAll());
		return "Aluno/novo";
	}

	@GetMapping("/deletar/{codigo}")
	public String deletar(@PathVariable("codigo") Long codigo) {
		AlunoRegra.delete(new Aluno(codigo));
		return "redirect:/Aluno/listar";
	}

	@GetMapping("/visualizar/{codigo}")
	public String visualizar(@PathVariable("codigo") Long codigo, Model model) {
		model.addAttribute("Aluno", AlunoRegra.buscarPorCodigo(codigo));
		model.addAttribute("Disciplinas", DisciplinaRepository.findAll());
		return "Aluno/visualizar";
	}

	@GetMapping("/Aluno/cpf/{cpf}")
	@ResponseBody
	public List<Aluno> listarCpf(@PathVariable("cpf") String cpf) {
		return AlunoRegra.listarPorCPF(cpf);
	}

	@GetMapping("/Aluno/nome/{nome}")
	@ResponseBody
	public List<Aluno> listarNome(@PathVariable("nome") String nome) {
		return AlunoRegra.listarPorNome(nome);
	}
}