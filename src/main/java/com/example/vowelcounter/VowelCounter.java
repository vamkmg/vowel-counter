
package com.example.vowelcounter;

public class VowelCounter {

    public int countVowels(String text) {

        if (text == null) {
            throw new IllegalArgumentException("Text cannot be null");
        }

        int count = 0;

        for (int i = 0; i < text.length(); i++) {

            char character = Character.toLowerCase(text.charAt(i));

            if (character == 'a' ||
                character == 'e' ||
                character == 'i' ||
                character == 'o' ||
                character == 'u') {

                count++;
            }
        }

        return count;
    }
}
