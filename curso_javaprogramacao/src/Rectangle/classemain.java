package Rectangle;
import java.util.Scanner;
public class classemain {

	public static void main(String[] args) {
		retangulo r1 = new retangulo();
		Scanner s= new Scanner(System.in);
		System.out.println("qual a altura do retangulo");
		r1.altura = s.nextDouble();
		System.out.println("qual a largura do retangulo");
		r1.largura = s.nextDouble();
		System.out.println("AREA DO RETANGULO: " + r1.area());
		System.out.println("PERIMETRO DO RETANGULO " + r1.perimetro());
		System.out.println("DIAGONAL DO RETANGULO " + r1.diagonal());
	}

}
