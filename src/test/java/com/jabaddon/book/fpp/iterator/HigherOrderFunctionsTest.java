package com.jabaddon.book.fpp.iterator;

import java.util.Set;
import org.junit.Test;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;

public class HigherOrderFunctionsTest {
    @Test
    public void testVowelsInWord() throws Exception {
        Set<Character> vowels = HigherOrderFunctions.vowelsInWord("Otorrinonaringologo");
        assertThat(vowels, containsInAnyOrder('o', 'i', 'a'));
    }

    /*
    @Test
    public void testVowelsInWordInJava8() {
        Set<Character> justVowels =
            toCharacterList("Otorrinonaringologo").stream().filter(HigherOrderFunctions::isVowel).collect(Collectors.toSet());
        assertThat(justVowels, containsInAnyOrder('o', 'i', 'a'));
    }

    private List<Character> toCharacterList(String str) {
        char[] chars = str.toCharArray();
        List<Character> characters = new ArrayList<>();
        for (char c : chars) {
            characters.add(new Character(c));
        }
        return characters;
    }
    */
}
