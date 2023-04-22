import java.util.Scanner;
public class EXC2REVISAO {
	//Faça um programa para, a partir de um valor
	//informado em centavos, indicar a menor
	//quantidade de moedas que representa esse valor
	// Considere moedas de 1, 5, 10, 25 e 50 centavos, e 1
	//real
	// Exemplo: para o valor 290 centavos, a menor
	//quantidade de moedas é 2 moedas de 1 real, 1 moeda
	//de 50 centavos, 1 moeda de 25 centavos, 1 moeda de
	//10 centavos e 1 moeda de 5 centavos
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("informe um valor em centavos");
		int cent= s.nextInt();
		int result = cent;
		int cent1= 0;
		int cent5= 0;
		int cent10= 0;
		int cent25= 0;
		int cent50= 0;
		int moeda1= 0;
		int contmo;
		while (cent>0) {
		if (cent>=100) {
			cent -= 100;
			moeda1 += 1;
			
		}
		if(cent<100 && cent>=50){
			cent-=50;
			cent50 += 1;
			}
		if(cent<50 && cent>=25) {
			cent-=25;
			cent25+=1;
		}
		if(cent<25 && cent>9) {
			cent-=10;
			cent10+=1;
		}
		if(cent<10 && cent>=5) {
			cent-=5;
			cent5+=1;
	}
		if(cent<5 && cent>=1) {
			cent-=1;
			cent1+=1;

	}
		}
		System.out.println("para o valor de " + result +" centavos a menor quantidade de moedas é:");
		if (moeda1>0) {
			System.out.print(moeda1 + " moeda de um real ");
		}
		if (cent50>0) {
			System.out.print(cent50 + " moeda de 50 centavos ");
		}
		if (cent25>0) {
			System.out.print(cent25 + " moeda de 25 centavos ");
		}
		if (cent10>0) {
			System.out.print(cent10 + " moeda de 10 centavos ");
		}
		if (cent5>0) {
			System.out.print(cent5 + " moeda de 5 centavos ");
		}
		if (cent1>0) {
			System.out.print(cent1 + " moeda de 1 centavo ");
	}	
}
}
