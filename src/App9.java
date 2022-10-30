import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App9 {
    public static void main(String[] args) throws Exception {
        System.out.println("請輸入S1為:");
        BufferedReader s11 = new BufferedReader(new InputStreamReader(System.in));
        String strings1 = s11.readLine();
        System.out.println("請輸入S2為");
        BufferedReader s22 = new BufferedReader(new InputStreamReader(System.in));
        String strings2 = s22.readLine();
        boolean ans = strings2.contains(strings1);
        System.out.println(ans);

    }
}