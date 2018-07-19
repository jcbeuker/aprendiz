package basico;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

/**
 * Demonstra como utilizar um JOptionPane.showConfirmDialog para requisitar senhas do usuário
 * @author Eduardo Costa - www.dimensaotech.com
 *
 */
public class JOptionPassword {
	static String SENHA = "123";
	public static void main(String args[])
	{
		//Criar a mensagem sera exibida
		JLabel label = new JLabel("Digite a senha:");
		//criar o componente grafico que recebera o que for digitado
		JPasswordField jpf = new JPasswordField();
		//Exibir a janela para o usuario
		JOptionPane.showConfirmDialog(null,
				new Object[]{label, jpf}, "Senha:",
				JOptionPane.OK_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE);
		//Pegamos o que foi digitado e comparamos com a senha correta
		String senhaDigitada = new String(jpf.getPassword());
		if (SENHA.equals(senhaDigitada))
			System.out.println("Senha correta");
		else
			System.out.println("Senha incorreta");
	}
}
