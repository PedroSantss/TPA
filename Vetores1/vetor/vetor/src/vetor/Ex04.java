package vetor;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i;
		double b=0, c, t, r;
		double a[] = new double[10];
		
		//declarando variaveis
		for(i=0; i<10; i++) {
			System.out.println("Digite os valores de A: ");
			a[i]=ler.nextInt();
			b= a[i]+b;
			r=b/10;
			if(i==9) {
				System.out.println("O resultado é: " + r);
			}
		}
	}

}
