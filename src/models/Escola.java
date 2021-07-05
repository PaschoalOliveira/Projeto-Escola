package models;

import java.util.ArrayList;

public class Escola {

	private String nome;
	private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	private ArrayList<Serie> series = new ArrayList<Serie>();
	
	public Escola() {
		Serie serie = new Serie();
		serie.setNumeroSerie(1);
		Materia materia1 = new Materia();
		materia1.setNome("Portugues");
		materia1.setId(1);
		serie.getMaterias().add(materia1);
		
		Materia materia2 = new Materia();
		materia2.setNome("Matematica");
		materia2.setId(2);
		serie.getMaterias().add(materia2);
		
		this.getSeries().add(serie);
		
		Serie serie2 = new Serie();
		serie2.setNumeroSerie(2);
		serie2.getMaterias().add(materia1);
		serie2.getMaterias().add(materia2);
		
		Materia materia3 = new Materia();
		materia3.setNome("Fisica");
		materia3.setId(3);
		serie2.getMaterias().add(materia3);
		
		this.getSeries().add(serie2);
	}
	
	public ArrayList<Serie> getSeries() {
		return series;
	}
	public void setSeries(ArrayList<Serie> series) {
		this.series = series;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}
}
