package br.com.fatec;

public abstract class Desconto {
	
	
	public double valorDesconto =0;
	
	public Desconto(double valorDesconto) {
		this.valorDesconto = valorDesconto;
	}

	public abstract double getValorDesconto(double valorProduto);

	
	
}
