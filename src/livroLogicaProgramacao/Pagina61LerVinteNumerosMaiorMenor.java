/*
 * EXERC�CIO DA P�GINA 61 DO LIVRO L�GICA DE PROGRAMA��O
 * Ler um conjunto de 20 n�meros e mostrar qual foi o  
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
		
		numeroInformado = Double.parseDouble(JOptionPane.showInputDialog("Digite o 1� numero:"));
		contador = contador + 1;
		maiorNumero = numeroInformado;
		menorNumero = numeroInformado;

		while (contador < 20){
			contador = contador + 1;
			numeroInformado = Double.parseDouble(JOptionPane.showInputDialog("Digite o " +contador+"� numero:"));
			
			if (numeroInformado >= maiorNumero){
				maiorNumero = numeroInformado;
			}
			
			if (numeroInformado <= menorNumero){
				menorNumero = numeroInformado;
			}
		}

		System.out.println("O maior n�mero digitado foi: "+maiorNumero+ " .\nO menor n�mero digitado foi: "+menorNumero);

	}

}
