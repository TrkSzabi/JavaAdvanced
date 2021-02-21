package oop.collections.sets;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
                                                            // Colletcions / Sets
        Set<Integer> notes = new HashSet<>();              // Afiseaza doar primele 3 findca nu permita duplicarea
        notes.add(10);                                    // Afiseaza in ordine naturala , ascendenta
        notes.add(8);
        notes.add(3);                                            //   ------>> new HasgSet<>();    <<----
        notes.add(10);
        notes.add(8);
        System.out.println(notes.toString());

        for (Integer element:notes) {
            System.out.println(element);

        }
    }
}
