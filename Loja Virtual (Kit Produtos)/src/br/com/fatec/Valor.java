package br.com.fatec;

public class Valor extends Desconto {
	
	public Valor(double valorDesconto) {
		super(valorDesconto);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getValorDesconto(double valorProduto) {
		return valorDesconto;
	}
	
	
	}


