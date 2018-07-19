/*
 * EXERCÍCIO DA PÁGINA 54
 * Adivinhe o número digitado. Como dica, a cada tentativa é dito se o chute
 * foi alto ou foi baixo. Ao final, será mostrado quantas tentativas 
 * foram necessárias para se descobrir o número.
 */
package livroLogicaProgramacao;

import javax.swing.JOptionPane;

public class Pagina54AdivinheNumeroDigitado {
	

	public static void main(String[] args) {
		int numeroDigitado; // número inicial a ser descoberto
		numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro a ser adivinhado."));

		String mensagem = calculaNumero(numeroDigitado);

		JOptionPane.showMessageDialog(null,mensagem);
	}

	public static String calculaNumero (int descobreNumero) {
		int contaChute = 0; // conta a quantidade de tentivas para se descobrir o número.
		int tentativaDeAcerto = 0; // número digitado na tentiva de acerto do número a ser descoberto;
		do {
			tentativaDeAcerto = Integer.parseInt(JOptionPane.showInputDialog("Digite o número inteiro que você imagina ser o digitado."));
			contaChute = contaChute + 1;
			if (tentativaDeAcerto > descobreNumero) {
				String msg = "Chute alto!";
				JOptionPane.showMessageDialog(null,msg);
			} else {
				if (tentativaDeAcerto < descobreNumero){
					String msg = "Chute baixo!";
					JOptionPane.showMessageDialog(null,msg);
				}
			}
		} while (descobreNumero != tentativaDeAcerto);
		
		int numeroGravado = descobreNumero;
		String descobrimentoDoNumero = "Você acertou. Em "+ contaChute +" tentativa(s). O número digitado foi "+numeroGravado+".";
		return descobrimentoDoNumero;
	}
}
