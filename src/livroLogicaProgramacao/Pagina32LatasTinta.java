/*
 * EXERCICIO PAGINA 32
 * Construa um algoritmo que calcule a quantidade de latas de tinta necess�rias e o 
 * custo para pintar tanques cil�ndricos de combust�vel, em que s�o fornecidos a altura
 * e o raio desse cilindro.
 * Sabendo que:
 * 	a lata de tinta custa $ 50,00;
 * 	cada lata cont�m 5 litros;
 * 	cada litro de tinta pinta 3 metros quadrados.
 * 	Dados de entrada: altura (H) e raio (R).
 * 	Dados de sa�da: custo (C) e quantidade (Q).
 * Utilizando o planejamento reverso, sabemos que:
 * 	o custo � dado pela quantidade de latas * R$ 50,00;
 * 	a quantidade de latas � dada pela quantidade total de litros/5;
 * 	a quantidade total de litros � dada pela �rea do cilindro/3;
 * 	a �rea do cilindro � dada pela �rea da base + �rea lateral;
 * 	a �rea da base � (Pi * pot(R,2));
 * 	a �rea lateral � altura * comprimento: (2 * Pi * R * H);
 * 	sendo que R (raio) e H (altura) s�o dados de entrada e Pi � uma constante de
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
