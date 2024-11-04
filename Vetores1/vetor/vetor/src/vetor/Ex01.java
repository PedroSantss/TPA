package vetor;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i;
		int a[] = new int[10];
		int b[] = new int[10];
		
		for(i=0; i<10 ;i++) {
			System.out.println("Digite o valor"+" "+(i+1)+" do vetor A");
			a[i] = ler.nextInt();
			b[i] = a[i]*a[i];
			
		//apresentando a
		}
		System.out.print("a = [");
		for(i=0; i<10; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.print("]\n");
		
		//apresentando b
		System.out.print("b = [");
		for(i=0; i<10; i++) {
			System.out.print(b[i]+" ");
		}
		System.out.print("]\n");
	}
   
}