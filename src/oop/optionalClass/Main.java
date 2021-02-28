package oop.optionalClass;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<String> stringEmptyOptional = Optional.empty();
        System.out.println(stringEmptyOptional.isPresent());

        String name = null;
        Optional<String> stringNameOptional = Optional.ofNullable(name);
        if (stringNameOptional.isPresent()) {
            System.out.println(stringNameOptional.get());
        }
        String name2 = null;
        Optional<String> stringNameOptional2 = Optional.ofNullable(name2);
        stringNameOptional2.orElse("default");
        if (stringNameOptional.isPresent()) {
            System.out.println(stringNameOptional.get());
        } else {
            System.out.println(stringNameOptional2.orElse("default"));

        }
    }
}
