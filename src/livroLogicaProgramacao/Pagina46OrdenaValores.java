/*
 * EXERC�CIO DA P�GINA 46 DO LIVRO L�GICA DE PROGRAMA��O
 * Ler tr�s n�meros inteiros e diferentes e mostr�-los em ordem 
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

		numA = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero: "));
		numB = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero: "));
		numC = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro n�mero: "));

		if (numA > numB) {
			if (numB > numC){
				maior = numA;
				meio = numB;
				menor = numC;
				System.out.println("Os tr�s n�meros em ordem decrescente s�o: "+maior +", "+meio+" e "+menor+".");
			} else {
				if (numA > numC){
					maior = numA;
					meio = numC;
					menor =numB;
					System.out.println("Os tr�s n�meros em ordem decrescente s�o: "+maior +", "+meio+" e "+menor+".");
				} else {
					maior = numC;
					meio = numA;
					menor = numB;
					System.out.println("Os tr�s n�meros em ordem decrescente s�o: "+maior +", "+meio+" e "+menor+".");
				}
			}
		} else {
			if (numB > numC){
				if (numA > numC){
					maior = numB;
					meio = numA;
					menor = numC;
					System.out.println("Os tr�s n�meros em ordem decrescente s�o: "+maior +", "+meio+" e "+menor+".");
				} else {
					maior = numB;
					meio = numC;
					menor = numA;
					System.out.println("Os tr�s n�meros em ordem decrescente s�o: "+maior +", "+meio+" e "+menor+".");
				}
			} else {
				maior = numC;
				meio = numB;
				menor = numA;
				System.out.println("Os tr�s n�meros em ordem decrescente s�o: "+maior +", "+meio+" e "+menor+".");
			}

		}
	}
}
