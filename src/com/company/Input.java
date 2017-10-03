package com.company;

import java.util.Scanner;

public class Input {

    //take a user input and output it into an array of words
    public static String[] take() {
        String rawInput;
        String separator = " ";
        String sentinel = "!";
        int sentinelPos;
        int wordCount = 1;
        int wordStart = 0;
        int wordEnd;
        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter input words, separated by spaces, and end input with '!'");
        System.out.println("Example input: 'this is a test!'");
        rawInput = Sc.nextLine();
        rawInput = rawInput.toLowerCase();
        sentinelPos = rawInput.indexOf(sentinel);

        //counts the number of words to make array of correct size
        for (int i = 0; i < sentinelPos; i++) {
            if (rawInput.indexOf(separator, i) != -1) {
                wordCount++;
                i = rawInput.indexOf(separator, i);
            } else i = sentinelPos;
        }

        //System.out.println(wordCount);
        String[] rawArray = new String[wordCount];

        //places words into array
        for (int i = 0; i < wordCount; i++) {
            if (i == wordCount - 1) wordEnd = rawInput.indexOf(sentinel);
            else wordEnd = rawInput.indexOf(separator, wordStart);

            rawArray[i] = rawInput.substring(wordStart, wordEnd);
            //System.out.println(rawInput.substring(wordStart, wordEnd));
            wordStart = wordEnd + 1;

        }
        //System.out.println(rawArray.length);
        return rawArray;
    }
    //puts the words in alphabetical order
    public static String[] organize(String[] inputArray) {
        String[] orderedArray = inputArray;
        String temp;

        for (int i = 0; i < orderedArray.length - 1; i++) {
            for (int j = i + 1; j < orderedArray.length; j++) {
                if (orderedArray[i].compareTo(orderedArray[j]) > 0) {
                    temp = orderedArray[i];
                    orderedArray[i] = orderedArray[j];
                    orderedArray[j] = temp;
                }
            }
        }

        return orderedArray;
    }
}
