import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App16 {
    public static void main(String[] args) throws Exception {
        System.out.println("請開始撲克牌對決");
        BufferedReader start1 = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("你的手牌是?");
            BufferedReader string = new BufferedReader(new InputStreamReader(System.in));
            String strstr = string.readLine();
            System.out.println("對手的手牌是?");
            BufferedReader string1 = new BufferedReader(new InputStreamReader(System.in));
            String strstr1 = string1.readLine();
            String str[] = strstr.split("");
            String eng[] = new String[5];
            String num[] = new String[5];
            int intnum[] = new int[5];
            int a = 0;
            int b = 0;
            int c = 0;
            int d = 0;
            int f = 0;
            int count = 1;
            int count1[] = new int[5];
            int ans = 9;

            for (int i = 0; i < strstr.length(); i++) {
                char ch = strstr.charAt(i);
                if (ch >= '0' && ch <= '9') {
                    if (a > 0 && num[a - 1] == str[i - 1]) {
                        a -= 1;
                        num[a] = num[a] + str[i];
                        // System.out.println("HELLO");
                        // System.out.println(num[a]);
                        a++;
                    } else {
                        num[a] = str[i];
                        // System.out.println(num[a]);
                        a++;
                    }

                }
                if (ch >= 'A' && ch <= 'Z') {
                    eng[b] = str[i];
                    // System.out.println(eng[b]);
                    b++;
                }
            }
            for (int i = 0; i < num.length; i++) {
                intnum[i] = Integer.parseInt(num[i]);
                // System.out.println(intnum[i]);
            }
            for (int i = 0; i < intnum.length; i++) {
                for (int j = 0; j < intnum.length - 1; j++) {
                    if (intnum[j] > intnum[j + 1]) {
                        int e = intnum[j];
                        intnum[j] = intnum[j + 1];
                        intnum[j + 1] = e;
                    }
                }
            }

            for (int i = 0; i < intnum.length - 1; i++) {

                if (intnum[i] == intnum[i + 1]) {
                    count++;
                    if (i == intnum.length - 2) {
                        count1[c] = count;
                        // System.out.println(count1[c]);
                    }
                } else {
                    count1[c] = count;
                    // System.out.println(count1[c]);
                    c++;
                    count = 1;
                    if (i == intnum.length - 2) {
                        count1[c] = count;
                        // System.out.println(count1[c]);
                    }

                }

            }
            for (int i = 0; i < eng.length; i++) {
                // System.out.println(eng[i]);

                // System.out.println(intnum[i]);
            }

            if (eng[0].equals(eng[1]) && eng[1].equals(eng[2]) && eng[2].equals(eng[3]) && eng[3].equals(eng[4])
                    && intnum[0] + 1 == intnum[1]
                    && intnum[1] + 1 == intnum[2] && intnum[2] + 1 == intnum[3] && intnum[3] + 1 == intnum[4]) {
                ans = 7;
            }
            for (int i = 0; i < count1.length; i++) {
                if (count1[i] == 4) {
                    ans = 6;
                }
                if (count1[i] == 3) {
                    for (int j = 0; j < count1.length; j++) {
                        if (count1[j] == 2) {
                            ans = 5;
                        }
                    }
                }
                if (eng[0].equals(eng[1]) && eng[1].equals(eng[2]) && eng[2].equals(eng[3]) && eng[3].equals(eng[4])) {

                } else {
                    if (intnum[0] + 1 == intnum[1]
                            && intnum[1] + 1 == intnum[2] && intnum[2] + 1 == intnum[3] && intnum[3] + 1 == intnum[4]) {
                        ans = 4;
                    }
                }

                if (count1[i] == 3) {
                    for (int j = 0; j < count1.length; j++) {
                        if (count1[j] != 2 && count1[j] != 3 && count1[j] != 0) {
                            ans = 3;
                        }
                    }
                }
                if (count1[i] == 2) {
                    for (int j = 0; j < count1.length; j++) {
                        if (count1[j] == 2 && i != j) {
                            ans = 2;
                        }
                    }
                }
                if (count1[i] == 2) {
                    for (int j = 0; j < count1.length; j++) {
                        if (count1[j] == 1) {
                            f++;
                            if (f == 3) {
                                ans = 1;
                            }
                        }

                    }
                }

                if (count1[i] == 1) {
                    if (eng[0].equals(eng[1]) && eng[1].equals(eng[2]) && eng[2].equals(eng[3])
                            && eng[3].equals(eng[4])) {

                    } else {
                        if (intnum[0] + 1 == intnum[1]
                                && intnum[1] + 1 == intnum[2] && intnum[2] + 1 == intnum[3]
                                && intnum[3] + 1 == intnum[4]) {

                        } else {
                            d++;
                            if (d == 5) {
                                ans = 0;
                            }
                        }
                    }

                }

            }

            System.out.println(ans);

            String str1[] = strstr1.split("");
            String eng1[] = new String[5];
            String num1[] = new String[5];
            int intnum1[] = new int[5];
            a = 0;
            b = 0;
            c = 0;
            d = 0;
            f = 0;
            count = 1;
            int count2[] = new int[5];
            int ans1 = 9;

            for (int i = 0; i < strstr1.length(); i++) {
                char ch = strstr1.charAt(i);
                if (ch >= '0' && ch <= '9') {
                    if (a > 0 && num1[a - 1] == str1[i - 1]) {
                        a -= 1;
                        num1[a] = num1[a] + str1[i];
                        // System.out.println("HELLO");
                        // System.out.println(num1[a]);
                        a++;
                    } else {
                        num1[a] = str1[i];
                        // System.out.println(num1[a]);
                        a++;
                    }

                }
                if (ch >= 'A' && ch <= 'Z') {
                    eng1[b] = str1[i];
                    // System.out.println(eng1[b]);
                    b++;
                }
            }
            for (int i = 0; i < num1.length; i++) {
                intnum1[i] = Integer.parseInt(num1[i]);
                // System.out.println(intnum1[i]);
            }
            for (int i = 0; i < intnum1.length; i++) {
                for (int j = 0; j < intnum1.length - 1; j++) {
                    if (intnum1[j] > intnum1[j + 1]) {
                        int e = intnum1[j];
                        intnum1[j] = intnum1[j + 1];
                        intnum1[j + 1] = e;
                    }
                }
            }

            for (int i = 0; i < intnum1.length - 1; i++) {

                if (intnum1[i] == intnum1[i + 1]) {
                    count++;
                    if (i == intnum1.length - 2) {
                        count2[c] = count;
                        // System.out.println(count2[c]);
                    }
                } else {
                    count2[c] = count;
                    // System.out.println(count2[c]);
                    c++;
                    count = 1;
                    if (i == intnum1.length - 2) {
                        count2[c] = count;
                        // System.out.println(count2[c]);
                    }

                }

            }
            for (int i = 0; i < eng1.length; i++) {
                // System.out.println(eng1[i]);

                // System.out.println(intnum1[i]);
            }

            if (eng1[0].equals(eng1[1]) && eng1[1].equals(eng1[2]) && eng1[2].equals(eng1[3]) && eng1[3].equals(eng1[4])
                    && intnum1[0] + 1 == intnum1[1]
                    && intnum1[1] + 1 == intnum1[2] && intnum1[2] + 1 == intnum1[3] && intnum1[3] + 1 == intnum1[4]) {
                ans1 = 7;
            }
            for (int i = 0; i < count2.length; i++) {
                if (count2[i] == 4) {
                    ans1 = 6;
                }
                if (count2[i] == 3) {
                    for (int j = 0; j < count2.length; j++) {
                        if (count2[j] == 2) {
                            ans1 = 5;
                        }
                    }
                }
                if (eng1[0].equals(eng1[1]) && eng1[1].equals(eng1[2]) && eng1[2].equals(eng1[3])
                        && eng1[3].equals(eng1[4])) {

                } else {
                    if (intnum1[0] + 1 == intnum1[1]
                            && intnum1[1] + 1 == intnum1[2] && intnum1[2] + 1 == intnum1[3]
                            && intnum1[3] + 1 == intnum1[4]) {
                        ans1 = 4;
                    }
                }

                if (count2[i] == 3) {
                    for (int j = 0; j < count2.length; j++) {
                        if (count2[j] != 2 && count2[j] != 3 && count2[j] != 0) {
                            ans1 = 3;
                        }
                    }
                }
                if (count2[i] == 2) {
                    for (int j = 0; j < count2.length; j++) {
                        if (count2[j] == 2 && i != j) {
                            ans1 = 2;
                        }
                    }
                }
                if (count2[i] == 2) {
                    for (int j = 0; j < count2.length; j++) {
                        if (count2[j] == 1) {
                            f++;
                            if (f == 3) {
                                ans1 = 1;
                            }
                        }

                    }
                }

                if (count1[i] == 1) {
                    if (eng[0].equals(eng[1]) && eng[1].equals(eng[2]) && eng[2].equals(eng[3])
                            && eng[3].equals(eng[4])) {

                    } else {
                        if (intnum[0] + 1 == intnum[1]
                                && intnum[1] + 1 == intnum[2] && intnum[2] + 1 == intnum[3]
                                && intnum[3] + 1 == intnum[4]) {

                        } else {
                            d++;
                            if (d == 5) {
                                ans = 0;
                            }
                        }
                    }

                }

            }
            System.out.println(ans1);
            if (ans > ans1) {
                System.out.println("WINE");
            }
            if (ans < ans1) {
                System.out.println("LOSE");
            }
            if (ans == ans1) {
                System.out.println("DRAW");
            }
            String start = start1.readLine();
            if (start.equals("1")) {
                continue;
            }
            break;
        }
        // scan.close();

    }

}