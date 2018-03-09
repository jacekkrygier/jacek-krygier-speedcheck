package com.kodilla;

import java.util.*;
import java.util.*;

public class MapApplication {
    public static void main(String[] args) throws java.lang.Exception {
        System.out.println("\nStart czesci drugiej");
        //Utworzenie map
        Random randomGenerator = new Random();
        Book faraon = new Book("Faraon", "Boleslaw Prus");
        Map<Integer, Book> map = new HashMap<Integer, Book>();
        for (int i = 0; i < 6000000; i++) {
            map.put(randomGenerator.nextInt(6000000), faraon);
        }
        System.out.println("Quantity of elements in the Map: " + map.size());

        // Obliczanie czasu potrzebnego na wyszukiwanie po kluczu z mapy
        long begin = System.nanoTime();
        map.get(7);
        long end = System.nanoTime();

        System.out.println("Getting value based on a key of the Map has taken: " + (end - begin) + "ns");

        // Obliczanie czasu potrzebnego na dodawanie obiektu do mapy
        begin = System.nanoTime();
        map.put(27, new Book("Hamlet", "William Shakespeare"));
        end = System.nanoTime();

        System.out.println("Adding elements to the Map has taken: " + (end - begin) + "ns");

        // Obliczanie czasu potrzebnego na usuwanie obiektu do mapy
        begin = System.nanoTime();
        map.remove(27);
        end = System.nanoTime();

        System.out.println("Removing elements from the Map has taken: " + (end - begin) + "ns");

        System.out.println("Koniec czesci drugiej");
    }
}