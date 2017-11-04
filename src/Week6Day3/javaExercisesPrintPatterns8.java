package Week6Day3;

public class javaExercisesPrintPatterns8 {

	public static void main(String[] args) {
		String space = "";
		String hash = "#";
		String hashDiff;
		
		for (int x = 0; x < 6; x++) {
			System.out.print(hash);
		}
		System.out.println();
		for (int x = 3; x >= 0; x--) {
			space+=" ";
			hashDiff = hash + space + hash;
			System.out.println(space + hash + hashDiff);
		}
		
		for (int x = 0; x < 6; x++) {
			System.out.print(hash);
		}

	}

}
