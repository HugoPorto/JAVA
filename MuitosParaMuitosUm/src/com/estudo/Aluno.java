package com.estudo;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

	String nome;
	List<Curso> cursos = new ArrayList<>();
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", cursos=" + cursos + "]";
	}
	
	void adicionarCurso(Curso curso){
		this.cursos.add(curso);
		curso.getAlunos().add(this);
	}
}
