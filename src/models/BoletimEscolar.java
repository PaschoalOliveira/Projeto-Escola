package models;

import java.util.ArrayList;
import java.util.List;

public class BoletimEscolar {

	private Aluno aluno = new Aluno();
	
	private List<NotaEscolar> notas = new ArrayList<NotaEscolar>();

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public List<NotaEscolar> getNotas() {
		return notas;
	}

	public void setNotas(List<NotaEscolar> notas) {
		this.notas = notas;
	}
	
	public String imprimeBoletim() {
		return this.aluno.getNome() + " " 
				+ this.getNotas().get(0).getNota() + " "
						+ this.getNotas().get(0).getMateria().getNome() + " ";
	}
	
}
