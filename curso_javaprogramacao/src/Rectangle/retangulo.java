package Rectangle;

public class retangulo {
	public double largura;
	public double altura;
	
	public double area() {
		return this.largura * this.altura;
	}
	public double perimetro() {
		return (this.largura*2)+ (this.altura*2);
	}
	public double diagonal() {
		double diag;
		diag = Math.pow(this.altura,2) + Math.pow(this.largura,2);
		return Math.sqrt(diag);
		
	}
}
