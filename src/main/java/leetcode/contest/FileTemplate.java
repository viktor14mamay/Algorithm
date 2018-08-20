package leetcode.contest;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileTemplate {

	public static int solve(int[][] arr) {

	}
	
	private static final String INPUT_FILE = "input.txt";
	private static final String OUTPUT_FILE = "output.txt";
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(new File(INPUT_FILE));
		int q = scanner.nextInt();
		scanner.nextLine();

		try (PrintWriter writer = new PrintWriter(new FileWriter(new File(OUTPUT_FILE)))) {
			for (int qi = 0; qi < q; qi++) {
				// TODO
				//int array[] = readArray(scanner);

				int matrix[][] = readMatrixOneLined(scanner);

				writer.println(solve(A));
			}
			scanner.close();
		}
	}

	private static int[] readArray(Scanner scanner) {
		String tokens[] = scanner.nextLine().replaceAll("\\[|\\]", "").split(",");
		int len = tokens.length;
		int res[] = new int[len];
		for (int k = 0; k < len; k++) {
			res[k] = Integer.parseInt(tokens[k]);
		}
		System.out.println("Length of array is: " + len);
		return res;
	}

	private static int[][] readMatrix(Scanner scanner) {
		List<String> lines = new ArrayList<>();
		while (scanner.hasNextLine()) {
			lines.add(scanner.nextLine());
		}
		int len = lines.size();
		int res[][] = new int[len][];
		for (int k = 0; k < len; k++) {
			String tokens[] = lines.get(k).replaceAll("[|]|,", "").split(" ");
			int len2 = tokens.length;
			res[k] = new int[len2];
			for (int m = 0; m < len2; m++) {
				res[k][m] = Integer.parseInt(tokens[m]);
			}
		}
		System.out.println("Size of matrix is: " + len + " * " + res[0].length);
		return res;
	}

	private static int[][] readMatrixOneLined(Scanner scanner) {
		String lines[] = scanner.nextLine().split("(],)");
		int len = lines.length;
		int res[][] = new int[len][];

		for (int k = 0; k < len; k++) {
			String tokens[] = lines[k].replaceAll("]|\\[", "").split(",");
			int len2 = tokens.length;
			res[k] = new int[len2];
			for (int m = 0; m < len2; m++) {
				res[k][m] = Integer.parseInt(tokens[m]);
			}
		}
		System.out.println("Size of matrix is: " + len + " * " + res[0].length);
		return res;
	}
}