package com.example.DataStructures.services;

import com.example.DataStructures.web.data.WordFindRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.example.DataStructures.services.WordFindService.NO_WORDS_FOUND;
import static org.junit.jupiter.api.Assertions.*;

class WordFindServiceTest {

    private WordFindService wordFindService;

    @BeforeEach
    void setUp() {
        wordFindService = new WordFindService();
    }

    @Test
    void simpleWordFindTest() {
        List<String> keywords = new ArrayList(Arrays.asList("cat", "baby", "ball", "dog", "street", "house"));
        String findInMe = "aoienoibhcatsdnreoiocese";

        List<String> expected = new ArrayList();
        expected.add("cat");
        expected.add("street");

        List<String> actual = wordFindService.findWords(new WordFindRequest(keywords, findInMe));

        assertEquals(expected, actual);
    }

    @Test
    void noWordsFoundTest() {
        List<String> keywords = new ArrayList(Arrays.asList("cat", "baby", "ball", "dog", "street", "house"));
        String findInMe = "abc";

        List<String> expected = NO_WORDS_FOUND;
        List<String> actual = wordFindService.findWords(new WordFindRequest(keywords, findInMe));

        assertEquals(expected, actual);
    }
}