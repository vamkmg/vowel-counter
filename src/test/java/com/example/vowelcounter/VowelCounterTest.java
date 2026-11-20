
package com.example.vowelcounter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VowelCounterTest {

    private final VowelCounter counter = new VowelCounter();

    @Test
    void testAllVowels() {

        int result = counter.countVowels("aeiou");

        assertEquals(5, result);
    }

    @Test
    void testUppercaseVowels() {

        int result = counter.countVowels("AEIOU");

        assertEquals(5, result);
    }

    @Test
    void testMixedCaseText() {

        int result = counter.countVowels("Hello World");

        assertEquals(3, result);
    }

    @Test
    void testTextWithoutVowels() {

        int result = counter.countVowels("bcdfghjkl");

        assertEquals(0, result);
    }

    @Test
    void testEmptyText() {

        int result = counter.countVowels("");

        assertEquals(0, result);
    }

    @Test
    void testNumbersAndSpecialCharacters() {

        int result = counter.countVowels("Java 123! @#$");

        assertEquals(2, result);
    }

    @Test
    void testRepeatedVowels() {

        int result = counter.countVowels("aaaeee");

        assertEquals(6, result);
    }

    @Test
    void testNullInput() {

        assertThrows(
            IllegalArgumentException.class,
            () -> counter.countVowels(null)
        );
    }
}
