import java.util.Scanner;
public class vet2 {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("informe um valor:");
		int media=0;
		int n = s.nextInt();
		int vet[]= new int[n];
		for (int i=0; i<n; i++) {
			System.out.println("preencha com um valor:");
			int p = s.nextInt();
			vet[i]=p;
			media+=p;
			p=0;
		}
		for (int j=0; j<n; j++) {
			System.out.println(vet[j]);
		
	}
		System.out.println("soma de todos elementos é de:" + media);
		media = media/n;
		System.out.println("media de :" + media);

}
}
