/*
 * EXERCICIO DA PÁGINA 39 DO LIVRO LÓGICA DE PROGRAMAÇÃO
 * Informando o tamanho de três retas, o programa mostra se é possível construir um triângulo, e se sim,
 * mostra o formato do triângulo
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
			// a figura geométrica é um triângulo
			// Equilatero - tem os três lados iguais
			if ((ladoA == ladoB) && (ladoB == ladoC)) {
				String msg = ("Esta figura é um triângulo equilátero.");
				JOptionPane.showMessageDialog(null, msg);
			}
			// Isósceles - tem dois lados iguais
			if (((ladoA == ladoB) && (ladoA != ladoC)) || ((ladoA == ladoC) && (ladoB != ladoC))
					|| (ladoB == ladoC) && (ladoC != ladoA)) {
				String msg = ("Esta figura é um triângulo isósceles.");
				JOptionPane.showMessageDialog(null, msg);
			}
			// Escaleno - todos os lados diferentes
			if ((ladoA != ladoB) && (ladoA != ladoC) && (ladoB != ladoC)) {
				String msg = ("Esta figura é um triângulo escaleno.");
				JOptionPane.showMessageDialog(null, msg);
			}
		} else {
			String msg = ("Esta figura não é um triângulo.");
			JOptionPane.showMessageDialog(null, msg);
		}

	}

}
