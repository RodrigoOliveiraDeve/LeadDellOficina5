package br.dell.oficina5.models;

/**
 * @author Rodrigo
 * @version 1
 * Instancia a classe Quarto
 */

public class Quarto {
	private int numero;
	private Hospede hospede;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Hospede getHospede() {
		return hospede;
	}
	public void setHospede(Hospede hospede) {
		this.hospede = hospede;
	}
	
	public Quarto(int numero, Hospede hospede) {
		super();
		this.numero = numero;
		this.hospede = hospede;
	}

	public Quarto() {
	}
}
