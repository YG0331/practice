import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App13 {
    public static void main(String[] args) throws Exception {
        System.out.println("請輸入一個正整數:");
        BufferedReader newnum = new BufferedReader(new InputStreamReader(System.in));
        String numString1 = newnum.readLine();
        String num[] = numString1.split("");
        String num1[] = new String[num.length / 2];
        String num2[] = new String[num.length / 2];
        int j = num.length - 1;
        System.out.println(j);
        if (num.length % 2 == 1) {
            for (int i = 0; i < (num.length / 2) - 0.5; i++) {
                num1[i] = num[i];
                System.out.println(num1[i]);
            }
            for (int i = 0; i < (num.length / 2) - 0.5; i++) {
                num2[i] = num[j - i];
                System.out.println(num2[i]);
            }
        } else {
            for (int i = 0; i < num.length / 2; i++) {
                num1[i] = num[i];
                System.out.println(num1[i]);
            }
            for (int i = 0; i < num.length / 2; i++) {
                num2[i] = num[j - i];
                System.out.println(num2[i]);
            }
        }

        int ans = 0;

        // 下面這個FOR迴圈有問題
        for (int i = 0; i < num2.length; i++) {
            if (num1[i] == num2[i]) {
                ans += 1;
                System.out.println(ans);
            }
        }

        if (ans == num1.length) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
