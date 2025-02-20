package exer2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numero;
        do {
        	System.out.println("DIGITE NUMERO NEGATIVO PARA SAIR");
        	
        	try {
            System.out.print("Informe um número ");
            numero = scanner.nextInt();

            if (numero >= 0) {
                if (validaFibonacci(numero)) {
                    System.out.println("O número " + numero + " PERTENCE à sequência de Fibonacci.");
                } else {
                    System.out.println("O número " + numero + " NÃO PERTENCE à sequência de Fibonacci.");
                }
            }
        	}catch (Exception e) {
        		System.out.println("Erro: entrada inválida.");
        		  scanner.nextLine();	// Limpa o buffer do scanner
        	
        		  numero = -1;
			}
        } while (numero >= 0);
        
        System.out.println("Obrigado!!");

        scanner.close();
    }

	public static boolean validaFibonacci(int numero) {
		int a = 0;
		int b = 1;

		while (b < numero) {
			int temp = b;
			b = a + b;
			a = temp;
		}

		return b == numero;
	}

}
