import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App20 {
    public static void main(String[] args) throws Exception {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("輸入查詢學號為:");
        String str = buff.readLine();
        String[][] martrix = new String[][] { { "學號", "姓名", "系別" }, { "123", "Tom", "DTGD" }, { "456", "Cat", "CSIF" },
                { "789", "Nana", "ASIE" }, { "321", "Lim", "DBA" }, { "654", "Won", "FDD" } };
        for (int i = 0; i < martrix.length; i++) {
            for (int j = 0; i < martrix.length; i++) {
                System.out.print(martrix[i][j] + " ");
            }
            System.out.println();
        }
        ;
    }
}
