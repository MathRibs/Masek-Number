import java.util.Scanner;

public class NumeroMascardo {
public static void main (String args[]) { 
	// Declaração de variaveis
		Scanner leitor = new Scanner (System.in);
		int numero = 0;
		//Entrada de dados
		do {
		System.out.print("digite um numero menor do que dez:");
		numero = leitor.nextInt();
		} while (numero >= 10);
		//saida de dados 
System.out.print("o numero digitado foi :" + numero);





}
}