package hackerrank.practice.strings;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SherlockAnagarams {
    // Complete the sherlockAndAnagrams function below.
    private static int sherlockAndAnagrams(String s) {
        int count = 0;
        int length = s.length();
        for (int len = 1; len < length; len++) {
            for (int i = 0; i < length - len; i++) {
                for (int j = i + 1; j < length - len + 1; j++) {
                    if (checkAnagram(s.substring(i, i + len), s.substring(j, j + len))) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    private static boolean checkAnagram(String a, String b) {
        int[] first = new int[26];
        int[] second = new int[26];

        for (char anA : a.toCharArray()) {
            first[anA - 'a']++;
        }
        for (char aB : b.toCharArray()) {
            second[aB - 'a']++;
        }

        for (int c = 0; c < 26; c++) {
            if (first[c] != second[c])
                return false;
        }

        return true;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("output_hackerrank.txt")))) {

            int q = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int qItr = 0; qItr < q; qItr++) {
                String s = scanner.nextLine();

                int result = sherlockAndAnagrams(s);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            }
        }
        scanner.close();
    }
}
