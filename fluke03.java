public class fluke03 {
	public static void main(String args[])   {
		int totalF = 4;
		for (int F1=1; F1 <= totalF; F1++) {
			// F2umn have 3 parts 
			System.out.print(F1 + "" + (F1 + 4));
			for (int F2=1; F2 <= (4 + F1); F2++) { 
				System.out.print("*"); 
			}
			System.out.println();
		}
	}
}
