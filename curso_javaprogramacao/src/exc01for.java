import java.util.Scanner;
public class exc01for {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	    int real=2;
	    double valor1=0;
	    System.out.println("Informe um número");
	    double n =s.nextDouble();
	    	for (int i=0; i<n; i++){
	    		for (int j=0; j<real; j++){
	                if(j==0){
	                System.out.println("Digite a nota" + "1");
	                valor1 =valor1 + (valor1*2);
	                valor1 =s.nextDouble();
	                }
	                if(j==1){
	                System.out.println("Digite a nota" + "2");
	                valor1 =valor1 + (valor1*3);
	                valor1 =s.nextDouble();
	                }
	                else {
	                System.out.println("Digite a nota" + "3");
	                valor1 =valor1 + (valor1*5);
	                valor1 =s.nextDouble();
	                }
	            }
	        System.out.println("o valor médio do aluno:" + (i+1) + " é de" + (valor1/real));
	        
	        }
	}
}	
		

	


