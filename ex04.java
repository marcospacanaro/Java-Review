package revisaoJava;
import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner (System.in);
		
		int soma=0, cont1=0, i=0;
		
		for (i = 1; i <= 99; i = i+2) {
			
			System.out.println("Dividendo: " + i + "|| Divisor: " + cont1);
			soma = soma + (i/cont1);
			cont1++;
		}
		
		System.out.println("Resultado da soma: " + soma + ".");

	}

}
