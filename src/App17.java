import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App17 {
    public static void main(String[] args) throws Exception {
        System.out.println("請輸入撲克牌:");
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String str = input.readLine();
        String[] string = str.split(" ");
        int[] int1 = new int[string.length];
        int ans = 0;

        for (int i = 0; i < string.length; i++) {
            if (string[i].equals("A")) {
                string[i] = "1";
            }
            if (string[i].equals("J")) {
                string[i] = "11";
            }
            if (string[i].equals("Q")) {
                string[i] = "12";
            }
            if (string[i].equals("K")) {
                string[i] = "13";
            }
            int1[i] = Integer.parseInt(string[i]);
            ans += int1[i];
        }
        System.out.println(ans);
    }
}
