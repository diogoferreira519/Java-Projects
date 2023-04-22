import java.util.Scanner;
public class debug {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int x = s.nextInt();
	int ant = 0;
	while(x != 0) {
		ant = x + ant;
		x = s.nextInt();
	}
	s.close();
	System.out.println(ant);
	}

}
