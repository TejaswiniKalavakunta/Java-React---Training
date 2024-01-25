package com.hexaware.Strings;

public class StringBuilderClass {
	private StringBuilder content;

    public StringBuilderClass() {
        this.content = new StringBuilder();
    }

    public StringBuilderClass(String initial) {
        this.content = new StringBuilder(initial);
    }

    public StringBuilderClass append(String str) {
        content.append(str);
        return this;
    }

    public StringBuilderClass insert(int index, String str) {
        content.insert(index, str);
        return this;
    }

    public StringBuilderClass delete(int start, int end) {
        content.delete(start, end);
        return this;
    }

    public String toString() {
        return content.toString();
    }

    public static void main(String[] args) {
    	StringBuilderClass myStringBuilder = new StringBuilderClass("Hello");

        // Append a string
        myStringBuilder.append(" World");

        // Insert at a specific index
        myStringBuilder.insert(5, ", Strings");

        // Delete a portion of the string
        myStringBuilder.delete(11, 16);

        // Display the result
        System.out.println(myStringBuilder.toString());
    }

}
