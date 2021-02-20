package oop.enums;

public class Main {

    public static void main(String[] args) {

        LengthUnit lengthUnit = LengthUnit.CENTIMETER;
        System.out.println(lengthUnit + " has value " + lengthUnit.getValue());
        lengthUnit= LengthUnit.INCH;

        switch (lengthUnit) {
            case CENTIMETER:
                System.out.println(" We have centimeters ");
                break;
            case METER:
                System.out.println(" We ha ve meters ");
                break;
            case INCH:
                System.out.println(" We have inches ");
                break;
            case  FOOT:
                System.out.println(" We have foot ");
                break;
        }
        System.out.println("************");
        for (LengthUnit unit: LengthUnit.values()) {
            System.out.println(unit);

        }
        System.out.println("************");

        System.out.println(lengthUnit.name());
        }

    }

