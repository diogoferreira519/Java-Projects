package course;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s =new Scanner(System.in);

		Product pro1 = new Product();
		Product pro2 = new Product();
		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		pro1.name = s.nextLine();
		System.out.print("Price: "); 
		pro1.price = s.nextDouble();
		System.out.println("Quantity in stock: ");
		pro1.quantity =s.nextInt();
		System.out.println(pro1);
		
		
		
		s.close();
	}

}
