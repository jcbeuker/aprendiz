/*
 * EXERC�CIO DA P�GINA 54
 * Adivinhe o n�mero digitado. Como dica, a cada tentativa � dito se o chute
 * foi alto ou foi baixo. Ao final, ser� mostrado quantas tentativas 
 * foram necess�rias para se descobrir o n�mero.
 */
package livroLogicaProgramacao;

import javax.swing.JOptionPane;

public class Pagina54AdivinheNumeroDigitado {
	

	public static void main(String[] args) {
		int numeroDigitado; // n�mero inicial a ser descoberto
		numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero inteiro a ser adivinhado."));

		String mensagem = calculaNumero(numeroDigitado);

		JOptionPane.showMessageDialog(null,mensagem);
	}

	public static String calculaNumero (int descobreNumero) {
		int contaChute = 0; // conta a quantidade de tentivas para se descobrir o n�mero.
		int tentativaDeAcerto = 0; // n�mero digitado na tentiva de acerto do n�mero a ser descoberto;
		do {
			tentativaDeAcerto = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero inteiro que voc� imagina ser o digitado."));
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
		String descobrimentoDoNumero = "Voc� acertou. Em "+ contaChute +" tentativa(s). O n�mero digitado foi "+numeroGravado+".";
		return descobrimentoDoNumero;
	}
}
