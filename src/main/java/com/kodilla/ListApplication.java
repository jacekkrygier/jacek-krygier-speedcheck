package com.kodilla;
import java.util.*;
import java.lang.*;

public class ListApplication
{
    public static void main (String[] args) throws java.lang.Exception
    {
        //Utworzenie listy LinkedList z obiektami z klasy Book
        List<Book> list = new LinkedList<Book>();
        for(int n = 0; n < 6000000; n++) {
            list.add(n, new Book("Potop", "Henryk Sienkiewicz"));
        }
        System.out.println("Quantity of elements in the collection: " + list.size());

        // Obliczanie czasu potrzebnego do wyszukiwania i usuniecia obiektu na koncu listy
        long begin = System.nanoTime();
        list.get(list.size() - 1);
        list.remove(list.size() - 1);
        long end = System.nanoTime();

        System.out.println("Removing element at the end of the collection has taken: " + (end - begin) + "ns");
        // Obliczanie czasu potrzebnego do wyszukiwania i usuniecia obiektu ze srodka listy
        begin = System.nanoTime();
        list.get(3000000);
        list.remove(3000000);
        end = System.nanoTime();

        System.out.println("Removing element from the center of the collection has taken: " + (end - begin) + "ns");


        // Obliczanie czasu potrzebnego do wyszukiwania i usuniecia obiektu na poczatku listy
        begin = System.nanoTime();
        list.get(0);
        list.remove(0);
        end = System.nanoTime();

        System.out.println("Removing element at the beginning of the collection has taken: " + (end - begin) + "ns");

        // Obliczanie czasu potrzebnego do wstawiania obiektu na koncu listy
        begin = System.nanoTime();
        list.add(list.size(),new Book("Makbet", "William Shakespear"));
        end = System.nanoTime();

        System.out.println("Adding element at the end of the collection has taken: " + (end - begin) + "ns");


        // Obliczanie czasu potrzebnego do wstawiania obiektu w środku listy
        begin = System.nanoTime();
        list.add(3000000,new Book("Ottello", "William Shakespear"));
        end = System.nanoTime();

        System.out.println("Adding element to the center of the collection has taken: " + (end - begin) + "ns");

        // Obliczanie czasu potrzebnego do wstawiania obiektu na poczatku listy
        Book faraon = new Book("Faraon", "Boleslaw Prus");
        begin = System.nanoTime();
        list.add(0, faraon);
        end = System.nanoTime();

        System.out.println("Adding element at the beginning of the collection has taken: " + (end - begin) + "ns");

        System.out.println("Koniec czesci pierwszej");


}
}
