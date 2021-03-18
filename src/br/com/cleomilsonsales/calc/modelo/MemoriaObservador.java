package br.com.cleomilsonsales.calc.modelo;

@FunctionalInterface
public interface MemoriaObservador {
	void valorAlterado(String novoValor);
}
