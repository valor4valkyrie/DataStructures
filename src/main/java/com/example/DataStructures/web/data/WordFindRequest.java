package com.example.DataStructures.web.data;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.List;

@JsonSerialize(as = WordFindRequest.class)
public class WordFindRequest {

    List<String> keywords;
    String findInMe;

    public WordFindRequest(List<String> keywords, String findInMe) {
        this.keywords = keywords;
        this.findInMe = findInMe;
    }

    public List<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }

    public String getFindInMe() {
        return findInMe;
    }

    public void setFindInMe(String findInMe) {
        this.findInMe = findInMe;
    }
}
