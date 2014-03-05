package com.jabaddon.book.fpp.iterator;

import org.junit.Test;

import java.util.Set;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;

public class HigherOrderFunctionsTest {
    @Test
    public void testVowelsInWord() throws Exception {
        Set<Character> vowels = HigherOrderFunctions.vowelsInWord("Otorrinonaringologo");
        assertThat(vowels, containsInAnyOrder('o', 'i', 'a'));
    }
}
