package oop.InputOutput;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /**
         * I/O Serializable
         */
        File personFile = new File("G:/#JAVA SDA curs/person.txt");

        if (!personFile.exists()) {
            personFile.createNewFile();
        }

        Person person = new Person("Andrei", "sdasdasd");

        System.out.println("Before serialization: " + person);

        try (FileOutputStream fileOutputStream = new FileOutputStream(personFile);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(person);
        }

        Person person1;

        try (FileInputStream fileInputStream = new FileInputStream(personFile);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            person1 = (Person) objectInputStream.readObject();
        }

        System.out.println("After deserialization: " + person1);


        /**I/O reading and writing files



         File absolutFile = new File("G:/#JAVA SDA curs/test.txt");  //modify path if you change file
         File outputFile = new File("G:/#JAVA SDA curs/output.txt"); //modify path if you change file

         if (!outputFile.exists()) {
         outputFile.createNewFile();
         }

         try (BufferedReader bufferedReader = new BufferedReader(new FileReader(absolutFile));
         BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputFile))) {
         String fileLine;
         while ((fileLine = bufferedReader.readLine()) != null) {
         System.out.println(fileLine);
         bufferedWriter.write(fileLine);
         bufferedWriter.newLine();
         }
         } catch (FileNotFoundException e) {
         e.printStackTrace();
         } catch (IOException e) {
         e.printStackTrace();
         }

         */
    }


}



