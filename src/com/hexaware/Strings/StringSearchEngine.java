package com.hexaware.Strings;

public class StringSearchEngine {
	private String originalText;

    public StringSearchEngine(String originalText) {
        this.originalText = originalText;
    }

    public int findOccurrences(String substring) {
        int count = 0;
        int index = originalText.indexOf(substring);
        
        while (index != -1) {
            count++;
            index = originalText.indexOf(substring, index + 1);
        }

        return count;
    }

    public String highlightOccurrences(String substring) {
    	StringBuilder highlightedText = new StringBuilder(originalText);
        int index = originalText.indexOf(substring);

        while (index != -1) {
            highlightedText.insert(index, "[");
            highlightedText.insert(index + substring.length() + 1, "]");
            index = originalText.indexOf(substring, index + 2 + substring.length());
        }

        return highlightedText.toString();    
    }

    public static void main(String[] args) {
        StringSearchEngine searchEngine = new StringSearchEngine("Java is a powerful programming language. Java is widely used.");

        String substring = "Java";

        // Find occurrences
        int occurrences = searchEngine.findOccurrences(substring);
        System.out.println("Occurrences of '" + substring + "': " + occurrences);

        // Highlight occurrences
        String highlightedText = searchEngine.highlightOccurrences(substring);
        System.out.println("Highlighted Text:\n" + highlightedText);
    }

}
