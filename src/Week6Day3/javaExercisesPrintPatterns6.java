package Week6Day3;

public class javaExercisesPrintPatterns6 {

	public static void main(String[] args) {

		String space = "";
		String hash = "#";
		
		for (int x = 0; x < 6; x++) {
			System.out.print(hash);
		}
		System.out.println();
		for (int x = 3; x >= 0; x--) {
			space+=" ";
			System.out.println(space + hash);
		
		}
		for (int x = 0; x < 6; x++) {
			System.out.print(hash);
		}
	
	}

}
