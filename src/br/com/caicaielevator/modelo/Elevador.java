package br.com.caicaielevator.modelo;

public class Elevador {
	
	private String nome;
	private int capacidadeMaxima;
	private int andarMax;
	private int andarMin;
	private int andarAtu;
	private int qtpess;
	
	public void Inicializar(int cmp, int andarMaxi, int andarMini) {
		capacidadeMaxima=cmp;
		andarMax = andarMaxi;
		andarMin=andarMini;
		
	}
	
	public void preencherNome(String param) {
		nome = param.toUpperCase();
		
	}
	
	public String toString() {
		
		return
				"Nome...........................: " + nome + "\n" +
				"Capacidade maxima..............: " + capacidadeMaxima + "\n" +
				"Andar maximo...................: " + andarMax + "\n" +
				"Andar minimo...................: " + andarMin + "\n" +
				"Andar Atual....................: " + andarAtu + "\n" +
		        "Quantidade pessoas.............: " + qtpess;
			
	}
	
	
	
	
	public void subir() {
		
		if (andarAtu < andarMax) {
			andarAtu = andarAtu + 1;
		}			
		
	}
	
	
	
	public void descer() {
		if (andarAtu > andarMin) {
			andarAtu -= 1;
		}			
		
	}
	
	
	public String entrar() {
		if (qtpess < capacidadeMaxima) {
			qtpess += 1;
			return "ok";
		}else {
			
			return "Nok";
		}
		
		
				
		
	}
	
	
	
	public String entrar(int qtde) {
		int total = qtpess + qtde;
		
		if (total <= capacidadeMaxima) {
			qtpess += qtde;
			return "ok";
		}		
		
		return "NOK";
				
		
	}
	
	
	public String sair() {
		if (qtpess > 0) {
			qtpess -= 1;
			return "OK";
		}		
		
		return "NOK";
				
		
	}	
	

	
	

}
