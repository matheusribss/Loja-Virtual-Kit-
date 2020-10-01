package br.com.fatec;

public class Porcentagem extends Desconto {

	public Porcentagem(double valorDesconto) {
		super(valorDesconto);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getValorDesconto(double valorProduto) {
		double valorPorcentagem = valorDesconto/100;
		double valorFinal = valorProduto*valorPorcentagem;
		return valorFinal;
	}
	
	
	
	
		
	}
