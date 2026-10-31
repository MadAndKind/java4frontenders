public class Main {
    public static void main(String[] args) {
        // 1. Statyczne typowanie w akcji
        String appappName = "SuperApp";
        // appName = 123; // Błąd kompilacji! Java nie pozwala zmienić typu String na int.

        // 2. Stała z użyciem 'final'
        final int MAX_USERS = 100;
        // MAX_USERS = 200; // Błąd kompilacji - stałej nie można nadpisać.

        // 3. Porównywanie Stringów (.equals() zamiast ==)
        String inputRole = "admin";
        String adminRole = new String("admin");

        // Używamy .equals() do zawartości obiektów, a nie == (które porównywałoby referencje w pamięci)
        if (inputRole.equals(adminRole)) {
            System.out.println("Zalogowano jako admin! (poprawne porównanie .equals())");
        } else {
            System.out.println("Brak uprawnień.");
        }

        // 4. Użycie własnej klasy
        User user = new User("Jan", 30);
        user.greet();
    }
}

class User {
    private String name;
    private int age;

    // Konstruktor
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Metoda
    public void greet() {
        System.out.println("Cześć, jestem " + this.name + " i mam " + this.age + " lat.");
    }
}