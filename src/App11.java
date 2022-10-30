import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App11 {
    public static void main(String[] args) throws Exception {
        System.out.println("請輸入月份:");
        BufferedReader mounth1 = new BufferedReader(new InputStreamReader(System.in));
        String mounth = mounth1.readLine();
        int intmounth = Integer.parseInt(mounth);
        System.out.println("請輸入日期:");
        BufferedReader date1 = new BufferedReader(new InputStreamReader(System.in));
        String date = date1.readLine();
        int intdate = Integer.parseInt(date);

        if ((intmounth == 1 & intdate >= 21 & intdate <= 31) | (intmounth == 2 & intdate >= 1 & intdate <= 18)) {
            System.out.println("星座為:水瓶");
        }
        if ((intmounth == 2 & intdate >= 19 & intdate <= 28) | (intmounth == 3 & intdate >= 1 & intdate <= 20)) {
            System.out.println("星座為:雙魚");
        }
        if ((intmounth == 3 & intdate >= 21 & intdate <= 31) | (intmounth == 4 & intdate >= 1 & intdate <= 20)) {
            System.out.println("星座為:牡羊");
        }
        if ((intmounth == 4 & intdate >= 21 & intdate <= 30) | (intmounth == 5 & intdate >= 1 & intdate <= 21)) {
            System.out.println("星座為:金牛");
        }
        if ((intmounth == 5 & intdate >= 22 & intdate <= 31) | (intmounth == 6 & intdate >= 1 & intdate <= 21)) {
            System.out.println("星座為:雙子");
        }
        if ((intmounth == 6 & intdate >= 22 & intdate <= 30) | (intmounth == 7 & intdate >= 1 & intdate <= 22)) {
            System.out.println("星座為:巨蟹");
        }
        if ((intmounth == 7 & intdate >= 23 & intdate <= 31) | (intmounth == 8 & intdate >= 1 & intdate <= 23)) {
            System.out.println("星座為:獅子");
        }
        if ((intmounth == 8 & intdate >= 24 & intdate <= 31) | (intmounth == 9 & intdate >= 1 & intdate <= 23)) {
            System.out.println("星座為:處女");
        }
        if ((intmounth == 9 & intdate >= 24 & intdate <= 30) | (intmounth == 10 & intdate >= 1 & intdate <= 23)) {
            System.out.println("星座為:天枰");
        }
        if ((intmounth == 10 & intdate >= 24 & intdate <= 31) | (intmounth == 11 & intdate >= 1 & intdate <= 22)) {
            System.out.println("星座為:天蠍");
        }
        if ((intmounth == 11 & intdate >= 23 & intdate <= 30) | (intmounth == 12 & intdate >= 1 & intdate <= 21)) {
            System.out.println("星座為:射手");
        }
        if ((intmounth == 12 & intdate >= 22 & intdate <= 31) | (intmounth == 1 & intdate >= 1 & intdate <= 20)) {
            System.out.println("星座為:魔羯");
        }
    }
}
