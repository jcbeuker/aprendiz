/*
 * P�GINA 58 DO LIVRO L�GICA DE PROGRAMA��O
 * Elabore um algoritmo que simule uma contagem regressiva de 10 minutos, ou
 * seja, mostre 10:00, e ent�o 09:59, 09:58,...,09:00, at� 00:00.
 */
package livroLogicaProgramacao;

public class Pagina58ContagemRegressiva {
	public static void main(String[] args) {
		int minutos  = 10;
		int segundos = 0;

		System.out.println(minutos+":"+segundos);

		for (minutos = minutos -1 ;minutos >=0; minutos--){		
			for (segundos = 59; segundos >= 0; segundos--){
				System.out.println(minutos+":"+segundos);
			}
		}
	}
}
