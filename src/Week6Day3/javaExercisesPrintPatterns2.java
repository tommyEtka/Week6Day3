package Week6Day3;

public class javaExercisesPrintPatterns2 {

	public static void main(String[] args) {

		String hash = "#########";

		for (int i = 0; i < 8; i++) {

			hash = hash.substring(0, hash.length() - 1);
			System.out.println(hash);
		}
	}

}
