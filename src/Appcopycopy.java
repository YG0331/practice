import java.util.Arrays;

public class Appcopycopy {

    public static void main(String[] args) throws Exception {
        char[][] a = new char[5][];
        a[0] = new char[5];
        a[1] = new char[4];
        a[2] = new char[3];
        a[3] = new char[2];
        a[4] = new char[1];

        char[] b = new char[] { 'z', 'y', 'x', 'w', 'v', 'u', 't', 's', 'r', 'q', 'p', 'o', 'n', 'm', 'l' };

        int x = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = b[x];
                x++;
            }
        }
        System.out.println(Arrays.deepToString(a));
    }
}
