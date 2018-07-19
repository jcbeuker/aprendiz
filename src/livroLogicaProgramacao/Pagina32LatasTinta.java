/*
 * EXERCICIO PAGINA 32
 * Construa um algoritmo que calcule a quantidade de latas de tinta necessárias e o 
 * custo para pintar tanques cilíndricos de combustível, em que são fornecidos a altura
 * e o raio desse cilindro.
 * Sabendo que:
 * 	a lata de tinta custa $ 50,00;
 * 	cada lata contém 5 litros;
 * 	cada litro de tinta pinta 3 metros quadrados.
 * 	Dados de entrada: altura (H) e raio (R).
 * 	Dados de saída: custo (C) e quantidade (Q).
 * Utilizando o planejamento reverso, sabemos que:
 * 	o custo é dado pela quantidade de latas * R$ 50,00;
 * 	a quantidade de latas é dada pela quantidade total de litros/5;
 * 	a quantidade total de litros é dada pela área do cilindro/3;
 * 	a área do cilindro é dada pela área da base + área lateral;
 * 	a área da base é (Pi * pot(R,2));
 * 	a área lateral é altura * comprimento: (2 * Pi * R * H);
 * 	sendo que R (raio) e H (altura) são dados de entrada e Pi é uma constante de
 * 	valor conhecido: 3,14
 */
package livroLogicaProgramacao;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Pagina32LatasTinta {

	public static void main(String[] args) {
		//ENTRADA
		Double altura;
		altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do cilindro: "));

		Double raio;
		raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o raio do cilindro: "));


		//INTERNOS
		Double PI          = 3.14;
		Double areaLateral = (2 * PI * raio * altura);
		Double areaDaBase  = (PI * (Math.sqrt(raio)));
		Double areaCilindro = areaLateral + areaDaBase;
		Double quantidadeLitros = areaCilindro/3;
		
		Double quantidadeDeLatas = quantidadeLitros/5;
		
		Double custo = quantidadeDeLatas * 50.00;
		
		System.out.println("Quantidade de Latas: " + quantidadeDeLatas);
		System.out.println("Custo: R$" + custo);
	}

}
