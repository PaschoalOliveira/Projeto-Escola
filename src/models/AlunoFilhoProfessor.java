package models;

public class AlunoFilhoProfessor extends Aluno {

	private Professor pai;

	public Professor getPai() {
		return pai;
	}

	public void setPai(Professor pai) {
		this.pai = pai;
	}
}
