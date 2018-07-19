/*
 * EXERCÍCIO DA PÁGINA 46 DO LIVRO LÓGICA DE PROGRAMAÇÃO
 * Recebe a data de nascimento de uma pessoa, calcula a idade
 * e informa se essa pessoa já tem idade para votar e/ou conseguir CNH
 */

package livroLogicaProgramacao;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JOptionPane;

public class Pagina46CalcularIdade {

	public static void main(String[] args) throws Exception {
		String dataNascimento;
		int diaNascimento;
		int mesNascimento;
		int anoNascimento;
		String dataAtual;
		int diaAtual;
		int mesAtual;
		int anoAtual;
		int idade = 0;

		dataNascimento = JOptionPane.showInputDialog("Informe a data do seu nascimento.");
		System.out.println("Data de Nascimento: " +dataNascimento);
		diaNascimento = Integer.parseInt(dataNascimento.substring(0,2));
		mesNascimento = Integer.parseInt(dataNascimento.substring(3,5));
		anoNascimento = Integer.parseInt(dataNascimento.substring(6));

		final DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
		final Calendar cal = Calendar.getInstance();

		dataAtual = df.format(cal.getTime());
		System.out.println("Data Atual: " + dataAtual);
		diaAtual = Integer.parseInt(dataAtual.substring(0,2));
		mesAtual = Integer.parseInt(dataAtual.substring(3,5));
		anoAtual = cal.get(Calendar.YEAR);

		if (anoNascimento <= anoAtual) {
			if ((diaNascimento <= diaAtual) && (mesNascimento <= mesAtual)){
				// Se já fez aniversário nesse ano
				idade = (anoAtual - anoNascimento);
			} else {
				// Se ainda não fez aniversário nesse ano
				idade = (anoAtual - anoNascimento -1);
			}
		}

		if (idade < 0){
			System.out.println("Corrija a data de nascimento informada.");
		} else {
			if (idade >= 1){
				System.out.println("Idade: " +idade+" ano(s).");
				if ((idade >= 16) && (idade < 18)){
					System.out.println("Logo, você já pode votar nas próximas eleições.");
				}
				if (idade >= 18){
					System.out.println("Logo, você já deve votar nas próximas eleições e já pode conseguir a CNH.");
				}
			} else {
				if (anoAtual == anoNascimento){
					if (mesAtual == mesNascimento){
						idade = (diaAtual - diaNascimento);
						System.out.println("Idade: " +idade+" dia(s).");
					} else {
						idade = (mesAtual - mesNascimento);
						System.out.println("Idade: " +idade+" mese(s).");
					}
				} else {
					if (anoAtual > anoNascimento){
						if (mesAtual <= mesNascimento){
							if (diaAtual >= diaNascimento){
								idade = (mesAtual + (12 - mesNascimento));
							} else {
								idade = ((mesAtual - 1) + (12 - mesNascimento));	
							}
							System.out.println("Idade: " +idade+" mese(s).");
						} 
					}
				}
			}
		}
	}
}