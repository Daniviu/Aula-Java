package br.com.fabrica.Contas;

import br.com.fabrica.Roupa;

public class ContasFabrica extends Roupa implements Contas{
	
	private  int estoque = 50; //com o static se pode definir o valor sem precisar de um main
	private int quantidade;
	
		
	
	
	public int getestoque() {

		return estoque;
	}

	@Override
	public int getContas() {
		estoque -= quantidade;
		if(estoque < quantidade) {
			System.out.println("Estoque Vazio!");
			System.exit(1);
			return 0;
		}else {
			System.out.println("Estoque " + estoque);
		}
		return estoque;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	

}
