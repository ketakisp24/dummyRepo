package selenium;

public class Math {

	public static void main(String[] args) {
		Math m1 = new Math();
		System.out.println(m1.cube(5));
	}
	
	public int square(int n) {
		int square = (n*n);
		return square;
	}

	public int cube(int n){
		int cube = (n*n*n);
		return cube;
	}
}
