package baekjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2588 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());

		System.out.println(A * (B % 10));
		System.out.println(A * ((B % 100) / 10));
		System.out.println(A * (B / 100));
		System.out.println(A * B);
	}
}