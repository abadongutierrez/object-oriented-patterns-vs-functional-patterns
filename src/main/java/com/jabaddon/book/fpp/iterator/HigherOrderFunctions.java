package com.jabaddon.book.fpp.iterator;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HigherOrderFunctions {
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
}
