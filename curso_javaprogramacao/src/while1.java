import java.util.Scanner;
public class while1 {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Informe uma senha");
	int x = s.nextInt();
	while(x!=2002) {
	System.out.println("Senha invalida, informe outra:");
	x = s.nextInt();
	}
	System.out.println("parabéns, senha correta");

	}

}
