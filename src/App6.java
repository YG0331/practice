import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App6 {
    public static void main(String[] args) throws Exception {
        System.out.println("請輸入一串數字:");
        BufferedReader m = new BufferedReader(new InputStreamReader(System.in));
        String string = m.readLine();
        String a[] = string.split("");
        int max[] = new int[a.length];
        int min[] = new int[a.length];
        int change = 0;
        int max1 = 0;
        int fmax = 0;
        int min1 = 0;
        int fmin = 0;

        for (int i = 0; i < a.length; i++) {
            // System.out.println(a[i]);
            max[i] = Integer.parseInt(a[i]);
            min[i] = Integer.parseInt(a[i]);
        }
        for (int j = 0; j < max.length - 1; j++) {
            for (int i = 0; i < max.length - 1; i++) {
                if (max[i] < max[i + 1]) {
                    change = max[i];
                    max[i] = max[i + 1];
                    max[i + 1] = change;
                }
                if (min[i] > min[i + 1]) {
                    change = min[i];
                    min[i] = min[i + 1];
                    min[i + 1] = change;
                }
            }
        }
        System.out.println("最大值為:");
        for (int i = 0; i < a.length; i++) {
            // System.out.println(max[i]);
            max1 = max[i];
            for (int j = a.length - i; j > 1; j--) {
                max1 = max1 * 10;
            }
            fmax += max1;
        }
        System.out.println(fmax);
        System.out.println("最小值為:");
        for (int i = 0; i < a.length; i++) {
            min1 = min[i];
            for (int j = a.length - i; j > 1; j--) {
                min1 = min1 * 10;
            }
            fmin += min1;
        }
        System.out.println(fmin);
        System.out.println("最大最小的差值為:");
        System.out.println(fmax - fmin);
    }
}
