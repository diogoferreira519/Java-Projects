import java.util.Scanner;
public class vet3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("digite um número");
		int n = s.nextInt();
		int id[]= new int[n];
		double alt[] = new double[n];
		String nome[] = new String[n];
		for (int i=0; i<n; i++) {
			System.out.println("preencha o nome:");
			nome[i] =s.next();
			System.out.println("preencha a idade:");
			id[i] =s.nextInt();
			System.out.println("preencha com a altura:");
			alt[i]=s.nextDouble();
		}
		double cont=0;
		double medias=0;
		for (int j=0; j<n; j++) {
			if (id[j]<16) {
				cont+=1;
				}
			medias +=alt[j];
			}
		medias = medias/n;
		cont = (100*cont)/n;
		System.out.println("altura média de:" + medias);
		System.out.println("pessoas com menos de 16 anos" + cont +"%");
		
		
	}
}
