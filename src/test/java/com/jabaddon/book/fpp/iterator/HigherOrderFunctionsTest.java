package com.jabaddon.book.fpp.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;

public class HigherOrderFunctionsTest {
    @Test
    public void testVowelsInWord() throws Exception {
        Set<Character> vowels = HigherOrderFunctions.vowelsInWord("Otorrinonaringologo");
        assertThat(vowels, containsInAnyOrder('o', 'i', 'a'));
    }

    @Test
    public void testPrependHello() {
        List<String> names = Arrays.asList("Rafael", "Antonio");
        List<String> strings = HigherOrderFunctions.prependHello(names);
        assertThat(strings, containsInAnyOrder("Hello, Rafael", "Hello, Antonio"));
    }

    @Test
    public void testSumSequence() {
        List<Integer> nums = Arrays.asList(1, 10, 3);
        assertThat(HigherOrderFunctions.sumSequence(nums), is(14));
    }

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
            characters.add(c);
        }
        return characters;
    }
}
