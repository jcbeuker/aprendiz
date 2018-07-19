/*
 * EXERCÍCIO DA PÁGINA 57 DO LIVRO LÓGICA DE PROGRAMAÇÃO
 * Elabore um algoritmo que efetue a soma de todos os números ímpares que
 * são múltiplos de 3 e que se encontram no conjunto dos números de 1 até 2000.
 */
package livroLogicaProgramacao;

public class Pagina57SomaMultiplosDe3ImparesMenoresQue2000 {

	public static void main(String[] args) {

		int somaImparesMultiplosDe3 = 0;

		for (int contaNumeros = 0; contaNumeros <= 2000; contaNumeros++){
			if (contaNumeros % 2 == 1){ // o número é ímpar
				if ( contaNumeros % 3 == 0){
					somaImparesMultiplosDe3 = somaImparesMultiplosDe3 + contaNumeros;
					System.out.println(contaNumeros);
				}
			}

		}

		System.out.println ("Soma = "+somaImparesMultiplosDe3);
	}

}
