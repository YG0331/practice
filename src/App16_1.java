import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App16_1 {
    public static void main(String[] args) throws Exception {
        System.out.println("請輸入第一個陣列行數為:");
        BufferedReader bmatrix_1 = new BufferedReader(new InputStreamReader(System.in));
        String strmatrix_1 = bmatrix_1.readLine();
        int intmatrix_1 = Integer.parseInt(strmatrix_1);
        System.out.println("請輸入第一個陣列列數為:");
        BufferedReader bmatrix_2 = new BufferedReader(new InputStreamReader(System.in));
        String strmatrix_2 = bmatrix_2.readLine();
        int intmatrix_2 = Integer.parseInt(strmatrix_2);
        String ans11 = "";

        for (int i = 1; i <= intmatrix_1; i++) {
            System.out.println("輸入第" + i + "列為:");
            BufferedReader matrix_num = new BufferedReader(new InputStreamReader(System.in));
            String strmatrix_num = matrix_num.readLine();
            ans11 += strmatrix_num;
        }
        String ans1[] = ans11.split("");
        String strans1[][] = new String[intmatrix_1][intmatrix_2];
        int intans1[][] = new int[intmatrix_1][intmatrix_2];
        int a = 0;
        for (int i = 0; i < intmatrix_1; i++) {
            for (int j = 0; j < intmatrix_2; j++) {
                strans1[i][j] = ans1[a];
                intans1[i][j] = Integer.parseInt(ans1[a]);
                a += 1;
                System.out.print(strans1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("請輸入第二個陣列行數為:");
        BufferedReader bmatrix2_1 = new BufferedReader(new InputStreamReader(System.in));
        String strmatrix2_1 = bmatrix2_1.readLine();
        int intmatrix2_1 = Integer.parseInt(strmatrix2_1);
        System.out.println("請輸入第二個陣列列數為:");
        BufferedReader bmatrix2_2 = new BufferedReader(new InputStreamReader(System.in));
        String strmatrix2_2 = bmatrix2_2.readLine();
        int intmatrix2_2 = Integer.parseInt(strmatrix2_2);
        String ans22 = "";

        for (int i = 1; i <= intmatrix2_1; i++) {
            System.out.println("輸入第" + i + "列為:");
            BufferedReader matrix_num = new BufferedReader(new InputStreamReader(System.in));
            String strmatrix_num = matrix_num.readLine();
            ans22 += strmatrix_num;
        }
        String ans2[] = ans22.split("");
        String strans2[][] = new String[intmatrix2_1][intmatrix2_2];
        int intans2[][] = new int[intmatrix2_1][intmatrix2_2];
        a = 0;
        for (int i = 0; i < intmatrix2_1; i++) {
            for (int j = 0; j < intmatrix2_2; j++) {
                strans2[i][j] = ans2[a];
                intans2[i][j] = Integer.parseInt(ans2[a]);
                a += 1;
                System.out.print(strans2[i][j] + " ");
            }
            System.out.println();
        }
        int fans[][] = new int[intmatrix_1][intmatrix_2];
        for (int i = 0; i < intmatrix_1; i++) {
            for (int j = 0; j < intmatrix_2; j++) {
                fans[i][j] = intans1[i][j] + intans2[i][j];
                System.out.println(fans[i][j] + " ");
            }
            System.out.println();
        }

    }
}
