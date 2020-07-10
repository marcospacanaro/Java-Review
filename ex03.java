package revisaoJava;
import java.util.Scanner;

public class ex03 {
	public static void main (String args[]) {
		
		Scanner read = new Scanner (System.in);
		int num, cont1=0, cont2=0, cont3=0, cont4=0;
		
		System.out.println("Informe um número: ");
		num = read.nextInt();
		
		while (num >= 0) {
			if (num >= 0 && num <= 25) {
				cont1++;
			}
			
			else if (num > 25 && num <= 50) {
				cont2++;
			}
			
			else if (num > 50 && num <= 75) {
				cont3++;
			}
			
			else if (num > 75 && num <= 100) {
				cont4++;
			}
			
			System.out.println("Informe um número: ");
			num = read.nextInt();
		}
		
		System.out.println("Números entre 0-25 contados: " + cont1 + ".");
		System.out.println("Números entre 26-50 contados: " + cont2 + ".");
		System.out.println("Números entre 51-75 contados: " + cont3 + ".");
		System.out.println("Números entre 75-100 contados: " + cont4 + ".");

	
	}
	
	

}
