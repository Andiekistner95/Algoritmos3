/*
 * 1. Um cliente quer que vocês gerem um cardápio para eles.
O cardápio terá os seguintes itens:

Pizza de calabresa
Pizza de 4 queijos
Pizza de frango
Pizza de lombinho
Pizza de coração
Pizza de carne
Pizza de strogonoff de frango
Pizza de strogonoff de carne
Pizza de 5 queijos
Pizza de banana split
Pizza de sonho de valsa
Pizza de prestígio
Pizza de chocolate preto
Pizza de chocolate branco
Pizza de coco

Deverá ser perguntado para o cliente qual é o valor de cada item do cardápio e
imprimir no final o cardápio por completo com todos os itens e seus respectivos valores.
Agora simule um pedido ao um garçom. Ou seja, com os valores agora
armazenados pergunte a um cliente o que ele deseja:
Somente uma pizza será solicitada ao cliente:
Ou seja, o programa irá perguntar para o cliente que pizza ele quer, e o sistema irá
informar o valor da mesma.
 */
package exercicio.numero1;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String[][] pizza = new String[15][2];

		pizza[0][0] = "Pizza de calabresa";
		pizza[1][0] = "Pizza de 4 queijos";
		pizza[2][0] = "Pizza de frango";
		pizza[3][0] = "Pizza de lombinho";
		pizza[4][0] = "Pizza de coração";
		pizza[5][0] = "Pizza de carne";
		pizza[6][0] = "Pizza de strogonoff de frango";
		pizza[7][0] = "Pizza de strogonoff de carne";
		pizza[8][0] = "Pizza de 5 queijos";
		pizza[9][0] = "Pizza de banana split";
		pizza[10][0] = "Pizza de sonho de valsa";
		pizza[11][0] = "Pizza de prestígio";
		pizza[12][0] = "Pizza de chocolate preto";
		pizza[13][0] = "Pizza de chocolate branco";
		pizza[14][0] = "Pizza de côco";

		for (int aux = 0; aux < pizza.length; aux++) {
			System.out.println("Favor informar o valor da: " + pizza[aux][0]);
			pizza[aux][1] = scanner.nextLine();
		}
		for (int aux = 0; aux < pizza.length; aux++) {
			System.out.println("Código: " + aux + " Sabor: " + pizza[aux][0] + " Valor: R$" + pizza[aux][1]);
		}
		
		System.out.println();
	System.out.println("Digite o código da pizza: ");
	int codpizza = scanner.nextInt();
	
	System.out.println("Código: " + codpizza + " Sabor: " + pizza[codpizza][0] + " Valor: R$" + pizza[codpizza][1]);
	scanner.close();
	
	}
}
