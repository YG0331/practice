import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App18 {
    public static void main(String[] args) throws Exception {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("輸入要輸入要測試的資料量:");
        String str = buff.readLine();
        int num = Integer.parseInt(str);
        String blood = "";
        int temp = 0;
        for (int i = 0; i < num; i++) {
            System.out.println("輸入血型:");
            String string = buff.readLine();
            blood += string + " ";
            System.out.println(blood);
        }
        String[] ansblood = blood.split(" ");
        for (int i = 0; i < num; i++) {
            if (ansblood[i + temp].equals("O") && ansblood[i + temp + 1].equals("O")) {
                if (ansblood[i + temp + 2].equals("O")) {
                    System.out.println("Yes");
                } else {
                    System.out.println("Impossible");
                }
            }
            if (ansblood[i + temp].equals("O") && ansblood[i + temp + 1].equals("A")
                    || ansblood[i + temp].equals("A") && ansblood[i + temp + 1].equals("O")) {
                if (ansblood[i + temp + 2].equals("A") || ansblood[i + temp + 2].equals("O")) {
                    System.out.println("Yes");
                } else {
                    System.out.println("Impossible");
                }
            }
            if (ansblood[i + temp].equals("O") && ansblood[i + temp + 1].equals("B")
                    || ansblood[i + temp].equals("B") && ansblood[i + temp + 1].equals("O")) {
                if (ansblood[i + temp + 2].equals("B") || ansblood[i + temp + 2].equals("O")) {
                    System.out.println("Yes");
                } else {
                    System.out.println("Impossible");
                }
            }
            if (ansblood[i + temp].equals("O") && ansblood[i + temp + 1].equals("AB")
                    || ansblood[i + temp].equals("AB") && ansblood[i + temp + 1].equals("O")) {
                if (ansblood[i + temp + 2].equals("A") || ansblood[i + temp + 2].equals("B")) {
                    System.out.println("Yes");
                } else {
                    System.out.println("Impossible");
                }
            }
            if (ansblood[i + temp].equals("A") && ansblood[i + temp + 1].equals("A")) {
                if (ansblood[i + temp + 2].equals("A") || ansblood[i + temp + 2].equals("O")) {
                    System.out.println("Yes");
                } else {
                    System.out.println("Impossible");
                }
            }
            if (ansblood[i + temp].equals("A") && ansblood[i + temp + 1].equals("B")
                    || ansblood[i + temp].equals("B") && ansblood[i + temp + 1].equals("A")) {
                if (ansblood[i + temp + 2].equals("B") || ansblood[i + temp + 2].equals("O")
                        || ansblood[i + temp + 2].equals("A") || ansblood[i + temp + 2].equals("AB")) {
                    System.out.println("Yes");
                } else {
                    System.out.println("Impossible");
                }
            }
            if (ansblood[i + temp].equals("A") && ansblood[i + temp + 1].equals("AB")
                    || ansblood[i + temp].equals("AB") && ansblood[i + temp + 1].equals("A")) {
                if (ansblood[i + temp + 2].equals("B") || ansblood[i + temp + 2].equals("A")
                        || ansblood[i + temp + 2].equals("AB")) {
                    System.out.println("Yes");
                } else {
                    System.out.println("Impossible");
                }
            }
            if (ansblood[i + temp].equals("B") && ansblood[i + temp + 1].equals("B")) {
                if (ansblood[i + temp + 2].equals("B") || ansblood[i + temp + 2].equals("O")) {
                    System.out.println("Yes");
                } else {
                    System.out.println("Impossible");
                }
            }
            if (ansblood[i + temp].equals("AB") && ansblood[i + temp + 1].equals("B")
                    || ansblood[i + temp].equals("B") && ansblood[i + temp + 1].equals("AB")) {
                if (ansblood[i + temp + 2].equals("B") || ansblood[i + temp + 2].equals("A")
                        || ansblood[i + temp + 2].equals("AB")) {
                    System.out.println("Yes");
                } else {
                    System.out.println("Impossible");
                }
            }
            if (ansblood[i + temp].equals("AB") && ansblood[i + temp + 1].equals("AB")) {
                if (ansblood[i + temp + 2].equals("B") || ansblood[i + temp + 2].equals("A")
                        || ansblood[i + temp + 2].equals("AB")) {
                    System.out.println("Yes");
                } else {
                    System.out.println("Impossible");
                }
            }
            temp += 2;
        }

    }
}
