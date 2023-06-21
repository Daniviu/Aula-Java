package br.com.fabrica;

import br.com.fabrica.Contas.Contas;

public class Roupa implements Contas{
	private String roupa;
	private String tamanho;
	private String cor;
	
	
	public void confira() {
		System.out.println("\n");
		System.out.println("Roupa: "  + roupa);
		System.out.println("Tamanho: " + tamanho);
		System.out.println("Cor: " + cor );
		
		
		
		
	}
	
	public String getRoupa() {
		return roupa;
	}
	public void setRoupa(String roupa) {
		this.roupa = roupa;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	

	@Override
	public int getContas() {
		
		return 0;
	}
	
		
	
	

}
