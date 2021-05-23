package bt3;

import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputString = sc.nextLine();
        int [] frequentChar = new int[255];
        for (int i = 0;i<inputString.length();i++){
            int ascii = inputString.charAt(i);
            frequentChar[ascii] +=1;
        }
        int max = 0;
        char character = (char) 255;
        for (int j = 0;j < 255;j++){
            if (frequentChar[j] > max){
                max = frequentChar[j];
                character = (char) j;
            }
        }
        System.out.println("Chữ cái xuất hiện nhiều nhất là'" + character + "' với tần xuất " + max + " lần");
    }
}
