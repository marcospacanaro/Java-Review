package revisaoJava;
import java.util.Scanner;


public class ex02 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner (System.in);
		
		double altura=0, peso=0, imc=0;
		
		System.out.println("Informe sua altura: ");
		altura = read.nextDouble();
		
		System.out.println("Informe seu peso: ");
		peso = read.nextDouble();
		
		imc = peso / (altura*altura);
		
		if (imc < 18.5) {
			System.out.println("Você está abaixo do peso ideal.");
		}
		
		else if (imc > 18.5 && imc < 25) {
			System.out.println("Você está no seu peso ideal.");
		}
		
		else if (imc > 25 && imc < 30) {
			System.out.println("Você está acima do peso ideal.");
		}
		
		else {
			System.out.println("Você está obeso.");
		}
	}
}
