package oop.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ana", "Ion", "Maria");

        Stream<String> namesStream = names.stream();
        List<String> namesCopy = names.stream().collect(Collectors.toList());  // Afiseaza lista de Array
        System.out.println(namesCopy);

        Optional<String> firstName = names.stream().findFirst();              // gasim primul nume din streamul de date
        if (firstName.isPresent()) {
            System.out.println(firstName.get());
        }

        List<String> removeStartingWithI = names.parallelStream().           // Afisam care incepe cu I
                filter(element-> element.startsWith("I")).
                collect(Collectors.toList());
        System.out.println(removeStartingWithI);

        List<Integer> wordSizes = names.stream()                            // Afisam care se termina cu "a" si size-ul acestuia
                .filter(element-> element.endsWith("a"))
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(wordSizes);

        names.stream().forEach(element-> System.out.println(element));      // Printeza element cu element din lista de Array
    }
}
