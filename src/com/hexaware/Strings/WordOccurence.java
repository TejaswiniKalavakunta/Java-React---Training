package com.hexaware.Strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class WordOccurence {
	static int occurencesOfWords(String[][] words, String word){
        int count = 0;
        for(int i=0; i<words.length; i++){
            for(int j=0; j<words[0].length; j++){
                if(Objects.equals(words[i][j], word)){
                    count++;
                }

            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rows, columns, count=0;
        String word;
        System.out.print("Enter no of rows: ");
        rows = sc.nextInt();

        System.out.print("Enter no of columns: ");
        columns = sc.nextInt();
        sc.nextLine();

        String[][] strings = new String[rows][columns];

        for(int i=0; i<rows; i++){
            System.out.println("Input row " + i+1 + " :" );
            for(int j=0; j<columns; j++){
                strings[i][j] = sc.nextLine();
            }
        }

        System.out.println("Enter the word to find the occurences: ");
        word = sc.nextLine();
        System.out.println(word +" has occured " + occurencesOfWords(strings, word) + " times.");

    }
	
}
