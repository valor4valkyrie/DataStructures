package com.example.DataStructures.web;

import com.example.DataStructures.services.WordFindService;
import com.example.DataStructures.web.data.WordFindRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WordController {

    private WordFindService wordFindService;

    @Autowired
    public WordController(WordFindService wordFindService) {
        this.wordFindService = wordFindService;
    }

    @PostMapping(value = "/find/words")
    public List<String> findWord(@RequestBody WordFindRequest wordFindRequest) {
        return wordFindService.findWords(wordFindRequest);
    }
}
