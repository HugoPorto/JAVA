package com.estudo;

public class Main {

	public static void main(String[] args) {

		Curso curso1 = new Curso();
		curso1.setNome("Java Básico");
		
		Curso curso2 = new Curso();
		curso2.setNome("Python Básico");
		
		Curso curso3 = new Curso();
		curso3.setNome("Spring Boot Básico");
		
		Aluno aluno1 = new Aluno();
		aluno1.nome = "Gabriel";
		
		Aluno aluno2 = new Aluno();
		aluno2.nome = "José";
		
		Aluno aluno3 = new Aluno();
		aluno3.nome = "João";
		
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		curso1.adicionarAluno(aluno3);
		
		aluno1.adicionarCurso(curso2);
		aluno2.adicionarCurso(curso3);
		
		System.out.println("[Cursos]");
		
		for (Curso curso : aluno1.cursos) {
			
			System.out.println(curso);
			
		}
		
		System.out.println("[Alunos]");
		
		for (Aluno aluno : curso1.getAlunos()) {
			
			System.out.println(aluno);
		}
	}
}
	