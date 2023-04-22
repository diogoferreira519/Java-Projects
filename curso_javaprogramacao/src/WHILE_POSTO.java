import java.util.Scanner;
public class WHILE_POSTO {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("O QUE DESEJA ABASTECER");
		int p = s.nextInt();
		
		int al=0;
		int ga=0;
		int di=0;
		int n;
		while(p>0 && p!=4) {
			if (p==4) {
				s.close();
			}
			if (p==1) {
				al+=1;
			}
			if (p==2) {
				ga+=1;
			}
			if (p==3) {
				di+=1;
			}
			System.out.println("O QUE DESEJA ABASTECER");
			p = s.nextInt();
			
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + al);
		System.out.println("Gasolina: " + ga);
		System.out.println("Diesel: " + di);

	}

}
