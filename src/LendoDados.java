import java.util.Scanner;

public class LendoDados {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		String nome;
		
		System.out.println("Por Favor, insira seu nome"); 
		nome = leitor.nextLine();
		System.out.println("Bem Vindo," + nome);
		leitor.close();
	}

}
