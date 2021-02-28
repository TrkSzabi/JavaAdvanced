package oop.lambdaExpression;

public class Person {
    private Integer age;

    public Person(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public boolean isAdult() {
        return age > 18;
    }

}
