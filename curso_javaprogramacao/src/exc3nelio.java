import java.util.Scanner;
public class exc3nelio {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int A, B, C, D;
		A = s.nextInt();
		B = s.nextInt();
		C = s.nextInt();
		D = s.nextInt();
		double diferenca = (A*B - C*D);
		System.out.println(diferenca);
	}

}
