import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String temp[] = br.readLine().split(" ");
		
		int N = Integer.parseInt(temp[0]);
		int M = Integer.parseInt(temp[1]);
		
		HashSet<String> nList = new HashSet();
		ArrayList<String> answer = new ArrayList<String>();
		for(int i=0; i<N; i++) {
			nList.add(br.readLine());
		}
		for(int i=0; i<M; i++) {
			String name = br.readLine();
			if(nList.contains(name)) {
				answer.add(name);
			}
		}
		
		Collections.sort(answer);
		
		System.out.println(answer.size());
		for(int i=0; i<answer.size(); i++) {
			System.out.println(answer.get(i));
		}
		
	}

}
