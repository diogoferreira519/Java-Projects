package Olámundocarro;

import java.util.Scanner;

public class principalcarro {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("informe uma marca de Carro");
		carrovel c1= new carrovel();
		c1.marcaenome =s.nextLine();
		System.out.println("informe o ano do carro");
		c1.ano=s.nextInt();
		System.out.println("informe a velocidade do carro");
		c1.vel= s.nextInt();
		System.out.println("qual a velocidade que queres acelerar?");
		int velnova = 30;
		c1.Carrocorre(velnova);
		System.out.println(c1.Carrocorre(velnova));
	}

}
