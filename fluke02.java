public class fluke02 {
	public static void main(String args[]) {
		int totalF = 4;
		for (int F1=1; F1 <= totalF; F1++) {
			// F2umn have 2 parts
			for (int F2=F1; F2 <= (F1+2); F2++) { System.out.print(F2); }
			for (int F2=1; F2 <= (2+F1); F2++) { System.out.print("*"); }
			System.out.println();
		}
	}
}
