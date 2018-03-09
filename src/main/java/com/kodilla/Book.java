package com.kodilla;

import java.util.*;
import java.lang.*;


//Klasa Book
public class Book {

    String title;
    String author;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    public String toString(){
        return "Title: \"" + title + "\", author: " + author;
    }

    public String  getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    Random randomGenerator = new Random();

    public int hashCode(){
        return author.hashCode();

    }

    public boolean equals(Object o){
        if (o == null)
            return false;
        if( ! (o instanceof Book ))
            return false;
        Book e = (Book) o;
        if(this.title == null || this.author == null) return false;
        return (title.equals(e.getTitle())) &&
                (author.equals(e.getAuthor()));
    }
}
