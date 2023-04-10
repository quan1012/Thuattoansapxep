package Thuchanh;

public class SelectionSort {
    static double[] array = {1.3, 23.5, 4, 5, 3, 23, 2};

    public static void selectionSort(double[] array) {
        int max; // chỉ số phần tử nhỏ nhất trong dãy hiện hành
        for (int i = 0; i < array.length - 1; i++) {
            max = i;
            for (int j = i + 1; j < array.length; j++)
                if (array[j] > array[max])
                    max = j; // ghi nhận vị trí phần tử nhỏ nhất
            if (max != i) {
                double temp = array[max];
                array[max] = array[i];
                array[i] = temp;
            }
        }

    }
    public static void main (String[]args){
        selectionSort(array);
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }
}
