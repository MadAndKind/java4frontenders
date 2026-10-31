# Kurs 001: Java dla Frontendowców (16h)
**Cel:** Przeskok koncepcyjny i poznanie ekosystemu Javy dla osób znających JavaScript/TypeScript tzw. "frontendowców".

**Format:** 12 spotkań teoretyczno-praktycznych (warsztaty) + czas (1-2 godziny) na podsumowanie w formie quizu, prezentacji projektu lub realizacji dodatkowego tematu.

**Wstępne wymagania:** Umiejętność pisania kodu w JavaScript/TypeScript, podstawy Git'a i obsługi terminala (cmd, powershell).

---

## Moduł I: Podstawy (~8.5h)

### Spotkanie 1: Architektura Javy, środowisko uruchomieniowe, narzędzia budujące (90 minut)
* **Teoria:**
  * Architektura platformy Javy: JVM (maszyna wirtualna), JRE (środowisko uruchomieniowe) a JDK (zestaw deweloperski).
  * Zarządzanie wersjami Javy: SDKMAN! jako bezpośredni odpowiednik `nvm` (Node Version Manager) znanego z frontendu.
  * Zarządzanie zależnościami i cyklem życia projektu: Czym są Maven oraz Gradle (odpowiedniki `npm` / `yarn`). Struktura pliku `pom.xml` (Maven) vs `build.gradle` (Gradle) oraz lokalne repozytorium zależności (`~/.m2` vs `node_modules`).

* **Praktyka:**
  * Instalacja i konfiguracja SDKMAN! oraz wybranej wersji JDK (np. Java 21 lub 25 LTS).
  * Konfiguracja i pierwsze uruchomienie IntelliJ IDEA.
  * Stworzenie struktury projektu konsolowego i zrozumienie faz kompilacji oraz budowania artefaktu.

* **Zadania do wykonania:**
  * Napisanie kodu "Hello World" w dwóch wariantach (klasycznym z jawnie zdefiniowaną klasą dla Java < 21 oraz nowoczesnym z uproszczonym `main` dla Java 21-25+).
  * Zapomnij o przeglądarce (na razie) i uruchom swój program na trzy sposoby: z poziomu IDE, bezpośrednio z terminala/CMD oraz poprzez spakowanie aplikacji do pliku `.jar` i uruchomienie poleceniem `java -jar`.
* **Zadania rozszerzające (poza 90-minutowym spotkaniem):**
	* [Bonus](sessions/session-01/bonus/BONUS.md). 

### Spotkanie 2: Fundamenty składniowe i wstęp do obiektowości (60 minut)

* **Teoria:**
  * Statyczne typowanie:** Dlaczego piszemy `int x = 5;` zamiast `let x = 5;`. Kompilator nie wybacza braków ani zmian typów w locie.
  * Prymitywy kontra Obiekty:** Typy proste (`int`, `boolean`, `double`, `char`) trzymają wartość bezpośrednio w pamięci, podczas gdy obiekty (`String`, `Integer`, `Boolean`) są referencjami.
  * Brak `undefined`:** W Javie odpowiednikiem braku wartości jest `null`. Wprowadzenie koncepcji `Optional<T>` jako bezpieczniejszej alternatywy.
  * Stałe (`final`):** Słowo kluczowe `final` (odpowiednik `const` w JS, ale pilnowane przez kompilator – uniemożliwia ponowne przypisanie).
  * Sterowanie przepływem:** Klasyczne `if-else`, nowoczesny `switch` (działający jak pattern matching) oraz pętle (`for`, `while`, oraz wygodny `for-each`).
  * OOP w pigułce:** Klasa jako szablon, modyfikatory dostępu (`private`, `public`, `protected`), pola, konstruktory (`this`) oraz tworzenie instancji za pomocą `new`.

* **Zadania podstawowe:**
  * [JS to Java Translation Camp](TBD.md)
* **Zadania rozszerzającego:**
  * [linkTBD](TBD.md)


