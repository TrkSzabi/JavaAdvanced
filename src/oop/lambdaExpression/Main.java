package oop.lambdaExpression;

import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        Person person = new Person(30);

        //example without lambda
        Predicate<Person> adultPersonTest = new AdultPersonTest();
        System.out.println(adultPersonTest.test(person));


        //example with lambda
        Predicate<Person> adultPersonTest2 = person1 -> person1.getAge() > 30;
        System.out.println(adultPersonTest2.test(person));

        //example with lambda runable
        Runnable runnable = () -> System.out.println("Runing in runnable");
        runnable.run();

         // method reference
        Predicate<Person> adultPersonTest3=Person::isAdult;
        System.out.println(adultPersonTest3.test(person));

        // block of code
        UnaryOperator<Integer> square = i -> {
            int result = i*i;
            return result;
        };
        System.out.println("Result : " + square.apply(100));
    }
}
