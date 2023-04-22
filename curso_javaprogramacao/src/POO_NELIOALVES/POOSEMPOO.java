package POO_NELIOALVES;

import java.util.Scanner;

import entities.Triangle;

public class POOSEMPOO {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Triangle x, y; 
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("informe as medidas do triangulo 1");
		x.a= s.nextDouble();
		x.b = s.nextDouble();
		x.c = s.nextDouble();
		
		System.out.println("informe as medidas do triangulo 2");
		y.a= s.nextDouble();
		y.b = s.nextDouble();
		y.c = s.nextDouble();
		double areax = x.Calculaarea();
		double areay = y.Calculaarea();
		 if (areax > areay) {
			 System.out.println("triangulo 1 têm area maior"); 
		 }else {
			 System.out.println("triangulo 2 têm area maior"); 
		 }
		 
	}

}
