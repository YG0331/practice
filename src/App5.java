import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App5 {
    public static void main(String[] args) throws Exception {
        System.out.println("請輸入階層值M:");
        BufferedReader m = new BufferedReader(new InputStreamReader(System.in));
        String string = m.readLine();
        int m1 = Integer.parseInt(string);
        int ans = 1;
        int i;
        for (i = 1; ans < m1; i++) {
            ans *= i;
        }
        System.out.println("超過M為" + string + "最小N值為" + (i - 1));
    }
}
