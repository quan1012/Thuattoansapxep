package Baitap;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Số lượng phần tử :");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Nhập " + list.length + " phần tử:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Danh sách là : ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        System.out.println();
        insertionSort(list);
    }

    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int curr = list[i];
            int k;
            for (k = i - 1; k >= 0 && list[k] > curr; k--) {
                System.out.println("Đổi chỗ " + list[k] + " với " + list[i]);
                list[k + 1] = list[k];

            }
            list[k + 1] = curr;
            System.out.print("Danh sách mới thứ " + i + " là :");
            for (int j = 0; j < list.length; j++) {
                System.out.print(list[j] + "\t");
            }
            System.out.println();
        }

    }
}
