package pjr;
import java.util.Scanner;
public class Ano {
	
	public static void main(String[] args) {
		int anoNasc, resto;
		Scanner Ler = new Scanner(System.in);
		
		System.out.println("Digite o seu ano de nascimento: ");
		anoNasc = Ler.nextInt();
		
		resto = anoNasc % 4;
		
		if (resto == 0) {
			System.out.println("Nasceu em um ano bissexto");
		}else {
			System.out.println("Nasceu em ano comum");
		}
		
		Ler.close();
	}

}
