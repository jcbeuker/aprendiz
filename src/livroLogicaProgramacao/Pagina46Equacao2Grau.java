/*
 * EXERC�CIO DA P�GINA 46 DO LIVRO L�GICA DE PROGRAMA��O
 * Calcular as ra�zes de uma equ��o do 2� Grau
 */
package livroLogicaProgramacao;

import javax.swing.JOptionPane;

public class Pagina46Equacao2Grau {

	public static void main(String[] args) {
		Double A;
		Double B;
		Double C;
		Double X1;
		Double X2;

		A = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de A: "));
		B = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de B: "));
		C = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de C: "));

		montaEquacao(A, B, C);

		Double Delta = calculaDelta (A, B, C);

		if (Delta >= 0){
			if (Delta == 0){
				X1 = ((- B) + (Math.sqrt(Delta))) / (2 * A);
				System.out.println("A equa��o possui apenas uma raiz: "+X1);

			}
			else {

				X1 = ((- B) + (Math.sqrt(Delta))) / (2 * A);
				X2 = ((- B) - (Math.sqrt(Delta))) / (2 * A);
				System.out.println("A equa��o possui duas ra�zes: X1 = "+X1 +" e X2 = "+ X2);
			}
		}
		else
		{
			System.out.println("Esta equa��o n�o tem raiz.");
		}

	}

	
	public static void montaEquacao(Double termoA, Double termoB, Double termoC){
		Double A = termoA;
		Double B = termoB;
		Double C = termoC;
		if (A >= 0){
			if (B >= 0){
				if (C >= 0){
					System.out.println("Equa��o: "+A+"X� + "+B+"X + "+ C +" = 0");
				} else {
					System.out.println("Equa��o: "+A+"X� + "+B+"X "+C+" = 0");
				}
			} else {
				if (C >= 0){
					System.out.println("Equa��o: "+A+"X� "+B+"X + "+C+" = 0");
				} else {
					System.out.println("Equa��o: "+A+"X� "+B+"X "+C+" = 0");
				}
			}
		} else {
			if ( B >= 0){
				if (C >= 0){
					System.out.println("Equa��o: "+A+"X� + "+B+"X + "+C+" = 0");
				} else {
					System.out.println("Equa��o: "+A+"X� + "+B+"X "+C+" = 0");
				}
			} else {
				if (C >= 0){
					System.out.println("Equa��o: "+A+"X� "+B+"X + "+C+" = 0");
				} else {
					System.out.println("Equa��o: "+A+"X� "+B+"X "+C+" = 0");
				}
			}
		}

	}

	public static Double calculaDelta(Double termoA, Double termoB, Double termoC){
		Double A = termoA;
		Double B = termoB;
		Double C = termoC;
		Double valorDelta;

		valorDelta = ((Math.pow (B , 2) - (4 * A * C)));
		System.out.println("Delta: "+valorDelta);
		return valorDelta;
	}
}
