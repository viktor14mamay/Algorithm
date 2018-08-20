package leetcode.contest.week87;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Shortest {

	public static int shortestPathLength(int[][] graph) {

	}

	// A function used by DFS
	void dfs(int[][] graph, int v,boolean visited[], int visitedLen, int pathLen)
    {
        visited[v] = true;
        System.out.print("visited " + v + " ");
 
        for (int vertex:graph[v])
        {
            int n = i.next();
            if (!visited[n])
                DFSUtil(n, visited);
        }
    }

	private static final String INPUT_FILE = "input.txt";
	private static final String OUTPUT_FILE = "output.txt";

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(new File(INPUT_FILE));
		int q = scanner.nextInt();
		scanner.nextLine();

		try (PrintWriter writer = new PrintWriter(new FileWriter(new File(OUTPUT_FILE)))) {
			for (int qi = 0; qi < q; qi++) {

				int matrix[][] = readMatrixOneLined(scanner);

				writer.println(shortestPathLength(matrix));
			}
			scanner.close();
		}
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
