/*
EXERC�CIO DA P�GINA 61 DO LIVRO L�GICA DE PROGRAMA��O
Verifica se um n�mero fornecido pelo usu�rio � primo ou n�o
 */
package livroLogicaProgramacao;

import javax.swing.JOptionPane;

public class Pagina61NumeroPrimo {

	public static void main(String[] args) {
		int numeroFornecido = 0;
		Double resto;
		int contadorDeDivisores = 0;
		int contadorRegressivo;
		int maiorDivisorMenorQueNumeroFornecido = numeroFornecido;
		int menorDivisorMaiorQueUm = 1;
		boolean primo = false;

		numeroFornecido = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero primo: "));
		do {
			for (contadorRegressivo = numeroFornecido; contadorRegressivo > 0; contadorRegressivo--) {
				resto = (double) (numeroFornecido % contadorRegressivo);
				if (resto == 0) {
					contadorDeDivisores = contadorDeDivisores + 1;
					if (contadorDeDivisores == 2) {
						maiorDivisorMenorQueNumeroFornecido = contadorRegressivo;
					}
					if (contadorRegressivo > 1) {
						menorDivisorMaiorQueUm = contadorRegressivo;
					}
				}
				if (contadorRegressivo == 1) {
					if ((contadorDeDivisores > 2) || (numeroFornecido == 1)) {
						System.out.println("O n�mero " + numeroFornecido + " n�o � primo, pois tem "
								+ contadorDeDivisores + " divisores. Maior divisor menor que o n�mero fornecido: " + maiorDivisorMenorQueNumeroFornecido
								+ ", Menor divisor maior que um: " + menorDivisorMaiorQueUm);
						numeroFornecido = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero primo: "));
						contadorRegressivo = numeroFornecido + 1;
						contadorDeDivisores = 0;
						primo = false;
					} else {
						System.out.println("O n�mero " + numeroFornecido + " � primo.");
						primo = true;
						contadorRegressivo = 0;
					}
				}
			}
		} while (primo == false);
	}
}
