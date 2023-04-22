package EXERCICIOS_POO;

public class carroyoutube {
	String nome;
	String marca;
	int ano;
	int vel;
	
	void acelerar(int aceleracao) {
		vel= vel + aceleracao;
	}
	void freio(int freiada) {
		vel = vel-freiada;
	}
	void buzinar() {
		System.out.println("bibibibi");
	}
}
