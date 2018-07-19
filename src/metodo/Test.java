/*
 * http://pt.wikihow.com/Chamar-um-M%C3%A9todo-no-Java
 */
package metodo;

public class Test {

	private String format = "";

	public static void methodExample(){

	}

	private static void main (String [] args){
		System.out.println("Hello world!");
	}

	protected String getFormat(){
		return this.format;
	}

	public void setFormat(){
		this.format = format;
	}

}
