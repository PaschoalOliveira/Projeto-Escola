package main;


import java.util.ArrayList;

import models.Aluno;

public class ProgramaEstatico {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Paschoal");
		aluno1.setMatricula(1);
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Rafael");
		aluno2.setMatricula(2);
		
		ArrayList<String> nomes = new ArrayList<String>();
		
		Aluno aluno3 = new Aluno();
		aluno3.setNome("João");
		aluno3.setMatricula(3);
		
		System.out.println(aluno1.getNomeEscola());
		System.out.println(aluno2.getNomeEscola());
		System.out.println(aluno3.getNomeEscola());

	}
}