### Spotkanie 3: Kolekcje, tablice i obsługa wyjątków (90 minut)

* **Teoria:**
  * Tablice kontra Kolekcje:** Czym różni się stałorozmiarowa tablica w Javie (`String[]`) od elastycznych kolekcji (`List`, `Set`, `Map`).
  * Główne interfejsy kolekcji:** `List` (uporządkowana lista, np. `ArrayList`), `Set` (unikalne elementy, np. `HashSet`) oraz `Map` (pary klucz-wartość, np. `HashMap` – odpowiednik obiektu słownika/Map w JS).
  * Generyczność (`Generics`):** Dlaczego zapisujemy `List<String>`, a nie sam `List` (przypomnienie TypeScriptowych typów generycznych `<T>`).
  * Obsługa błędów (Wyjątki):** Różnica między `RuntimeException` (Unchecked – błędy logiki/programisty) a Checked Exceptions (błędy środowiskowe, np. `IOException`, które Java *musi* kazać Ci obsłużyć przez `try-catch` lub `throws`).

* **Praktyka:**
  * Dodawanie, wyszukiwanie i iterowanie po elementach `List<String>` oraz `Map<String, Object>` (częsty zamiennik JSON-ów w backendzie).
  * Świadome pisanie bloku `try-catch-finally` oraz użycie nowoczesnego `try-with-resources`.

* **Zadania podstawowe:**
  * [User Collection & Safe Parser](TBD.md)

* **Zadania rozszerzające:**
  * [generykiTBD](TBD.md)

### Spotkanie 4: Interfejsy, polimorfizm i klasy abstrakcyjne (90 minut)

* **Teoria:**
  - **Interfejsy jako kontrakty:** W Javie nie ma wielokrotnego dziedziczenia klas, ale klasa może implementować wiele interfejsów (odpowiednik TS-owych `interface` lub type-contractów, ale z logiką w postaci metod domyślnych `default`).
  - **Polimorfizm w praktyce:** Jak napisać kod operujący na abstrakcji (np. `PaymentService`), a nie na konkretnej implementacji (`StripePayment` vs `PayPalPayment`).
  - **Klasy abstrakcyjne:** Kiedy używamy interfejsu (czysty kontrakt), a kiedy klasy abstrakcyjnej (wspólny kod bazowy dla pokrewnych klas).

* **Praktyka:**
  - Zdefiniowanie interfejsu np. `NotificationService` z metodą `send(String message)`.
  - Stworzenie dwóch różnych implementacji (`EmailNotification` i `SmsNotification`) oraz wstrzyknięcie ich do wspólnej metody korzystającej z polimorfizmu.

* **Zadania podstawowe:**
  - [Notification System Polymorphism](TBD.md)

* **Zadania rozszerzające:**
  - [linkTBD](TBD.md)

### Spotkanie 5: Dziedziczenie, Modyfikatory dostępu i Nowoczesne formy danych (`record`, `enum`) (60 minut)

- **Teoria:**
  - **Hierarchia klas i dziedziczenie:** Słowo kluczowe `extends`, przesłanianie metod (`@Override`) oraz mechanizm polimorficznego zachowania w dół drzewa obiektów.
  - **Odwołania do klasy bazowej (`super`):** Wywoływanie konstruktora klasy nadrzędnej (`super(...)`) oraz jej metod (`super.metoda()`).
  - **Modyfikatory dostępu pod lupą:** Dokładne omówienie `private`, `default` (pakietyzacyjny), `protected` oraz `public`.
  - **Nowoczesna Java:**
    - `record` – niezmienne obiekty danych (odpowiednik typów `interface` lub TypeScriptowych DTO bez zbędnego kodu boilerplate z getterami i setterami).
    - `enum` – silnie otypowane wyliczenia z własnymi polami i zachowaniami.

