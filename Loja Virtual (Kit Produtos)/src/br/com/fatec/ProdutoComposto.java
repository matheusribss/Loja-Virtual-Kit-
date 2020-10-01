package br.com.fatec;

import java.util.Arrays;
import java.util.List;

public class ProdutoComposto extends Produto {

  public List<Produto>produtos;
	
  ////// ANTES ////////
	/*public ProdutoComposto( Produto ...produtos) {
		super("",0);
		this.produtos = Arrays.asList(produtos);
	}*/
	
  
  //// DEPOIS ///////
	public ProdutoComposto(String nome, double valor, Produto ...produtos) {
		super(nome,valor);
		this.produtos = Arrays.asList(produtos);
	}
	
	public ProdutoComposto(String nome, Produto ...produtos) {
		super(nome,0);
		this.produtos = Arrays.asList(produtos);
		
		var valorTotal = 0;
		for (Produto produto : produtos) {
			valorTotal += produto.getValor();
			}
		
		valor=valorTotal;
			
	}
	}
	
