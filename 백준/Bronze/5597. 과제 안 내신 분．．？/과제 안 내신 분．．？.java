import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main { // 과제 안내신 분 ..?
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] totalList = new boolean[30];

        for(int i=0; i<28; i++){
            totalList[Integer.parseInt(br.readLine().trim())-1] = true;
        }
        for(int i=0; i<totalList.length; i++){
            if(!totalList[i]) System.out.println(i+1);
        }
    }
}
