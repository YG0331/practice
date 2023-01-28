
// 鏈結串列 -- 加入、刪除及輸出
// File name: SingleList.java
// Version 1.0 5-25-2008

import java.lang.String;
import java.util.Scanner;
import java.util.InputMismatchException;

class Student {
    public String name; // 姓名
    public int score; // 分數
    public Student next; // 下一個鏈結
}

class App3 {
    static Student ptr, head, current, prev, temp;
    static Scanner keyboard = new Scanner(System.in);

    App3() // 建構函數
    {
        head = new Student();
        head.next = null;
    }

    // 加入函數，依分數的高低排序
    public static void insert_f() {
        ptr = new Student();
        ptr.next = null;
        System.out.print("\n Student name : ");
        ptr.name = keyboard.next();

        System.out.print(" Student score: ");
        ptr.score = keyboard.nextInt();
        System.out.println("");

        prev = head;
        current = head.next;
        while ((current != null) && (current.score >= ptr.score)) {
            prev = current;
            current = current.next;
        }
        ptr.next = current;
        prev.next = ptr;
    }

    public static void delete_f() {
        String del_name = "";
        int count = 0;

        if (head.next == null)
            System.out.print(" No student record\n");
        else {
            System.out.print(" Delete student name: ");
            del_name = keyboard.next();

            prev = head;
            current = head.next;
            while ((current != null) && (!(del_name.equals(current.name)))) {
                prev = current;
                current = current.next;
            }
            if (current != null) {
                prev.next = current.next;
                current = null;
                System.out.printf("Student %s has been deleted\n\n", del_name);
            } else
                System.out.printf(" Student not found\n\n", del_name);
        }
    }

    public static void display_f() {
        int count = 0;
        if (head.next == null)
            System.out.print(" No student record\n\n");
        else {
            System.out.printf("%-15s %-15s\n", "NAME", "SCORE");
            for (int i = 1; i <= 25; i++)
                System.out.print("-");
            System.out.printf("\n");
            current = head.next;
            while (current != null) {
                System.out.printf("%-17s", current.name);
                System.out.printf("%-15d\n", current.score);
                count++;
                current = current.next;
            }
            for (int i = 1; i <= 25; i++)
                System.out.print("-");
            System.out.printf("\n");
            System.out.printf("Total %d record(s) found\n\n", count);
        }
    }

    public static void main(String args[]) // 主函數
    {
        int option = 0;

        App3 obj = new App3();
        do {
            System.out.println("******  Single list operation *****");
            System.out.println("          <1> Insert               ");
            System.out.println("          <2> Delete               ");
            System.out.println("          <3> Display              ");
            System.out.println("          <4> Exit                 ");
            System.out.println("***********************************");
            System.out.print("             Choice : ");

            try {
                option = keyboard.nextInt();
            } catch (InputMismatchException e) {
                keyboard.nextLine();
                System.out.printf("Not a correctly number.\n");
                System.out.printf("Try again\n\n");
            }
            System.out.println("");
            switch (option) {
                case 1:
                    obj.insert_f(); // 新增函數
                    break;
                case 2:
                    obj.delete_f(); // 刪除函數
                    break;
                case 3:
                    obj.display_f(); // 輸出函數
                    break;
                case 4:
                    System.exit(0);
            }
        } while (true);
    }
}
