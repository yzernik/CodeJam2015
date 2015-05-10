package io.github.yzernik.codejam2015.qualification;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int t = 0; t < T; t++) {

			int SMax = sc.nextInt();
			int clappers = 0;
			int guests = 0;

			String shynesses = sc.next();
			for (int i = 0; i < SMax + 1; i++) {
				int people = Character.getNumericValue(shynesses.charAt(i));

				if (people > 0) {
					int newGuests = Math.max(0, i - clappers);
					guests += newGuests;
					clappers += newGuests + people;
				}
			}

			String result = Integer.toString(guests);
			System.out.format("Case #%d: %s%n", t + 1, result);
		}

		sc.close();

	}

	public String solve() {
		return "";
	}
}