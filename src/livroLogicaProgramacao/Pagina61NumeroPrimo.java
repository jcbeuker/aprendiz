/*
EXERCÍCIO DA PÁGINA 61 DO LIVRO LÓGICA DE PROGRAMAÇÃO
Verifica se um número fornecido pelo usuário é primo ou não
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

		numeroFornecido = Integer.parseInt(JOptionPane.showInputDialog("Digite um número primo: "));
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
						System.out.println("O número " + numeroFornecido + " não é primo, pois tem "
								+ contadorDeDivisores + " divisores. Maior divisor menor que o número fornecido: " + maiorDivisorMenorQueNumeroFornecido
								+ ", Menor divisor maior que um: " + menorDivisorMaiorQueUm);
						numeroFornecido = Integer.parseInt(JOptionPane.showInputDialog("Digite um número primo: "));
						contadorRegressivo = numeroFornecido + 1;
						contadorDeDivisores = 0;
						primo = false;
					} else {
						System.out.println("O número " + numeroFornecido + " é primo.");
						primo = true;
						contadorRegressivo = 0;
					}
				}
			}
		} while (primo == false);
	}
}
