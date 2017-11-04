package Week6Day3;

public class javaExercisesPrintPatterns3 {

	public static void main(String[] args) {

		String hash= "#########";
		String space = "";
		int i;
		


		for (i = 0; i < 8; i++) {
		space+=" ";
		hash = hash.substring(0, hash.length() - 1);
		System.out.println(space + hash);
		}
		

	}

}

