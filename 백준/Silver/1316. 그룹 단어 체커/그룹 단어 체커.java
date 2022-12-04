import java.util.Scanner;

public class Main { // 1316

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int no[] = new int[n];

		for (int i = 0; i < n; i++) { // happy
			String txt = sc.next();
			int word[] = new int[txt.length()];

			// 중복인가 체크
			for (int j = 0; j < txt.length(); j++) { // h a p p y
				txt.charAt(j);
				boolean check = false;
				for (int k = 0; k < word.length; k++) { // { , , , , }
					if (word[k] == txt.charAt(j)) {
						check = true;
					}
				}
				if (check) {
					if (txt.charAt(j - 1) != txt.charAt(j)) {
						no[i] = 1;
					}
				} else {
					word[j] = txt.charAt(j);
				}
			}
		}
		int cnt = 0;
		for (int i = 0; i < no.length; i++) {
			if (no[i] == 0) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}