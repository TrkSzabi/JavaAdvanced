package oop.collections.lists;

import sun.security.util.BitArray;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> counties = new ArrayList<>();
        counties.add("Cluj");
        counties.add("Maramures");
        counties.add("Brasov");

        System.out.println(counties.lastIndexOf("Cluj"));      // Returneaza pozitia indexului
        System.out.println(counties.isEmpty());                   // Returneaza lista daca este goala
        counties.remove("Cluj");
        System.out.println(counties.indexOf("Brasov"));             // Elimina de pe lista si fiecare merge cu o pozitie in spate

        System.out.println(counties);

        for (int i = 0; i < counties.size(); i++) {
            System.out.println(counties.get(i));
        }
        System.out.println("** List with FOR **");
        for (String element : counties) {
            System.out.println(element);

        }
        System.out.println("** List with FOR EACH **");
        counties.forEach(System.out::println);

        System.out.println("** List with Iterator **");
        Iterator<String> iterator=counties.iterator();           // Iterator mod diferit de parcurs fata de restu,nu parcurgem cu FOR ,ci cu While
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
