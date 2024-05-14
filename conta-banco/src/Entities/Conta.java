package Entities;

public class Conta {
	// Atributos
	private int numero;
	private String agencia;
	private String nomeCliente;
	private double saldo;

	// Metodos Especificos

	// Metodos Especiais
	public Conta(int numero, String agencia, String nomeCliente, double saldo) {
		super();
		this.numero = numero;
		this.agencia = agencia;
		this.nomeCliente = nomeCliente;
		this.saldo = saldo;
	}

	public Conta() {
		super();
	}

	@Override
	public String toString() {
		return "Olá " + this.nomeCliente + 
			   ", obrigado por criar uma conta em nosso banco, " +
			   "sua agência é " + this.agencia + 
			   ", conta " + this.numero + 
			   " e seu saldo " + this.saldo + "já está disponível para saque";
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
