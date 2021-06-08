package br.com.caicaielevator.implementacao;

import br.com.caicaielevator.modelo.Elevador;

public class TesteElevador {

	public static void main(String[] args) {
		
		Elevador objeto = new Elevador();
		
		objeto.Inicializar(10, 20, 0);
		objeto.preencherNome("Maria Elevador" );
		objeto.subir();
		System.out.println(objeto.toString());
		objeto.descer();
		System.out.println(objeto.entrar());
		objeto.entrar(2);
		System.out.println(objeto.toString());
		objeto.sair();
		
		
		

	}

}
