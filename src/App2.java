import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App2 {

    public static void main(String[] args) throws Exception {
        System.out.println("輸入一個度數(正整數)");
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
        String stringa = a.readLine();
        double inta = Integer.parseInt(stringa);
        double summer = 0;
        double notsummer = 0;
        if (inta <= 120) {
            summer = inta * 2.1;
            notsummer = inta * 2.1;
        }
        if (inta <= 330 && inta > 120) {
            summer = inta * 3.02;
            notsummer = inta * 2.68;
        }
        if (inta <= 500 && inta > 330) {
            summer = inta * 4.39;
            notsummer = inta * 3.61;
        }
        if (inta <= 700 && inta > 500) {
            summer = inta * 4.97;
            notsummer = inta * 4.01;
        }
        if (inta > 701) {
            summer = inta * 5.63;
            notsummer = inta * 4.5;
        }
        System.out.println("夏月" + summer);
        System.out.println("非夏月" + notsummer);

    }
}
