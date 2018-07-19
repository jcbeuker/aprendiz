/*
 * EXERCÍCIO DA PÁGINA 46 DO LIVRO LÓGICA DE PROGRAMAÇÃO
 * Escreva um algoritmo que gere a série de Fibonacci até o trigésimo termo
 */
package livroLogicaProgramacao;

public class Pagina46SequenciaFibonacci {

	public static void main(String[] args) {
		double termoA = 1;
		double termoB = 0; 

		for (int i = 0; i <=30; i++){
			if (i != 0){
				termoA = termoA + termoB;
				termoB = termoA - termoB;
				System.out.println("Termo "+ i +": " +termoB);
			}
		}

	}

}
