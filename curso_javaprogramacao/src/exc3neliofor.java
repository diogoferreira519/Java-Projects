import java.util.Scanner;
public class exc3neliofor {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("informe um número");
		int n=s.nextInt();
		int real=4;
		int media =10;	
		for(int i=0; i<n; i++) {
			double nota1=0;
			double nota2=0;
			double nota3=0;
			double notas=0;
			for(int j=1; j<real; j++){
				if (j==1) {
					System.out.println("informe o " +j + " valor:" );
					nota1=s.nextDouble();
					nota1= nota1*2;
				}
				if (j==2) { 
					System.out.println("informe o " +j + " valor:");
					nota2=s.nextDouble();
					nota2= nota2*3;
				}
				if (j==3) {
					System.out.println("informe o " +j + " valor:");
					nota3=s.nextDouble();
					nota3= nota3*5;
				}
				
			}
			notas = nota1 + nota2+ nota3;
			notas = notas/media;
			System.out.println("MÉDIA DE:" + notas);
			notas=0;
			
		}

	}

}
