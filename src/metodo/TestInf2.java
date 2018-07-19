package metodo;

public class TestInf2 {

	public static void main(String[] args) {
		int w = 5;
		int h = 2;
		int a = computeArea(w, h);
		System.out.println("Area is " + a);
	}

	public static int computeArea(int whidth, int height){
		int area;
		area = whidth * height;
		return area;
	}
}
