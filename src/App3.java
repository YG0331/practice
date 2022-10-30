import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App3 {

    public static void main(String[] args) throws Exception {
        System.out.println("請輸入西元年:");
        BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
        String string = bReader.readLine();
        int int1 = Integer.parseInt(string);

        String[] a1 = new String[12];
        a1[0] = "雞";
        a1[1] = "狗";
        a1[2] = "豬";
        a1[3] = "鼠";
        a1[4] = "牛";
        a1[5] = "虎";
        a1[6] = "兔";
        a1[7] = "龍";
        a1[8] = "蛇";
        a1[9] = "馬";
        a1[10] = "羊";
        a1[11] = "猴";

        if (int1 % 12 == 1) {
            System.out.println(a1[0]);
        }
        if (int1 % 12 == 2) {
            System.out.println(a1[1]);
        }
        if (int1 % 12 == 3) {
            System.out.println(a1[2]);
        }
        if (int1 % 12 == 4) {
            System.out.println(a1[3]);
        }
        if (int1 % 12 == 5) {
            System.out.println(a1[4]);
        }
        if (int1 % 12 == 6) {
            System.out.println(a1[5]);
        }
        if (int1 % 12 == 7) {
            System.out.println(a1[6]);
        }
        if (int1 % 12 == 8) {
            System.out.println(a1[7]);
        }
        if (int1 % 12 == 9) {
            System.out.println(a1[8]);
        }
        if (int1 % 12 == 10) {
            System.out.println(a1[9]);
        }
        if (int1 % 12 == 11) {
            System.out.println(a1[10]);
        }
        if (int1 % 12 == 0) {
            System.out.println(a1[11]);
        }
    }
}
