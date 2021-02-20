import oop.inherintence.*;


public class Main {

    public static void main(String[] args) {
        //playWithPolymorphism();
        //playWithInherintence();
        //playWithAbstraction();
        playWithGeometricFigures();

    }

    private static void playWithGeometricFigures() {
   //     GeometricFigure figure = new GeometricFigure(); //the class is abstract and can not be instantiated
        GeometricFigure square = new Square(5);
        GeometricFigure circle = new Circle(5);
        GeometricFigure triungle = new Triungle(4,5,7);
        GeometricFigure dreptunchi = new Dreptunghi(2,5);

        System.out.println("Perimetrul patratului este: " + square.calculatePerimeter());
        System.out.println("Perimetrul cercului este: " + circle.calculatePerimeter());
        System.out.println("Perimetrul triunghiului este: " + triungle.calculatePerimeter());
        System.out.println("Perimetrul dreptunchiului este: " + dreptunchi.calculatePerimeter());

    }


    public static void playWithPolymorphism() {
        Animal animal = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();
        //Animal rata = new Rata();
        Cat otherCat = new Cat();

        animal.makeSound();
        dog.makeSound();
        cat.makeSound();
        otherCat.purr();
        otherCat.purr("Angel");//compile time polimorfism(static) overloading


        System.out.println("1------------------");
        Animal[] arrayOfAnimals = new Animal[3];   //sau
        //    Animal arrayOfAnimals2[] = new Animal[3];
        arrayOfAnimals[0] = animal;
        arrayOfAnimals[1] = dog;
        arrayOfAnimals[2] = cat;

        //for este varianta de for clasic de iterare(parcurgere) a elementelor unui array, pentru doar un element
        for (int i = 0; i < arrayOfAnimals.length; i++) {
            arrayOfAnimals[i].makeSound();
        }

        //sau foreach- este varianta de for enhanced  de iterare(parcurgere) a elementelor unui array   ...pentru fiecare element
        System.out.println("2---------------------");
        for (Animal element : arrayOfAnimals) {
            element.makeSound();   //putem folosi brack, return.....in if  run time polymorfism(dinamic)overriding
        }
    }

    private static void playWithInherintence() {

        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        animal.eat();
        dog.eat();
        dog.bark();
        cat.eat();
        cat.purr();


    }


    public static void playWithAbstraction() {
        oop.abstraction.Cat cat = new oop.abstraction.Cat();     //printeaza adresa din memorie unde se gaseste acel obiect ,daca nu  avem public String toString(){}
        cat.sleep();
        System.out.println(cat);    //cat-variabila de tip obiect
        cat.play();
        System.out.println(cat);
        cat.feed();
        System.out.println(cat);

    }

}
