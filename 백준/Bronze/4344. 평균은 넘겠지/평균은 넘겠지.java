import java.util.Scanner;

public class Main { // 4344
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt = sc.nextInt();
		for(int i=0; i<cnt; i++) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			
			// 성적 저장
			double sum = 0;
			for(int j=0; j<n; j++) {
				int score = sc.nextInt();
				arr[j] = score;
				sum += score;
			}
			
			// 평균 넘나 확인
			double avg = sum/n;
			double check = 0;
			for(int j=0; j<n; j++) {
				if(arr[j]>avg) {
					check ++;
				}
			}
			
			// print
			System.out.printf("%.3f%%\n",check/n*100);
		}
	}
}
