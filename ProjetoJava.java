package javali;

import java.util.Scanner;

public class ProjetoJava {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		double n1,n2,res;
		System.out.println("Escolha dois números de 1 a 100");
		n1 = input.nextDouble(); 
		n2 = input.nextDouble();
		//checking if the valor is >= 1 and <= 100
		if (n1 >= 1 && n1 <= 100 && n2 >= 1 && n2 <= 100) {
			//ask the operation
			System.out.println("Escolha uma operação"
					+"\n (1) SOMA"
					+"\n (2) SUBTRAÇÃO"
					+"\n (3) MULTIPLICAÇAO"
					+"\n (4) DIVISÃO");
			int operacao = input.nextInt();
			switch (operacao) {
			case 1:
				res = n1 + n2; 
				System.out.println("O resultado é: " + res);
				break; 
			case 2:
				res = n1 - n2; 
				System.out.println("O resultado é: " + res);
				break;
			case 3:
				res = n1 * n2; 
				System.out.println("O resultado é: " + res);
				break;
			case 4:
				res = n1 / n2; 
				System.out.println("O resultado é: " + res);
				break;

			}
		}else {
			System.out.println("operaçao inválida");
		}

	}

}
