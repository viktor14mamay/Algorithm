package leetcode.contest.week97;

public class SpiralMatrix {

	public int[][] spiralMatrixIII(int R, int C, int r0, int c0) {
		int n = R * C;
		int res[][] = new int[n][2];
		int direction = 0;
		int len = 2;
		int usedLen = 0;
		int nextIdx = 0;
		int usedCells = 0;
		int currentX = r0, currentY = c0;
		while (usedCells < n) {
			if (0 <= currentX && currentX < R && 0 <= currentY && currentY < C) {
				res[nextIdx][0] = currentX;
				res[nextIdx][1] = currentY;
				usedCells++;
			}

			currentY -= (direction - 1);
			currentX -= (direction - 2);
			usedLen++;
			if (usedLen >= len) {
				usedLen = 1;
				len++;
			}
			direction = (direction + 1) % 4;

		}

		return res;

	}

}
