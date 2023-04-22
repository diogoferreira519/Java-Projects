import java.util.Scanner;
public class vet1 {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("informe um número:");
	int n = s.nextInt();
	int vet[]= new int[n];
	for (int i=0; i<n; i++) {
		System.out.println("preencha com um valor:");
		int p = s.nextInt();
		vet[i]=p;
		p=0;
	}
	for (int j=0; j<n; j++) {
		if (vet[j]<0) {
			System.out.println(vet[j]);
		}
		
	}
	}

}
