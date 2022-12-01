import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 데이터 담기 
		int N = Integer.valueOf(br.readLine());
		ArrayList<Integer> A = new ArrayList<>(N);
		String[] data = br.readLine().split(" ");
		for(int i=0; i<N; i++) {
			A.add(Integer.valueOf(data[i]));
		}
		ArrayList<Integer> B = new ArrayList<>(N);
		data = br.readLine().split(" ");
		for(int i=0; i<N; i++) {
			B.add(Integer.valueOf(data[i]));
		}
		
		Collections.sort(A);
		
		// B 안의 큰 숫자부터 표시할 인덱스 선언
		int[] idxB = new int[B.size()];
		for(int i=0; i<idxB.length; i++) {
			idxB[i] = -1;
		}
		
		// B 안의 숫자들 큰 순서대로 인덱스 표시하기
		idxB = makeIndex(B, idxB);
		
		// 만든 인덱스로 B의 제일 큰 값부터 sort된 A와 곱하기
		int sum = 0;
		for(int i=0; i<A.size(); i++) {
			int Btarget = 0;
			for(int j=0; j<B.size(); j++) {
				if(idxB[j] == i) {
					Btarget = B.get(j);
					break;
				}
			}
			sum += A.get(i) * Btarget;
		}
		System.out.println(sum);
	}

	private static int[] makeIndex(ArrayList<Integer> b, int[] idxB) {
		ArrayList<Integer> tempB = new ArrayList<Integer>();
		for(int i=0; i<b.size(); i++) {
			tempB.add(b.get(i));
		}
		
		// B를 내림차순으로 정렬
		Collections.sort(tempB, Collections.reverseOrder());
		
		for(int i=0; i<tempB.size(); i++) {
			int target = tempB.get(i); // 8
			for(int j=0; j<b.size(); j++) {
				if(b.get(j) == target && idxB[j] < 0) {
					idxB[j] = i;
					break;
				}
			}
		}
		return idxB;
	}
}
