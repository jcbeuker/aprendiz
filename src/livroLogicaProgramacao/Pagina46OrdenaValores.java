/*
 * EXERCÍCIO DA PÁGINA 46 DO LIVRO LÓGICA DE PROGRAMAÇÃO
 * Ler três números inteiros e diferentes e mostrá-los em ordem 
 * decrescente
 */
package livroLogicaProgramacao;

import javax.swing.JOptionPane;

public class Pagina46OrdenaValores {

	public static void main(String[] args) {
		int numA;
		int numB;
		int numC;

		int maior = 0; 
		int menor = 0;
		int meio = 0;

		numA = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
		numB = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
		numC = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número: "));

		if (numA > numB) {
			if (numB > numC){
				maior = numA;
				meio = numB;
				menor = numC;
				System.out.println("Os três números em ordem decrescente são: "+maior +", "+meio+" e "+menor+".");
			} else {
				if (numA > numC){
					maior = numA;
					meio = numC;
					menor =numB;
					System.out.println("Os três números em ordem decrescente são: "+maior +", "+meio+" e "+menor+".");
				} else {
					maior = numC;
					meio = numA;
					menor = numB;
					System.out.println("Os três números em ordem decrescente são: "+maior +", "+meio+" e "+menor+".");
				}
			}
		} else {
			if (numB > numC){
				if (numA > numC){
					maior = numB;
					meio = numA;
					menor = numC;
					System.out.println("Os três números em ordem decrescente são: "+maior +", "+meio+" e "+menor+".");
				} else {
					maior = numB;
					meio = numC;
					menor = numA;
					System.out.println("Os três números em ordem decrescente são: "+maior +", "+meio+" e "+menor+".");
				}
			} else {
				maior = numC;
				meio = numB;
				menor = numA;
				System.out.println("Os três números em ordem decrescente são: "+maior +", "+meio+" e "+menor+".");
			}

		}
	}
}
