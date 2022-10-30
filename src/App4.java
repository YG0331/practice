import java.io.BufferedReader;
import java.io.InputStreamReader;
// import java.math.*;;

public class App4 {
    public static void main(String[] args) throws Exception {
        System.out.println("請輸入x值:");
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
        String string = a.readLine();
        System.out.println("請輸入y值:");
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String string1 = b.readLine();
        int x = Integer.parseInt(string);
        int y = Integer.parseInt(string1);
        double x1 = Math.pow(x, 2);
        double y1 = Math.pow(y, 2);
        double ans = Math.sqrt(x1 + y1);

        if (x > 0 && y > 0) {
            System.out.println("該點位於第一象限，離原點的距離為根號" + ans);
        }
        if (x < 0 && y > 0) {
            System.out.println("該點位於第二象限，離原點的距離為根號" + ans);
        }
        if (x < 0 && y < 0) {
            System.out.println("該點位於第三象限，離原點的距離為根號" + ans);
        }
        if (x > 0 && y < 0) {
            System.out.println("該點位於第四象限，離原點的距離為根號" + ans);
        }
        if (x == 0 && y == 0) {
            System.out.println("該點為原點");
        }
    }
}
