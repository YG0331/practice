import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {

    public static void main(String[] args) throws Exception {
        BufferedReader bnum = new BufferedReader(new InputStreamReader(System.in));
        String num = bnum.readLine();
        int numlength = 0;
        for (int i = 2; i <= num.length(); i++) {
            numlength += i;
        }
        for (int i = 0; i < numlength; i++) {

        }
        System.out.println(numlength);
        String strnum[] = num.split("");
        for (int i = 0; i < strnum.length; i++) {
            for (int j = 0; j < strnum.length; j++) {

            }
        }
    }
}
