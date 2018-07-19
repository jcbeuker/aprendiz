/*
 * EXERCÍCIO DA PÁGINA 61 DO LIVRO LÓGICA DE PROGRAMAÇÃO
 * Ler um conjunto de 20 números e mostrar qual foi o  
 * maior e o menor valor fornecido.
 */

package livroLogicaProgramacao;

import javax.swing.JOptionPane;

public class Pagina61LerVinteNumerosMaiorMenor {

	public static void main(String[] args) {
		Double numeroInformado = 0.0;
		Double maiorNumero = 0.0;
		Double menorNumero = 0.0;
		int contador = 0;
		
		numeroInformado = Double.parseDouble(JOptionPane.showInputDialog("Digite o 1º numero:"));
		contador = contador + 1;
		maiorNumero = numeroInformado;
		menorNumero = numeroInformado;

		while (contador < 20){
			contador = contador + 1;
			numeroInformado = Double.parseDouble(JOptionPane.showInputDialog("Digite o " +contador+"º numero:"));
			
			if (numeroInformado >= maiorNumero){
				maiorNumero = numeroInformado;
			}
			
			if (numeroInformado <= menorNumero){
				menorNumero = numeroInformado;
			}
		}

		System.out.println("O maior número digitado foi: "+maiorNumero+ " .\nO menor número digitado foi: "+menorNumero);

	}

}
