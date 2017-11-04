package Week6Day3;

public class javaExercisesPrintPatterns5 {

	public static void main(String[] args) {

		final int x = 7;
		final int y = 7;

		for (int i = 0; i < y; i++) {
			System.out.print("#");
		}
		System.out.println();
		for (int i = 0; i < x - 2; i++) {
			System.out.print("#");
			for (int j = 0; j < y - 2; j++) {
				System.out.print(" ");
			}
			System.out.println("#");
		}
		for (int i = 0; i < y; i++) {
			System.out.print("#");
		}
		System.out.println();

	}

}
