package br.edu.faeterjrio.garcom;

public class Garcom {
	public String nome;
	private int idade;
	private String telefone;
	private float gorjeta;
	protected float salario;

	// Construtores
	// Construtor 1 - PADRÃO
	public Garcom() {

	}

	// Construtor 2 - COM PARÂMETROS
	public Garcom(String nome, int idade, String telefone, float gorjeta, float salario) {
		this.nome = nome;
		this.idade = idade;
		this.telefone = telefone;
		this.gorjeta = gorjeta;
		this.salario = salario;
	}

	// GET E SET - ENCAPSULAMENTO
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public float getGorjeta() {
		return gorjeta;
	}

	public void setGorjeta(float gorjeta) {
		this.gorjeta = gorjeta;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public String toString() {
		return "Garcom [nome=" + nome + ", idade=" + idade + ", telefone=" + telefone + ", gorjeta=" + gorjeta + ", salario="
				+ salario + "]";
	}

	// SOBRECARGA
	public void receberGorjeta(float dinheiro) {
	}

	public void receberGorjeta(int dinheiro) {

	}

}