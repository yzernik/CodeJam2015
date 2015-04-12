package com.github.yzernik.codejam2015.qualification;

import java.util.Scanner;

public class B {

	public static void main(String[] args) {

		B a = new B();
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int t = 0; t < T; t++) {

			int D = sc.nextInt();
			int[] numPancakes = new int[D];
			for (int i = 0; i < D; i++) {
				numPancakes[i] = sc.nextInt();
			}

			String result = a.solve(D, numPancakes);
			System.out.format("Case #%d: %s%n", t + 1, result);
		}

		sc.close();

	}

	public String solve(int D, int[] numPancakes) {

		int bestTime = Integer.MAX_VALUE;

		for (int i = 1; i < 1001; i++) {
			int numMoves = 0;
			for (int j = 0; j < D; j++) {
				numMoves += (int) Math.ceil(numPancakes[j] * 1.0 / i) - 1;
			}
			int time = i + numMoves;
			if (time < bestTime) {
				bestTime = time;
			}

		}

		return Integer.toString(bestTime);
	}
}
