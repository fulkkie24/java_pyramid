public class fluke01{
	public static void main(String args[]) {
		int totalF = 4;
		for (int F1=1; F1 <= totalF; F1++) {
			// F2umn have 4 parts 
			for (int F2=2; F2 <= F1; F2++) { System.out.print(" "); }
			System.out.print(F1 + "" + F1);
			for (int F2=totalF; F2 >= (F1 + 1); F2--) { System.out.print("**"); }
			System.out.println( F1 + "" + F1);
		}
	}
}
