package com.thoughtworks.tw101.exercises.exercise4;

import java.io.PrintStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Library {
    private String[] books;
    private PrintStream printStream;

    public Library(String[] books, PrintStream printStream) {
        this.books = books;
        this.printStream = printStream;
    }

    public void printBooksContaining(String partialBookTitle) {
        for ( String book : this.books){

            if (containsWord(partialBookTitle, book)){
                this.printStream.println(book );
            }
        }

    }

    public boolean containsWord(String word, String book){
        Pattern testWord = Pattern.compile("(" + word + ")");
        Matcher match = testWord.matcher(book);
        boolean b = match.find();
        return b;
    }
}
