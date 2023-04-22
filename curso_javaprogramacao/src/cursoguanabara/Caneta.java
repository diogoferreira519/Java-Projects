package cursoguanabara;

public class Caneta {
	public String modelo;
	public String cor;
	public double ponta;
	protected int carga;
	protected boolean tampada;
	
	void status() {
		System.out.println("Modelo:" + this.modelo);
		System.out.println("Uma caneta " + this.cor);
		System.out.println("ponta :" + this.ponta);
		System.out.println("carga de :" + this.carga);
		System.out.println("tampada :" + this.tampada);
		
	}
	public void rabiscar() {
		if (this.tampada==true){
			System.out.println("Erro, você não pode rabiscar");
		}else {
			System.out.println("Rabiscado");
	}
	
	}
	void tampar() {
		this.tampada= true;
	}
	void destampar() {
		this.tampada = false;
	}
}
