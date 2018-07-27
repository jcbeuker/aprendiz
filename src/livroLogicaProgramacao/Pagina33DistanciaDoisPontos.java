/*
 * EXERC�CIO P�GINA 33
 * Construa um algoritmo que, tendo como dados de entrada dois pontos quaisquer do plano,
 * P(x1, y1) e Q(x2,y2), imprima a dist�ncia entre eles.
 * A f�rmula que efetua tal c�culo utilizando os operadores matem�ticos adotados
 * fica d = rad(pot(x2-x1,2) + pot(y2-y1,2))
 */

package livroLogicaProgramacao;

import javax.swing.JOptionPane;

public class Pagina33DistanciaDoisPontos {

	public static void main(String[] args) {
		double xPontoA;
		double yPontoA;
		double xPontoB;
		double yPontoB;
		double preCalculoDistancia;
		double distancia;
		
		xPontoA = Integer.parseInt(JOptionPane.showInputDialog("Informe o eixo X da primeira posi��o"));
		yPontoA = Integer.parseInt(JOptionPane.showInputDialog("Informe o eixo Y da primeira posi��o"));
		xPontoB = Integer.parseInt(JOptionPane.showInputDialog("Informe o eixo X da segunda posi��o"));
		yPontoB = Integer.parseInt(JOptionPane.showInputDialog("Informe o eixo Y da segunda posi��o"));

		distancia = (Math.sqrt((Math.pow((xPontoB - xPontoA), 2)) + (Math.pow((yPontoB - yPontoA), 2))));

		System.out.println("A(" + xPontoA + "," + yPontoA + ")");		
		System.out.println("B(" + xPontoB + "," + yPontoB + ")");
		System.out.println("A distancia entre os pontos A e B �: " + distancia);
	}

}
