package com.hexaware.Strings;

import java.util.ArrayList;
import java.util.List;

public class StringSearchEngine {
	private String text;

    public StringSearchEngine(String text) {
        this.text = text;
    }

    public List<Integer> findAllOccurrences(String substring) {
        List<Integer> occurrences = new ArrayList<>();
        int index = 0;
        while ((index = text.indexOf(substring, index)) != -1) {
            occurrences.add(index);
            index += substring.length();
        }
        return occurrences;
    }

    public String highlightMatches(String substring) {
        StringBuilder highlightedText = new StringBuilder();
        int lastIndex = 0;
        for (int occurrence : findAllOccurrences(substring)) {
            highlightedText.append(text, lastIndex, occurrence);
            highlightedText.append("<b>");
            highlightedText.append(substring);
            highlightedText.append("</b>");
            lastIndex = occurrence + substring.length();
        }
        highlightedText.append(text.substring(lastIndex));
        return highlightedText.toString();
    }

    public static void main(String[] args) {
        StringSearchEngine engine = new StringSearchEngine("I like Java programming language. Java is not completely object-oriented language.");
        List<Integer> indices = engine.findAllOccurrences("Java");
        System.out.println("Indices: " + indices);
        String highlightedText = engine.highlightMatches("Java");
        System.out.println("Highlighted text: " + highlightedText);
    }
	

}




