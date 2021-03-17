package br.com.cleomilsonsales.calc.modelo;

public class Memoria {
	
	//padrão Singleton - unica instancia de um objeto
	//impedindo multiplas instancias dessa classe
	private static final Memoria instancia = new Memoria();
	
	private String textoAtual = "";
	
	private Memoria() {
		
	}

	public static Memoria getInstancia() {
		return instancia;
	}

	public String getTextoAtual() {
		return textoAtual.isEmpty() ? "0" : textoAtual;
	}
	
	
}
