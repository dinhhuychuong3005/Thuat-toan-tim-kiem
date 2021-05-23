package bt4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] list = {1,3,5,7,9,11,13,15,17,19,99};
        System.out.println("Nhập số cần tìm:");
        Scanner scanner = new Scanner(System.in);
        int searchNumber = scanner.nextInt();
        if (BinarySearch.binarySearch(list,0,list.length-1,searchNumber) == -1){
            System.out.println("không có số cần tìm trong mảng");
        }else {
            System.out.println("số cần tìm: " + searchNumber + " có trong mảng");
        }
    }
}
