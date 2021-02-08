package oop.inherintence;

public class Cat extends Animal {
    public void purr() {
        System.out.println("The cat is purring!");
    }

    @Override
    public void makeSound() {
        System.out.println("Meow meow");
    }

    public void purr(String catName) {  //overriding  suprascrierea metodelor dinparinte in  copil in casa parinte unde avem nevoie neaparat de mostenire ,polimorfism dinamic(in timpul rularii)polimorfism Run Time.
        System.out.println("The cat " + catName + " is puuring");
    }
}
