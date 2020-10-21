package com.wsdaoy.guanQia02;


import java.util.LinkedHashSet;
import java.util.Scanner;

public class Test07 {
    public static void main(String[] args) {
        LinkedHashSet<Character> lists = new LinkedHashSet<>();
        Scanner sc = new Scanner(System.in);
        char[] chars = sc.nextLine().toCharArray();

        for (char c : chars) {
            lists.add(c);
        }

        for (Character character : lists) {
            System.out.print(character);
        }
    }
}
