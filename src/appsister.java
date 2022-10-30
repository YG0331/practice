import java.io.BufferedReader;
import java.io.InputStreamReader;

public class appsister {
    public static void main(String[] args) throws Exception {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入:");
        while (true) {
            String str = scan.readLine();
            if (str.equals("1")) {
                continue;
            }
            System.out.println("输出字符串str=" + str);
            break;
        }
        // scan.close();
    }
}
