package Thuchanh;

public class BubbleSort {
    static int[] list = {2,33,4,51,6,74,8,59};
    public static void bubbleSort(int[] list){
        for (int k = 1; k < list.length ; k++){
            for (int i = 0; i < list.length - k; i++){
                if (list[i] > list[i + 1]){
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                }
            }

        }
    }

    public static void main(String[] args) {
        bubbleSort(list);
        for (int i = 0; i< list.length; i++)
            System.out.println(list[i] + " ");
    }
}