/*
 * EXERC�CIO DA P�GINA 57 DO LIVRO L�GICA DE PROGRAMA��O
 * Elabore um algoritmo que efetue a soma de todos os n�meros �mpares que
 * s�o m�ltiplos de 3 e que se encontram no conjunto dos n�meros de 1 at� 2000.
 */
package livroLogicaProgramacao;

public class Pagina57SomaMultiplosDe3ImparesMenoresQue2000 {

	public static void main(String[] args) {

		int somaImparesMultiplosDe3 = 0;

		for (int contaNumeros = 0; contaNumeros <= 2000; contaNumeros++){
			if (contaNumeros % 2 == 1){ // o n�mero � �mpar
				if ( contaNumeros % 3 == 0){
					somaImparesMultiplosDe3 = somaImparesMultiplosDe3 + contaNumeros;
					System.out.println(contaNumeros);
				}
			}

		}

		System.out.println ("Soma = "+somaImparesMultiplosDe3);
	}

}
