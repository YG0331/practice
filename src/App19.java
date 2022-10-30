import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App19 {
    public static void main(String[] args) throws Exception {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("組數為:");
        String str = buff.readLine();
        int num = Integer.parseInt(str);
        String num11 = "";
        int temp = 0;
        for (int i = 1; i <= num; i++) {
            System.out.print("第" + i + "組");
            String num1 = buff.readLine();
            num11 = num11 + num1 + " ";
        }
        String[] fnum = num11.split(" ");
        int[] intfnum = new int[fnum.length];
        for (int i = 0; i < fnum.length; i++) {
            intfnum[i] = Integer.parseInt(fnum[i]);
        }
        for (int i = 1; i <= num; i++) {
            int ans = intfnum[temp] * 250 + intfnum[temp + 1] * 175;

            System.out.println("第" + i + "組應收費用:" + ans);
            temp += 2;
        }
    }
}
