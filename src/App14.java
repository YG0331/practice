import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App14 {
    public static void main(String[] args) throws Exception {
        System.out.println("請輸入字串:");
        BufferedReader string = new BufferedReader(new InputStreamReader(System.in));
        String str = string.readLine();
        String ans[] = str.split("");
        System.out.println("這裡有" + ans.length + "個字元");

    }
}