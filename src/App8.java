import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

// 有問題
public class App8 {
    public static void main(String[] args) throws Exception {
        System.out.println("請輸入一個正整數:");
        BufferedReader num1 = new BufferedReader(new InputStreamReader(System.in));
        String numString1 = num1.readLine();
        int intnum1 = Integer.parseInt(numString1);
        System.out.println("請輸入一行數列:");
        BufferedReader num2 = new BufferedReader(new InputStreamReader(System.in));
        String stringnum2 = num2.readLine();
        String strmatrixnum2[] = stringnum2.split("");
        int intmatrixnum2[] = new int[strmatrixnum2.length];
        for (int i = 0; i < strmatrixnum2.length; i++) {
            intmatrixnum2[i] = Integer.parseInt(strmatrixnum2[i]);
        }
        for (int i = 0; i < intmatrixnum2.length; i++) {
            System.out.println(intmatrixnum2[i]);
        }
        
        HashMap<Integer, Integer> sites = new HashMap<>();
        for (int i = 0; i < intmatrixnum2.length; i++) {
            if (sites.containsKey(intmatrixnum2[i])) {
                int count = sites.get(intmatrixnum2[i]);
                sites.put(intmatrixnum2[i], count + 1);
            } else {
                // System.out.println(intmatrixnum2[i]);
                sites.put(intmatrixnum2[i], 1);
            }
        }

        Map.Entry<Integer, Integer> maxEntry = null;
        for (Map.Entry<Integer, Integer> entry : sites.entrySet()) {
            if (maxEntry == null || entry.getValue() > maxEntry.getValue()) {
                maxEntry = entry;
            }
        }
        System.out.println(maxEntry);
        // for(int value:sites.values()){
        // System.out.println("出現次數為" +sites.sort(sites.get(value)));
        // }

    }
}
