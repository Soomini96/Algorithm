import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main { // 1546
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		double max = 0;

		String scores = br.readLine();
		String temp[] = scores.split(" ");
		double score[] = new double[n];
		// score에 저장 & max값 알아내기
		for (int i = 0; i < n; i++) {
			score[i] = Integer.parseInt(temp[i]);
			if (score[i] > max) {
				max = score[i];
			}
		}
		// 공식대로 점수 전환하기 & total값 구하기
		double sum = 0;
		for (int i = 0; i < n; i++) {
			score[i] = score[i] * 100 / max;
			sum += score[i];
		}
		System.out.println(sum / n);
	}
}