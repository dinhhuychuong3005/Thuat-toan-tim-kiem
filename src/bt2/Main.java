package bt2;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String string = sc.nextLine();
        LinkedList<Character> max = new LinkedList<>();
        for (int i = 0;i<string.length();i++){
            LinkedList<Character> list = new LinkedList<>();
            list.add(string.charAt(i));
            for (int j = 0;j < string.length();j++){
                if (string.charAt(j) > list.getLast()) {
                    list.add(string.charAt(j));
                }
            }
            if (list.size() > max.size()){
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        for (Character character : max){
            System.out.println(character);
        }

    }
}
