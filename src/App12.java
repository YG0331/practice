import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App12 {
    public static void main(String[] args) throws Exception {
        System.out.println("請輸入一個整數序列:");
        BufferedReader num = new BufferedReader(new InputStreamReader(System.in));
        String num1 = num.readLine();
        String arraynum[] = num1.split(" ");
        int intarray[] = new int[arraynum.length];
        for (int i = 0; i < arraynum.length; i++) {
            intarray[i] = Integer.parseInt(arraynum[i]);
        }

        for (int i = 0; i < intarray.length; i++) {
            for (int j = 0; j + 1 < intarray.length; j++) {
                if (intarray[j] < intarray[j + 1]) {
                    int a = intarray[j];
                    intarray[j] = intarray[j + 1];
                    intarray[j + 1] = a;
                }
            }
        }

        int a = 1;
        int ans = 0;

        for (int i = 0; i + 1 < intarray.length; i++) {
            // System.out.println(intarray[i]);
            if (intarray[i] == intarray[i + 1]) {
                a += 1;
            } else {
                if (a > (intarray.length) / 2) {
                    System.out.println(intarray[i]);
                    return;
                }
                a = 1;
            }
        }
        if (ans == 0) {
            System.out.println("NOPE");
        }

    }
}
