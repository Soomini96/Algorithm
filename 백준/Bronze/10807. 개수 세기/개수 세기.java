import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());

        String[] data = br.readLine().split(" ");
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<data.length; i++) list.add(Integer.parseInt(data[i]));

        int targetNum = Integer.parseInt(br.readLine());
        int count = Collections.frequency(list, targetNum);
        System.out.println(count);
    }
}
