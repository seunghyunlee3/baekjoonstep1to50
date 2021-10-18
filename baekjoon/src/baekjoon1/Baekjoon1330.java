package baekjoon1;

import java.util.Scanner;

public class Baekjoon1330 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = 0, B = 0;

		A = sc.nextInt();
		B = sc.nextInt();

		if (A > B) {
			System.out.println(">");
		} else if (A < B) {
			System.out.println("<");
		} else if (A == B) {
			System.out.println("==");
		}
	}
}