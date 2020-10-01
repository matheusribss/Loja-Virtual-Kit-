package br.com.fatec;

public abstract class Produto {
	protected String nome;
	public double valor;
	
	public Produto(String nome, double valor) {
		super();
		this.nome = nome;
		this.valor = valor;
		}
	
	public double  getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
