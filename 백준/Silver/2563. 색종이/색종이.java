import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main { // 색종이

    static boolean[][] area = new boolean[100][100];
    static final int size = 10;

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.valueOf(br.readLine());
            for(int i=0; i<N; i++){
                String temp[] = br.readLine().split(" ");
                int x = Integer.valueOf(temp[0]);
                int y = Integer.valueOf(temp[1]);
                paintArea(x,y);
            }
        } catch (NumberFormatException e){
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }

        int num = checkColor(area);
        System.out.println(num);
    }

    private static int checkColor(boolean[][] area) {
        int cnt = 0;
        for(int i=0; i<area.length; i++){
            for (int j=0; j<area[i].length; j++){
                if(area[i][j]) cnt ++;
            }
        }
        return cnt;
    }

    private static void paintArea(int x, int y) {
        for(int i=x; i<x + size; i++){
            for(int j=y; j<y+size; j++){
                area[i][j] = true;
            }
        }
    }
}
