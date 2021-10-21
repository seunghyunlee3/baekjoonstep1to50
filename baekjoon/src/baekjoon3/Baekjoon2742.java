package baekjoon3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon2742 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());

		for (int i = N; i >= 1; i--) {
			bw.write(i + "\n");
		}
		bw.flush(); // 항상 무조건 필수 비우고 닫아야함
		bw.close();
	}
}