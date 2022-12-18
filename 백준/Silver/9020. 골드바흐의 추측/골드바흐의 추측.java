import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main { // 골드바흐의 추측 -> 틀림
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 데이터값 저장 & max값 구하기
        int[] data = new int[n];
        int max = 0;
        for(int i=0; i<n; i++){
            data[i] = Integer.parseInt(br.readLine());
            if(max<data[i]) max = data[i];
        }

        // max값 입력받아서 거기까지의 소수 구하기
        boolean[] primeList = checkPrimeNumber(max);

        // 절반값까지만 골드바흐의 수 확인 & 두개 이상일 경우 후자 출력하기(두 수의 차이가 더 안난다는 의미이기 때문에)
        for(int i=0; i<data.length; i++){
            int[] answer = new int[2];
            for(int j=0; j<=data[i]/2; j++){
                int a = j;
                int b = data[i] - j;
                if(primeList[a] && primeList[b]) {
                    answer[0] = a;
                    answer[1] = b;
                }
            }
            System.out.println(answer[0] + " " + answer[1]);
        }
    }

    // num까지 소수인지 확인해서 boolean 배열 만들기
    private static boolean[] checkPrimeNumber(int num) {
        boolean[] check = new boolean[num+1];
        for(int i=0; i<check.length; i++){
            if(i == 0 || i==1) check[i] = false;
            else check[i] = isItPrime(i);
        }
        return check;
    }

    // num이 소수이면 true
    private static boolean isItPrime(int num) {
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num%i == 0) return false;
        }
        return true;
    }
}
