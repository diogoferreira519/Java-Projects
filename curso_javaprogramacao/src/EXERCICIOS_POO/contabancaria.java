package EXERCICIOS_POO;

public class contabancaria {
	private String name;
	private int numconta;
	public String agencia;
	private double saldo;
	private String abertura;
	public contabancaria(String name, int numconta, String agencia, double saldo) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	public String setName(String name) {
		return name;
	}
	public double SacaConta(double saque) {
		this.saldo = saldo;
		saldo -=saque;
		return saldo;
	}
	public double DepositaConta(double deposito) {
		this.saldo=saldo;
		saldo +=deposito;
		return saldo;
	}
	public double RendimentoConta() {
		this.saldo=saldo;
		double rend = saldo *0.1;
		return rend;
	}
	public String toString() {
		return "Nome: " + name +
				"Saldo: " + saldo;
	}
}
