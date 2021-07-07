package models;

import interfaces.IAluno;

public class Aluno implements IAluno{

	static final private String NOME_ESCOLA = "Juliano";
	static final private String SESSAO_ALUNO = "id_aluno";
	
	private String nome;
	private Integer matricula;
	private Serie serie;
	private Double mensalidade;
	
	public void imprimeAluno() {
		System.out.println(nome.toUpperCase() + "Normal");
	}
	
	public void calculaMensalidade() {
		System.out.println("teste");
	}
	
	public Double calculaDesconto() {
		return getMensalidade();
	}
	
	public static String getNomeEscola() {
		return NOME_ESCOLA;
	}

	public Double getMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(Double mensalidade) {
		this.mensalidade = mensalidade;
	}

	public Serie getSerie() {
		return serie;
	}

	public void setSerie(Serie serie) {
		this.serie = serie;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

}
