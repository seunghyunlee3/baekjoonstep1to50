package baekjoon3;

import java.util.Scanner;

public class Baekjoon10871 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int X = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			int A = sc.nextInt();
			if (A < X) {
				System.out.print(A + " ");
			}
		}
	}
}