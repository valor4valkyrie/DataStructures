package com.example.DataStructures.services;

import com.example.DataStructures.web.data.WordFindRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class WordFindService {

    static List<String> NO_WORDS_FOUND = new ArrayList(Arrays.asList("No words found"));
    /*
    Send in a list of key-words to find inside a String and return the first (or all) words contained therein
     */
    public List<String> findWords(WordFindRequest wordFindRequest) {

        List<String> keywords = wordFindRequest.getKeywords();
        String findInMe = wordFindRequest.getFindInMe();

        StringBuilder sb = new StringBuilder();

        keywords.forEach(word -> {
            word.chars().mapToObj(c -> (char) c)
                    .filter(character -> findInMe.contains(character.toString()))
                    .forEach(valid ->  sb.append(valid));
        });

        keywords.forEach(word -> {
            word.chars().mapToObj(c -> (char) c)
                    .filter(character -> findInMe.contains(character.toString()))
                    .forEach(valid ->  sb.append(valid));
        });

        if(keywords.stream()
                .filter(word -> sb.toString().contains(word)).count() == 0) {
            return NO_WORDS_FOUND;
        }

        return keywords.stream()
                .filter(word -> sb.toString().contains(word)).collect(Collectors.toList());
    }
}
