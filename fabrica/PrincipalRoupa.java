package br.com.fabrica;

import br.com.fabrica.Contas.ContasFabrica;

public class PrincipalRoupa {
	public static void main(String[] args) {
		Roupa camisa = new Roupa();
		Roupa casaco = new Roupa();
		ContasFabrica conta = new ContasFabrica();
		
		camisa.setRoupa("Blusa");
		camisa.setTamanho("M");
		camisa.setCor("Azul");
		conta.setQuantidade(2);
		
		camisa.confira();
		conta.getContas();
		
		
		casaco.setRoupa("casaco");
		casaco.setTamanho("P e M");
		casaco.setCor("Verde");
		conta.setQuantidade(4);
		
		
		casaco.confira();
		conta.getContas();
		
		
		
		
		
		
		
		
	}

}
