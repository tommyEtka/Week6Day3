package Week6Day3;

public class javaExercisesPrintPatterns4 {

	public static void main(String[] args) {

		String hash= "";
		String space = "        ";
		int i;

		for (i = 0; i < 8; i++) {
		hash+="#";
		space = space.substring(0, space.length() - 1);
		System.out.println(space + hash);
		}
		

	}

}

