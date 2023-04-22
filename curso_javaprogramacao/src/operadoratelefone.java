import java.util.Scanner;
public class operadoratelefone {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Digite um valor em minutos para conta de telefone");
		int minutos = s.nextInt();
		int conta;
		if (minutos<=100) {
			conta = 50;
		}
		else {
			conta = (((minutos -100)*2) +50); 
			
		}
		int horas;
		horas = (minutos/60);
		minutos = (minutos%60);
		System.out.println("TOTAL A PAGAR:" + conta);
		System.out.println("FICOU NO TOTAL " + horas +":" + minutos);
	}

}
