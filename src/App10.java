import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App10 {
    public static void main(String[] args) throws Exception {
        System.out.println("請輸入陣列行數為:");
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int intmatrix_1 = Integer.parseInt(bf.readLine());
        System.out.println("輸入陣列列數為:");
        int intmatrix_2 = Integer.parseInt(bf.readLine());
        String ans1 = "";

        for (int i = 1; i <= intmatrix_1; i++) {
            System.out.println("輸入第" + i + "列為:");
            String strmatrix_num = bf.readLine();
            ans1 += strmatrix_num;
        }
        System.out.println(ans1);
        String ans[] = ans1.split("");
        String strans[][] = new String[intmatrix_1][intmatrix_2];
        int a = 0;
        String fstrans[][] = new String[intmatrix_2][intmatrix_1];
        for (int i = 0; i < intmatrix_1; i++) {
            for (int j = 0; j < intmatrix_2; j++) {
                strans[i][j] = ans[a];
                a += 1;
                System.out.print(strans[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < intmatrix_2; i++) {
            for (int j = 0; j < intmatrix_1; j++) {
                fstrans[i][j] = strans[j][i];
                System.out.print(fstrans[i][j] + " ");
            }
            System.out.println();
        }

    }
}
