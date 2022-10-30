import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App15 {
    public static void main(String[] args) throws Exception {
        System.out.println("請輸入一組四位數字:");
        BufferedReader string = new BufferedReader(new InputStreamReader(System.in));
        String str = string.readLine();
        String ans[] = str.split("");
        int intans[] = new int[ans.length];
        for (int i = 0; i < ans.length; i++) {
            intans[i] = Integer.parseInt(ans[i]);
            intans[i] = (intans[i] + 7) % 10;
        }
        int a = 0;
        a = intans[0];
        intans[0] = intans[2];
        intans[2] = a;
        a = intans[1];
        intans[1] = intans[3];
        intans[3] = a;
        for (int i = 0; i < intans.length; i++) {
            System.out.print(intans[i]);
        }

    }
}