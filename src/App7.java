import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App7 {
    public static void main(String[] args) throws Exception {
        System.out.println("請輸入月租費形式:");
        BufferedReader a1 = new BufferedReader(new InputStreamReader(System.in));
        String a = a1.readLine();
        int inta = Integer.parseInt(a);
        System.out.println("請輸入通話時間為:");
        BufferedReader b1 = new BufferedReader(new InputStreamReader(System.in));
        String b = b1.readLine();
        double doubleb = Double.parseDouble(b);
        double money = 0;
        double price = 0;

        if (inta == 186) {
            price = 0.09;
            money = price * doubleb;
            if (money > 186 && money < 372) {
                money *= 0.9;
            }
            if (money > 372) {
                money *= 0.8;
            }
            if (money <= 186) {
                money = 186;
            }
        }
        if (inta == 386) {
            price = 0.08;
            money = price * doubleb;
            if (money > 386 && money < 772) {
                money *= 0.8;
            }
            if (money > 772) {
                money *= 0.7;
            }
            if (money <= 386) {
                money = 386;
            }
        }
        if (inta == 586) {
            price = 0.07;
            money = price * doubleb;
            if (money > 586 && money < 1172) {
                money *= 0.7;
            }
            if (money > 1172) {
                money *= 0.6;
            }
            if (money <= 586) {
                money = 586;
            }
        }
        if (inta == 986) {
            price = 0.06;
            money = price * doubleb;
            if (money > 986 && money < 1972) {
                money *= 0.6;
            }
            if (money > 1972) {
                money *= 0.5;
            }
            if (money <= 986) {
                money = 986;
            }
        }
        System.out.println("通話費為:" + money);
    }
}