# Spotkanie 1: Ekosystem, SDKMAN!, Narzędzia Budowania i Pierwszy Uruchomieniowy Kod

## 1. Teoria środowiskowa
* **Architektura platformy Javy:**
    * **JVM (Java Virtual Machine):** Maszyna wirtualna wykonująca kod bajtowy (*bytecode*), co zapewnia niezależność od platformy ("Write Once, Run Anywhere").
    * **JRE (Java Runtime Environment):** Środowisko uruchomieniowe zawierające JVM oraz biblioteki standardowe.
    * **JDK (Java Development Kit):** Zestaw deweloperski niezbędny do pisania i kompilowania kodu, zawierający kompilator (`javac`) oraz narzędzia diagnostyczne.
* **Zarządzanie wersjami Javy:**
    * **SDKMAN!** to bezpośredni odpowiednik `nvm` (Node Version Manager) znanego z frontendu. Umożliwia szybką instalację, przełączanie i zarządzanie wersjami JDK na Linuksie, macOS oraz Windows (WSL).
* **Zarządzanie zależnościami i cyklem życia (Maven / Gradle vs npm):**
    * Odpowiednik pliku `package.json` w Javie to plik konfiguracyjny `pom.xml` (dla Mavena) lub `build.gradle` (dla Gradle).
    * Zamiast lokalnego folderu `node_modules` w każdym projekcie, Java używa globalnego repozytorium (np. lokalnego cache Mavena pod adresem `~/.m2/repository`), gdzie paczki są pobierane i współdzielone między projektami.
    * Fazy cyklu życia obejmują: kompilację, testowanie oraz pakowanie (np. do pliku wykonywalnego `.jar`).

## 2. Praktyka warsztatowa
* **Krok 1:** Instalacja środowiska SDKMAN! w systemie i pobranie najnowszej wersji LTS (np. Java 21 lub nowszej).
* **Krok 2:** Konfiguracja pierwszego projektu w IntelliJ IDEA (najpopularniejszym IDE dla Javy).
* **Krok 3:** Zrozumienie struktury katalogów projektu Java (katalog `src/main/java` na kod źródłowy).

## 3. Zadanie praktyczne: "Hello World" w dwóch stylach i trzech formach uruchomienia

### Wariant A (Klasyczny – Java < 21, spotykany w 90% systemów komercyjnych)
Tradycyjna struktura z jawnie zdefiniowaną klasą i metodą statyczną `main`:
```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Java Frontend Dev (Classic)!");
    }
}
```

### Wariant B (Nowoczesna Java 21–25+ – uproszczone main i ukryte klasy)
Nowoczesne podejście bez zbędnego boilerplate'u (*unnamed classes* i *instance main methods*):
```java
void main() {
    System.out.println("Hello, Java Frontend Dev (Modern 25+)!");
}
```

### Trzy sposoby uruchomienia kodu:
1. **Przez IDE:** Kliknięcie zielonej strzałki *Run* w IntelliJ IDEA.
2. **Z poziomu terminala/CMD:**
    * Kompilacja tradycyjnego pliku: `javac Main.java`, a następnie uruchomienie: `java Main`. (W nowej Javie można też wykonać plik bezpośrednio poleceniem: `java Main.java`).
3. **Przez narzędzie budowania i plik JAR:**
    * Skonfigurowanie pliku konfiguracyjnego Mavena/Gradle, spakowanie projektu do pliku wykonywalnego (`mvn clean package` / `gradle build`) i uruchomienie produkcyjne poleceniem:
      `java -jar target/nasza-aplikacja.jar`