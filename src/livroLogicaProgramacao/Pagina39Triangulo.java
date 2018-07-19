/*
 * EXERCICIO DA P�GINA 39 DO LIVRO L�GICA DE PROGRAMA��O
 * Informando o tamanho de tr�s retas, o programa mostra se � poss�vel construir um tri�ngulo, e se sim,
 * mostra o formato do tri�ngulo
 */
package livroLogicaProgramacao;

import javax.swing.JOptionPane;

public class Pagina39Triangulo {

	public static void main(String[] args) {

		double ladoA;
		double ladoB;
		double ladoC;

		ladoA = Double.parseDouble(JOptionPane.showInputDialog("Digite o tamanho do lado A"));
		ladoB = Double.parseDouble(JOptionPane.showInputDialog("Digite o tamanho do lado B"));
		ladoC = Double.parseDouble(JOptionPane.showInputDialog("Digite o tamanho do lado C"));

		if ((ladoA + ladoB > ladoC) && (ladoA + ladoC > ladoB) && (ladoB + ladoC > ladoA)) {
			// a figura geom�trica � um tri�ngulo
			// Equilatero - tem os tr�s lados iguais
			if ((ladoA == ladoB) && (ladoB == ladoC)) {
				String msg = ("Esta figura � um tri�ngulo equil�tero.");
				JOptionPane.showMessageDialog(null, msg);
			}
			// Is�sceles - tem dois lados iguais
			if (((ladoA == ladoB) && (ladoA != ladoC)) || ((ladoA == ladoC) && (ladoB != ladoC))
					|| (ladoB == ladoC) && (ladoC != ladoA)) {
				String msg = ("Esta figura � um tri�ngulo is�sceles.");
				JOptionPane.showMessageDialog(null, msg);
			}
			// Escaleno - todos os lados diferentes
			if ((ladoA != ladoB) && (ladoA != ladoC) && (ladoB != ladoC)) {
				String msg = ("Esta figura � um tri�ngulo escaleno.");
				JOptionPane.showMessageDialog(null, msg);
			}
		} else {
			String msg = ("Esta figura n�o � um tri�ngulo.");
			JOptionPane.showMessageDialog(null, msg);
		}

	}

}
