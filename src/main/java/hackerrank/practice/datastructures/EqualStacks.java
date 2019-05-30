package hackerrank.practice.datastructures;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EqualStacks {

    private static long equalStacks(int[] h1, int[] h2, int[] h3) {
        int index1 = 0, index2 = 0, index3 = 0;
        long height1 = 0, height2 = 0, height3 = 0;

        for (int a : h1) {
            height1 += a;
        }
        for (int a : h2) {
            height2 += a;
        }
        for (int a : h3) {
            height3 += a;
        }

        while (height1 != height2 || height2 != height3) {
            if (height1 > height2) {
                if (height1 > height3) {
                    height1 -= h1[index1++];
                } else {
                    height3 -= h3[index3++];
                }
            } else {
                if (height2 > height3) {
                    height2 -= h2[index2++];
                } else {
                    height3 -= h3[index3++];
                }
            }
        }
        return height1;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("output_hackerrank.txt")))) {

            String[] n1N2N3 = scanner.nextLine().split(" ");

            int n1 = Integer.parseInt(n1N2N3[0].trim());

            int n2 = Integer.parseInt(n1N2N3[1].trim());

            int n3 = Integer.parseInt(n1N2N3[2].trim());

            int[] h1 = new int[n1];

            String[] h1Items = scanner.nextLine().split(" ");

            for (int h1Itr = 0; h1Itr < n1; h1Itr++) {
                int h1Item = Integer.parseInt(h1Items[h1Itr].trim());
                h1[h1Itr] = h1Item;
            }

            int[] h2 = new int[n2];

            String[] h2Items = scanner.nextLine().split(" ");

            for (int h2Itr = 0; h2Itr < n2; h2Itr++) {
                int h2Item = Integer.parseInt(h2Items[h2Itr].trim());
                h2[h2Itr] = h2Item;
            }

            int[] h3 = new int[n3];

            String[] h3Items = scanner.nextLine().split(" ");

            for (int h3Itr = 0; h3Itr < n3; h3Itr++) {
                int h3Item = Integer.parseInt(h3Items[h3Itr].trim());
                h3[h3Itr] = h3Item;
            }

            long result = equalStacks(h1, h2, h3);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }
    }
}
