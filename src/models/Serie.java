package models;

import java.util.ArrayList;

public class Serie {

	private Integer numeroSerie;
	private ArrayList<Materia> materias = new ArrayList<Materia>();
	
	public Integer getNumeroSerie() {
		return numeroSerie;
	}
	public void setNumeroSerie(Integer numeroSerie) {
		this.numeroSerie = numeroSerie;
	}
	public ArrayList<Materia> getMaterias() {
		return materias;
	}
	public void setMaterias(ArrayList<Materia> materias) {
		this.materias = materias;
	}
}
