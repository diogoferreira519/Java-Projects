package cursoguanabara;

public class canetaconstrutora {
	public String modelo;
	private double ponta;
	public String getModelo() {
		return this.modelo;
		}
	public void setModelo(String m) {
		this.modelo = m;
		}
	public double getPonta() {
		return this.ponta;
	}
	public void setPonta(double p) {
		this.ponta = p;
	}
	public void status() {
		System.out.println("Sobre a caneta");
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Ponta: " + this.ponta);
	}
}
