package alexwoo;

public class BubbleSortAlex {
    public static void main(String[] args) {
        int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        bubbleSort(list);
    }
    public static int[] bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int template = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = template;
                }
            }
            System.out.print("Iteration " +(i+1)+": ");
            printArray(arr);
        }
        return arr;
    }
    public static void printArray(int arr[]) {
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
