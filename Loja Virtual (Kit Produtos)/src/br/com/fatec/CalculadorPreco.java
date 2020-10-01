package br.com.fatec;

public  class CalculadorPreco {
	public Desconto desconto;
    public Produto produto;
    
	public CalculadorPreco(Desconto desconto,Produto produto) {
		this.desconto = desconto;
		this.produto = produto;
	}

	public double calcularPreco() {
		double valorProduto = produto.getValor();
		double valorDesconto = desconto.getValorDesconto(valorProduto);
		return (valorProduto-valorDesconto);
		
	}
    
	
}
	

	
	
	
	


