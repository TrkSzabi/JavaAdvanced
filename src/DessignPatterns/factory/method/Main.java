package DessignPatterns.factory.method;

public class Main {
    public static void main(String[] args) {

        MercedesCarFaktory mercedesCarFaktory = new MercedesCarFaktory();
        Car car1 = mercedesCarFaktory.order(50000);
        System.out.println(car1.getModel());
    }
}
