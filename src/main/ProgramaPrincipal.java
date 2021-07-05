package main;

import java.util.ArrayList;
import java.util.Scanner;

import models.Aluno;
import models.Escola;
import models.Materia;
import models.Serie;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
				
		Escola escola = new Escola();
		escola.setNome("Figueiras");
		
		System.out.println("Quantos alunos tem sua escola?");
		Integer quantidadeAlunos = scan.nextInt();
		scan.nextLine();
		
		for(int x =0; x < quantidadeAlunos; x++) {
			Aluno aluno = new Aluno();
			System.out.println("Digite o nome do seu aluno.");
			aluno.setNome(scan.nextLine());
			System.out.println("Digite a matrícula do seu aluno.");
			aluno.setMatricula(scan.nextInt());
			scan.nextLine();
			System.out.println("Digite a serie do seu aluno.");
			Integer numeroSerieAluno = scan.nextInt();
			scan.nextLine();
			for(Serie serie : escola.getSeries()) {
				if(serie.getNumeroSerie() == numeroSerieAluno) {
					aluno.setSerie(serie);
				}
			}	
			escola.getAlunos().add(aluno);
		}
		
		System.out.println("Digite a matricula do aluno");
		Integer matriculaAluno = scan.nextInt();
		scan.nextLine();
		
		System.out.println("Digite a nota do aluno");
		Double notaAluno = scan.nextDouble();
		scan.nextLine();

		System.out.println("Digite o identificador da materia da nota");
		Integer idMateria = scan.nextInt();
		scan.nextLine();

	}
}
