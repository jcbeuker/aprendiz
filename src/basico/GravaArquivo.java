package basico;
import java.util.*;
import java.io.*;

public class GravaArquivo{
	
@SuppressWarnings("resource")
public static void main(String[] args){
    System.out.print("Escreva o texto: ");
    Scanner scan = new Scanner(System.in);
    String numEnome = scan.nextLine();
    try {
        FileWriter arquivo = new FileWriter(new File("D:\\Thays.txt"));
        arquivo.write(numEnome);
        arquivo.close();
         }
    catch (IOException e) {
            e.printStackTrace();
         }
    catch (Exception e) {
            e.printStackTrace();
         } 

}
}