package main;

import java.util.Scanner;

import models.Aluno;
import models.AlunoEspecial;

public class ProgramaAlunoEspecial {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Este aluno é especial?");
		Boolean isAlunoEspecial = scan.nextBoolean();
		scan.nextLine();
		
		Aluno aluno;
		if(isAlunoEspecial == true) {
			aluno = new AlunoEspecial();
				aluno.setNome("RAfael");
		}else {
			aluno = new AlunoEspecial();
			aluno.setNome("PaschOal");
			aluno.imprime();
		}
		
		
		
	}
}
