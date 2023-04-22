import java.util.Scanner;
public class areaCirculo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor para o Raio");
		double raio = sc.nextDouble();
		double pi = 3.14;
		double area = pi*(raio*raio);
		System.out.printf("Possui uma área de: %.4f%n", area );
		
	}

}
