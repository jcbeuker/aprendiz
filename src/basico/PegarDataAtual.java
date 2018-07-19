/*
 * Pegar a Data Atual em Java e adicionar um Ano
 */
package basico;

import java.util.Calendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class PegarDataAtual {

	public static void main(String[] args){

		final DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		final Calendar cal = Calendar.getInstance();
		System.out.println("Data Atual: " + df.format(cal.getTime()));

		//adicionar um ano à data atual e exibir
		cal.set(Calendar.DAY_OF_MONTH, cal.get(Calendar.DAY_OF_MONTH)+1);
		System.out.println("Daqui um dia será: " + df.format(cal.getTime()));

		cal.set(Calendar.MONTH, cal.get(Calendar.MONTH)+1);
		System.out.println("Daqui um mês será: " + df.format(cal.getTime()));

		cal.set(Calendar.YEAR, cal.get(Calendar.YEAR)+1);
		System.out.println("Daqui um ano será: " + df.format(cal.getTime()));		
	}


}
