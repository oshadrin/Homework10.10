public class Main {
    public static void main(String[] args) {
    boolean success=  Data.checkInput("login", "pass123", "pass123");
    if (success) {
        System.out.println("Данные введены правильно");
    } else {
        System.out.println("Данные введены неверно");
    }
    }
}
