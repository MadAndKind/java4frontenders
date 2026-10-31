public class Main {
    public static void main(String[] args) {
        // 1. Zmienne i typy - popraw dynamiczne zapędy na statyczne typowanie
        var appName = "SuperApp"; // Tutaj 'var' przejdzie, ale spróbuj przypisać potem liczbę!
        appName = 123;

        // 2. Stałe - stwórz stałą oznaczającą maksymalną liczbę użytkowników (np. 100)
        // const maxUsers = 100; -> jak to zrobić w Javie?

        // 3. Obiekty i porównywanie Stringów
        String inputRole = "admin";
        String adminRole = new String("admin"); // Celowo utworzony nowy obiekt w pamięci

        // Dlaczego to w Javie może nie zadziałać tak jak w JS (===)?
        if (inputRole == adminRole) {
            System.out.println("Zalogowano jako admin!");
        } else {
            System.out.println("Brak uprawnień.");
        }

        // 4. Stwórz instancję klasy User (zdefiniowanej poniżej) i wypisz powitanie
        // User user = new User("Jan", 30);
        // user.greet();
    }
}

// TODO: Zdefiniuj klasę User z polami: name (String), age (int),
// konstruktorem oraz metodą greet(), która wypisuje: "Cześć, jestem [name] i mam [age] lat."