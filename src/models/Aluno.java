package models;

public class Aluno {

	static private String nomeEscola;

	private String nome;
	private Integer matricula;
	private Serie serie;
	private Double mensalidade;
	
	public void imprime() {
		System.out.println(nome.toUpperCase());
	}
	
	public static String getNomeEscola() {
		return nomeEscola;
	}

	public static void setNomeEscola(String nomeEscola) {
		Aluno.nomeEscola = nomeEscola;
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
