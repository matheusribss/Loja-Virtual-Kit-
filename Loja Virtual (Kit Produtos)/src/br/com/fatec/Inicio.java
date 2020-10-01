package br.com.fatec;
public class Inicio {

	public static void main(String[] args) {
	
		
			Produto teclado = new ProdutoUnitario ("teclado",125);
			Produto mouse = new ProdutoUnitario ("mouse",75);
			
			Produto kitInformatica = new ProdutoComposto("monitor",50,mouse,teclado);

			
			Desconto v  = new Valor(20);
			Desconto p = new Porcentagem(15);
		
			CalculadorPreco c = new CalculadorPreco(v,teclado);
			CalculadorPreco c1 = new CalculadorPreco(v,kitInformatica);
			CalculadorPreco c2 = new CalculadorPreco(p,teclado);
			CalculadorPreco c3 = new CalculadorPreco(p,kitInformatica);
			
			System.out.println("Produto Unitario: \n");
			System.out.println("Desconto Dinheiro = "+c.calcularPreco());
			System.out.println("Desconto Porcentagem = "+c2.calcularPreco());
			
			System.out.println("\nProduto Kit: \n");
			System.out.println("Desconto Dinheiro Kit = "+ c1.calcularPreco());
			System.out.println("Desconto Porcentagem Kit = "+ c3.calcularPreco());
			
			

			
		
	}

}

