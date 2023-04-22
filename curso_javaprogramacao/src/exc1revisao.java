import java.util.Scanner;
public class exc1revisao {

	public static void main(String[] args) {
		// Faça um programa que leia o nome, a idade, a
		//altura, o peso e a nacionalidade do usuário e
		//escreva essas informações na forma de um
		//parágrafo de apresentação
	Scanner s = new Scanner(System.in);	
	System.out.println("Qual nome?");
	String b = s.nextLine();
	System.out.println("qual idade?");
	int id = s.nextInt();
	System.out.println("qual altura?");
	double alt = s.nextDouble();
	System.out.println("qual peso?");
	int p =s.nextInt();
	System.out.println("qual nacionalidade?");
	String n = s.nextLine();
	System.out.println(b);
	System.out.println(id);
	System.out.println(alt);
	System.out.println(p);
	System.out.println(n);
	
	}

}
