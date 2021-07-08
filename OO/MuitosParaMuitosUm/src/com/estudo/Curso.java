package com.estudo;

import java.util.ArrayList;
import java.util.List;

public class Curso {

	private String nome;
	private List<Aluno> alunos = new ArrayList<>();
	
	public List<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void adicionarAluno(Aluno aluno){
		this.alunos.add(aluno);
		aluno.cursos.add(this);
	}
	
	public String toString() {
		return this.nome;
	}
}
