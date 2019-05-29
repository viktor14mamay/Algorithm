package leetcode.contest.week97;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class EggDrop {

	public static int superEggDrop(int K, int N) {
		return 0;
	}

	private static final String INPUT_FILE = "input.txt";
	private static final String OUTPUT_FILE = "output.txt";

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(new File(INPUT_FILE));
		int q = scanner.nextInt();
		scanner.nextLine();

		try (PrintWriter writer = new PrintWriter(new FileWriter(new File(OUTPUT_FILE)))) {
			for (int qi = 0; qi < q; qi++) {
				int k = scanner.nextInt();
				int n = scanner.nextInt();

				writer.println(superEggDrop(k, n));
			}
			scanner.close();
		}
	}
}
