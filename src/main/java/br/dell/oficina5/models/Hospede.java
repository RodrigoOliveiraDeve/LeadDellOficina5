package br.dell.oficina5.models;

/**
 * @author Rodrigo
 * @version 1
 * Instancia a classe hospede
 */
public class Hospede {
	private long CPF;
	private long RG;
	private String nome;
	private int idade;
	private String endereco;
	
	public long getCPF() {
		return CPF;
	}
	public void setCPF(long cPF) {
		CPF = cPF;
	}
	public long getRG() {
		return RG;
	}
	public void setRG(long rG) {
		RG = rG;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public Hospede(long cPF, long rG, String nome, int idade, String endereco) {
		super();
		CPF = cPF;
		RG = rG;
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
	}
	public Hospede() {}

	/**
	 * @return String com as informações do hospede
	 */
	@Override
	public String toString() {
		return "\nNome:" + this.nome +
				"\nCPF:" + this.CPF +
				"\nRG:" + this.RG +
				"\nIdade:" + this.idade +
				"\nEndereco:" + this.endereco;
	}
}