- **Praktyka:**
  - Refaktoryzacja klas użytkowników z wykorzystaniem mechanizmu dziedziczenia oraz nowoczesnego `record` do przesyłania danych.
  - Użycie `@Override` do poprawnego zaimplementowania własnych metod `toString()` oraz `equals()` / `hashCode()`.

- **Zadania podstawowe:**
  - [Modern Java Records & Inheritance](TBD.md)

- **Zadania rozszerzające:**
  - [linkTBD](TBD.md)

### Spotkanie 6: Programowanie funkcyjne: Lambdy i Stream API (60 minut)

- **Teoria:**
  - **Wyrażenia Lambda:** Czym są (anonimowe funkcje / closures) i jak zastępują toporne klasy anonimowe (odpowiednik arrow functions `() => {}` z JS/TS).
  - **Interfejsy funkcyjne:** Czym jest `Predicate`, `Function`, `Consumer` i `Supplier` pod maską.
  - **Stream API – koncepcja potoku:** Różnica między operacjami *pośrednimi* (`intermediate` – leniwymi, jak `map`, `filter`, `sorted`) a *końcowymi* (`terminal` – uruchamiającymi przetwarzanie, jak `collect`, `forEach`, `count`, `reduce`).
  - **Porównanie z JS:** Jak metody `.stream().map().filter().collect(Collectors.toList())` mapują się bezpośrednio na znane z JavaScriptu `Array.prototype.map()` i `filter()`.

- **Praktyka:**
  - Przetwarzanie listy obiektów za pomocą strumieni: filtrowanie, wyciąganie danych (`map`) oraz zbieranie wyników do nowej kolekcji.
  - Użycie operacji grupujących (`Collectors.groupingBy`).

- **Zadania podstawowe:**
  - [Stream API & Lambda Translation Camp](TBD.md)

- **Zadania rozszerzające:**
  - [linkTBD](TBD.md)



### Spotkanie 7: Testowanie jednostkowe w Javie: JUnit 5 i AssertJ (60 minut)

- **Teoria:**
  - **Filozofia testów w świecie Javy:** Odpowiednik znanego z frontendowego świata testów jednostkowych (Vitest/Jest) w ekosystemie Javy.
  - **JUnit 5 (Fundamenty):** Kluczowe anotacje (`@Test`, `@BeforeEach`, `@ParameterizedTest`) oraz struktura pisania testów w konwencji AAA (Arrange-Act-Assert).
  - **AssertJ (Płynne asercje):** Dlaczego odchodzimy od topornych `Assertions.assertEquals()` na rzecz czytelnych, fluent assertions (np. `assertThat(result).isNotNull().hasSize(3);`).
  - **Mockowanie z Mockito (Wstęp):** Jak izolować kod i "udawać" zewnętrzne zależności za pomocą obiektów typu mock (`@Mock`, `@InjectMocks`).

- **Praktyka:**
  - Napisanie pierwszego testu jednostkowego dla klasy serwisowej z użyciem JUnit 5.
  - Weryfikacja wyjątków w testach oraz budowanie czytelnych asercji przy użyciu AssertJ.

- **Zadania podstawowe:**
  - [Unit Testing with JUnit 5 & AssertJ & Mockito](TBD.md)

- **Zadania rozszerzające:**
  - [linkTBD](TBD.md)



---

## Moduł II: Wstęp do Backendu i Spring Boot (~6.5h)
*Od kodu w konsoli do aplikacji webowej.*

### Spotkanie 8: Spring Boot Core & Wstrzykiwanie Zależności (DI), (60 minut)

- **Teoria:**
  - **Czym jest Spring Boot?** Auto-konfiguracja, startery i dlaczego rezygnujemy z konfiguracji XML na rzecz konwencji ponad konfiguracją.
  - **Inwersja Sterowania (IoC) i Dependency Injection (DI):** Odpowiednik kontenerów DI znanych z nowoczesnego backendowego świata TS (np. NestJS). Kto zarządza cyklem życia obiektów (Bean)?
  - **Kluczowe anotacje:** `@Component`, `@Service`, `@Repository` oraz wstrzykiwanie przez konstruktor (najlepsza praktyka w Javie).

