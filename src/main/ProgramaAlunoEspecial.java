package main;

import java.util.Scanner;

import interfaces.IAluno;
import models.Aluno;
import models.AlunoEspecial;

public class ProgramaAlunoEspecial {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Este aluno é especial?");
		Boolean isAlunoEspecial = scan.nextBoolean();
		scan.nextLine();
		
		/*
		Aluno aluno;
		if(isAlunoEspecial == true) {
			aluno = new AlunoEspecial();
				aluno.setNome("RAfael");
		}else {
			aluno = new Aluno();
			aluno.setNome("PaschOal");
		}
		*/
		
		IAluno aluno2 = new Aluno();
		aluno2.imprimeAluno();
		
		Aluno aluno3 = new AlunoEspecial();
		aluno3.imprimeAluno();
		//aluno3.calculaDesconto();
		
		//AlunoEspecial alunoEspecial = (AlunoEspecial) aluno3;
		//alunoEspecial.setDesconto(5.0);
		if(aluno2 instanceof AlunoEspecial) {
			System.out.println("Sim");
		}
		
	}
}
