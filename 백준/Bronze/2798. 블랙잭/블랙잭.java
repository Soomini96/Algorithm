import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] condition = br.readLine().split(" ");
		
		int N = Integer.valueOf(condition[0]);
		int M = Integer.valueOf(condition[1]);
		
		ArrayList<Integer> cardList = new ArrayList<Integer>();
		String[] card = br.readLine().split(" ");
		
		for(int i=0; i<N; i++) {
			cardList.add(Integer.valueOf(card[i]));
		}
		
		int result = 0;
		for(int i=0; i<cardList.size(); i++) {
			for(int j=0; j<cardList.size(); j++) {
				for(int k=0; k<cardList.size(); k++) {
					int sum = cardList.get(i) + cardList.get(j) + cardList.get(k);
					if(sum <= M && i!=j && j!=k && k!=i) {
						result = Math.max(result, sum);
					}
				}
			}
		}
		
		System.out.println(result);
	}
}
