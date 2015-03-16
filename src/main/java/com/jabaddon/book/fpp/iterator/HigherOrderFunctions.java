package com.jabaddon.book.fpp.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import scala.Int;

public class HigherOrderFunctions {
    /**
     * High level pattern here is filtering
     */
    public static Set<Character> vowelsInWord(String word) {
        Set<Character> vowelsInWord = new HashSet<Character>();
        // iterate over all characters
        for (Character character : word.toLowerCase().toCharArray()) {
            if (isVowel(character)) {
                vowelsInWord.add(character);
            }
        }
        return vowelsInWord;
    }

    public static boolean isVowel(Character character) {
        Character[] vowels = new Character[]{'a', 'e', 'i', 'o', 'u'};
        return Arrays.asList(vowels).contains(character);
    }

    /**
     * High level pattern here is mapping
     */
    public static List<String> prependHello(List<String> names) {
        List<String> prepended = new ArrayList<>();
        for (String name : names) {
            prepended.add("Hello, " + name);
        }
        return prepended;
    }

    /**
     * High level patter here is perform an operation over a sequence to reduce it to a single value
     */
    public static Integer sumSequence(List<Integer> sequence) {
        Integer sum = 0;
        for (Integer integer : sequence) {
            sum += integer;
        }
        return sum;
    }
}
