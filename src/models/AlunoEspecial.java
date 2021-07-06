package models;

public class AlunoEspecial extends Aluno{
	
	private Double desconto;
	private String especialidade;
	
	public void imprimeAluno() {
		System.out.println(this.getNome().toLowerCase());
	}
	
	public Double calculaDesconto() {
		return getMensalidade() * this.desconto;
	}
	
	public Double getDesconto() {
		return desconto;
	}
	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
}
