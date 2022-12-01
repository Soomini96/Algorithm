import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int answer = 0;
		
		for(int i=0; i<8; i++) {
			int white = 0;
			int black = 0;
			
			String temp[] = br.readLine().split("");
			for(int j=0; j<temp.length; j++) {
//				System.out.print(temp[j] + " ");
				if(j%2==0 && temp[j].equals("F")) {
					white ++;
				}else if(j%2==1 && temp[j].equals("F")) {
					black ++;
				}
			}
			
			if(i%2==0) { // 홀수줄 -> 화이트 저장!
				answer += white;
			}else { // 짝수줄 -> 블랙 저장!
				answer += black;
			}
//			System.out.println();
		}

		System.out.println(answer);
		br.close();
	}
}
