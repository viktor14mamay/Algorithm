package hackerrank.practice.datastructures;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BalancedBrackets {

    // Complete the isBalanced function below.
    private static String isBalanced(String s) {
        List<Character> leftBrackets = Arrays.asList('(', '{', '[');
        List<Character> rightBrackets = Arrays.asList(')', '}', ']');
        ArrayDeque<Character> stack = new ArrayDeque<Character>();

        for (char ch : s.toCharArray()) {
            if (leftBrackets.contains(ch)) {
                stack.addLast(ch);
            } else {
                if (stack.isEmpty()) {
                    return "NO";
                }
                char topChar = stack.pollLast();
                if (leftBrackets.indexOf(topChar) != rightBrackets.indexOf(ch)) {
                    return "NO";
                }
            }
        }
        if (!stack.isEmpty()) {
            return "NO";
        }
        return "YES";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("output_hackerrank.txt")))) {

            int t = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int tItr = 0; tItr < t; tItr++) {
                String s = scanner.nextLine();

                String result = isBalanced(s);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            }
        }

        scanner.close();
    }
}
