package EXERCICIOS_POO;

public class Carroteste {

	public static void main(String[] args) {
		carroyoutube c1= new carroyoutube();
		c1.marca = "RENAULT";
		c1.nome = "Fiesta";
		c1.ano = 2002;
		c1.vel = 60;
		
		c1.acelerar(10);
		System.out.println(c1.vel);
		c1.freio(13);

		System.out.println(c1.vel);
	
		

	}

}