- **Praktyka:**
  - Inicjalizacja projektu przez Spring Initializr / CLI.
  - Stworzenie pierwszych komponentów i powiązanie ich za pomocą wstrzykiwania zależności przez konstruktor.

- **Zadania podstawowe:**
  - [Spring DI & Bean Configuration](TBD.md)

- **Zadania rozszerzające:**
  - [linkTBD](TBD.md)

### Spotkanie 9: Budowa REST API w Spring MVC (90 minut)

- **Teoria:**
  - **Kontrolery REST:** Odpowiednik kontrolerów z Express.js / NestJS – anotacje `@RestController`, `@RequestMapping`.
  - **Obsługa metod HTTP i parametrów:** `@GetMapping`, `@PostMapping`, `@PathVariable`, `@RequestParam`, `@RequestBody`.
  - **Walidacja DTO i obsługa błędów:** Jak walidować dane wejściowe za pomocą Bean Validation (`@Valid`, `@NotNull`, `@Size`) oraz globalna obsługa wyjątków (`@ControllerAdvice`).

- **Praktyka:**
  - Stworzenie w pełni funkcjonalnego kontrolera REST przyjmującego dane użytkownika, walidującego je i zwracającego poprawny status HTTP (`ResponseEntity`).

- **Zadania podstawowe:**
  - [Spring REST Controller & DTO Validation](TBD.md)

- **Zadania rozszerzające:**
  - [linkTBD](TBD.md)

### Spotkanie 10: Persystencja danych: Spring Data JPA i PostgreSQL (90-120 minut)

- **Teoria:**
  - **ORM w świecie Javy:** Jak Hibernate i Spring Data JPA tłumaczą obiekty na tabele w bazie danych (relacyjne podejście).
  - **Encje i Repozytoria:** Definiowanie modelu danych (`@Entity`, `@Id`) oraz magia interfejsu `JpaRepository` (automatyczne generowanie zapytań SQL na podstawie nazw metod).
  - **Konfiguracja środowiska:** Mapowanie właściwości w `application.yml` i połączenie z bazą danych PostgreSQL.

- **Praktyka:**
  - Skonfigurowanie połączenia z bazą, napisanie pierwszej encji oraz wykorzystanie wbudowanych metod repozytorium do operacji CRUD.

- **Zadania podstawowe:**
  - [Spring Data JPA & PostgreSQL Integration](TBD.md)

- **Zadania rozszerzające:**
  - [TBD](TBD.md)


### Spotkanie 11: Architektura warstwowa i Wzorce (Transakcyjność, Outbox), (90 minut)

- **Teoria:**
  - **Czysta architektura warstwowa:** Podział obowiązków na Controller -> Service -> Repository. Dlaczego nie piszemy logiki biznesowej w kontrolerach ani w bazach.
  - **Transakcyjność w Javie (`@Transactional`):** Czym jest ACID, jak Spring zarządza transakcjami bazodanowymi i co się dzieje w przypadku awarii.
  - **Wprowadzenie do wzorców integracyjnych:** **Outbox Pattern** – jak niezawodnie publikować zdarzenia biznesowe w architekturze mikroserwisowej bez ryzyka utraty danych.

- **Praktyka:**
  - Refaktoryzacja aplikacji: wydzielenie czystej warstwy serwisowej z logiką biznesową i zabezpieczenie transakcji adnotacjami.

- **Zadania podstawowe:**
  - [Transactional Service & Business Logic Layer](TBD.md)

- **Zadania rozszerzające:**
  - [TBD](TBD.md)


---

## Grande Finale (~1h)
### Spotkanie 12: Quiz i Podsumowanie (60 minut)
* **Forma:** Interaktywny quiz ze składni, OOP i Springa + omówienie pułapek dla frontendowców wchodzących w świat Javy.

---
