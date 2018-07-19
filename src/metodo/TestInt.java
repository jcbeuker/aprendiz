package metodo;

public class TestInt {

	public static void main(String[] args) {
		int a = 5;
		int s = computeSquare(a);
		System.out.println("Square root is " + s);
	}

	public static int computeSquare(int x){
		int sq;
		sq = (int) Math.sqrt(x);
		return sq;
	}
}
