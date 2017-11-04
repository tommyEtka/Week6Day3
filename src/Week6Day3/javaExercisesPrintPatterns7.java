package Week6Day3;

public class javaExercisesPrintPatterns7 {

	public static void main(String[] args) {

		//int n = 6;
		String hash = "#";
		
		// for (int x = 0; x < n; x++) {
		for (int x = 0; x < 6; x++) {
			System.out.print(hash);
		}
		System.out.println();
		// for (int x = n-3; x >= 0; x--) {
		for (int x = 3; x >= 0; x--) {
			for (int y = x; y >= 0; y--) {
				System.out.print(" ");
			}
			System.out.println(hash);
		}
		
		for (int x = 0; x < 6; x++) {
			System.out.print(hash);
		}
	}

}
