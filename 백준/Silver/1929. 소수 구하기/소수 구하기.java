import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt();
		int N = sc.nextInt();

		// 에라토스테네스의 체
		boolean sieve[] = new boolean[N + 1];
		sieve[0] = sieve[1] = true; // 소수가 아닐때 true
		for (int i = 2; i < sieve.length; i++) {
			if (sieve[i] == true) {
				continue;
			} else {
				sieve[i] = false;
				for (int j = i + i; j <= N; j += i) {
					sieve[j] = true;
				}
			}
		}

//		// print
//		for(int i=0; i<sieve.length; i++) {
//			System.out.print(i + " "+sieve[i] + " ");
//			if(sieve[i]) {
//				System.out.println("소수가 아니다.");
//			} else {
//				System.out.println("소수다.");
//			}
//		}

		// answer
		for (int i = M; i < sieve.length; i++) {
			if (!sieve[i]) {
				System.out.println(i);
			}
		}
	}
}