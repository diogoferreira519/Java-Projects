import java.util.Scanner;
public class while2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("informe uma coordenada x");
		int x = s.nextInt();
		System.out.println("informe uma coordenada y");
		int y = s.nextInt();
		while(x!=0 &&  y!=0) {
			if(x>0 && y>0) {
				System.out.println("Q1");
				}
			else if (x<0 && y>0) {
				System.out.println("Q2");
			}
			else if (x<0 && y<0) {
				System.out.println("Q3");
			}
			else if (x>0 && y<0){
				System.out.println("Q4");
			}
			System.out.println("informe uma coordenada x");
			x = s.nextInt();
			System.out.println("informe uma coordenada y");
			y = s.nextInt();
			
		}
		System.out.println("NULO");
		
	}

}
