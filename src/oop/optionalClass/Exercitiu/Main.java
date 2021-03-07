package oop.optionalClass.Exercitiu;


import java.util.Optional;

public class Main {
    public static Optional<User> findUserByEmail(String email) {
        // this is for our example
        //1 cautam in baza de date
        //2 returnam userul gasit
        if (userulEinBazaDeDate()) {//daca userul cu aceasta adresa de email exista in baza de date
            return Optional.of(new User("bogdan@judele.com", "iloveyou"));
        } else {
            return Optional.empty();
        }
    }
    private static boolean userulEinBazaDeDate() {
        return true;
    }
    public static void main(String[] args) {
        Optional<User> optionalUser = findUserByEmail("bogdan@judele.com");
        if(optionalUser.isPresent()){
            User user = optionalUser.get();
            System.out.println(user.getPassword());
        }else{
            System.out.println("hopa ca nu am gasit userul in baza de date");
        }
    }
}
