
package com.example.vowelcounter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        VowelCounter counter = new VowelCounter();

        System.out.println("================================");
        System.out.println("       JAVA VOWEL COUNTER");
        System.out.println("================================");

        System.out.print("Enter text: ");

        String text = scanner.nextLine();

        int result = counter.countVowels(text);

        System.out.println("--------------------------------");
        System.out.println("Input text: " + text);
        System.out.println("Number of vowels: " + result);
        System.out.println("--------------------------------");

        scanner.close();
    }
}
