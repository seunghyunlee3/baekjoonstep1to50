package baekjoon3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baekjoon2741 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		for (int i = 1; i <= N; i++) {
			System.out.println(i);
		}
	}
}