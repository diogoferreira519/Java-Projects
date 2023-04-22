import java.util.Scanner;
public class vetor {

	public static void main(String[] args) {
		System.out.println("digite um número");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int vet[] = new int [n];
		for (int i=0; i<n; i++) {
			vet[i]= i;
			System.out.println(vet[i]);
		}



	}

}
