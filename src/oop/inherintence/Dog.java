package oop.inherintence;

public class Dog extends Animal {

    //extends-mostenire.dog mostenire animal
    public void bark() {
        System.out.println("Ham ham");
    }
    //overloading- supraincarcarea metodelor aceiasi metoda cu acelasi nume dar cu parametrii diferiti ca si numar ca si tip polimorfism de compaile time(in timpul compilarii, polimorfism static)
    @Override
    public void eat() {
        System.out.println("The dog is eating");
    }

    @Override   //make+enter   polimorfism la compaintaim
    public void makeSound() {
        System.out.println("Bow bow");
    }
}
