import java.util.Locale;
import java.util.Scanner;
public class scanner {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double x;
		x = sc.nextDouble();
		System.out.print("Você digitou " + x);
	
		
		sc.close();

	}

}
