package Baitap;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class insertionSort2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Độ dài mảng :");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Nhập vào phần tử thứ " + list.length);
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.println("Mảng vừa tạo là :");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        System.out.println();
        insertionSort(list);
        for (int i = 0; i< list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }

    public static void insertionSort(int[] list) {
        for ( int i = 1; i < list.length; i++) {
            int curr = list[i];
            int k;
            for (k = i - 1; k >= 0 && list[k] > curr; k--) {
                list[k + 1] = list[k];

            }
            list[k + 1] = curr;
        }
        System.out.println("Mảng mới là : ");

    }

}

