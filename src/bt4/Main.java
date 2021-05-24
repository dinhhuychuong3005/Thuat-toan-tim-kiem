package bt4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử của mảng:");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Nhập vào các phần tử của mảng");
        for (int i = 0; i < size; i++) {
            System.out.println("nhập vào phần tử " + (i + 1));
            arr[i] = scanner.nextInt();
        }
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j =arr.length - 1;j>i;j--){
                if (arr[i] > arr[j]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }

        }
        for (Integer integer : arr){
            System.out.println(integer);
        }
        System.out.println("Nhập số cần tìm:");

        int searchNumber = scanner.nextInt();
        if (BinarySearch.binarySearch(arr, 0, arr.length - 1, searchNumber) == -1) {
            System.out.println("không có số cần tìm trong mảng");
        } else {
            System.out.println("số cần tìm: " + searchNumber + " có trong mảng, ở vị trí :" + BinarySearch.binarySearch(arr,0,arr.length - 1,searchNumber));
        }
    }
}
