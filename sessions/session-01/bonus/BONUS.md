# Spotkanie 1: Bonus dla ambitnych (Deep Dive & Challenges)

Ten zestaw dodatkowych zadań i eksperymentów został przygotowany dla osób, które chcą zgłębić temat pierwszego spotkania i przetestować nietrywialne scenariusze zakorzenione w nawykach z frontendu.

---

### Zadanie 1: Automatyzacja i własny skrypt budujący (Bash / Makefile)
**Nawyk z frontendu:** Na co dzień w Node.js korzystasz z sekcji `scripts` w pliku `package.json` (np. `npm run dev`, `npm run build`), wykonując jedno polecenie. W czystej Javie kompilacja z linii poleceń bywa uciążliwa.

* **Zadanie:** 
  Napisz prosty plik `Makefile` (lub skrypt powłoki `build.sh` dla użytkowników Windows/Linux/macOS), który zautomatyzuje proces pracy bez użycia IDE:
  1. Wyczyszczenie starego folderu ze skompilowanymi plikami `.class`.
  2. Kompilację kodu za pomocą `javac`.
  3. Uruchomienie programu poleceniem `make run` lub `./build.sh`.
* **Cel:** Zrozumienie, że pod maską każdego IDE (IntelliJ, Eclipse) wciąż stoją standardowe kompilatory i skrypty systemowe.

---

### Zadanie 2: Deep Dive – Garbage Collector i pułapki pamięciowe
**Nawyk z frontendu:** W JavaScript zarządzanie pamięcią odbywa się w tle przez silnik V8, a wycieki pamięci (*memory leaks*) wiążą się najczęściej z zapomnianymi nasłuchiwaczami zdarzeń (*event listeners*) lub domknięciami (*closures*).

* **Zadanie (Eksperyment z JVM Heap):**
  1. Napisz prostą pętlę w metodzie `main`, która bez przerwy (w nieskończoność lub do osiągnięcia wielkiego limitu) tworzy nowe obiekty typu `String` w pamięci.
  2. Uruchom ten program z poziomu terminala, nakładając restrykcyjny limit na pamięć maszyny wirtualnej za pomocą flagi `-Xmx` (np. ograniczenie sterty do zaledwie 10 megabajtów):
     ```bash
     java -Xmx10m Main.java
     ```
  3. Obserwuj moment, w którym JVM zgłosi błąd **`java.lang.OutOfMemoryError: Java heap space`**.
* **Cel:** Poznanie specyfiki zarządzania pamięcią przez stertę (*heap*) w Javie oraz zachowania Garbage Collectora pod presją.

---

### Zadanie 3: Challenge – Multi-wersjowość z SDKMAN! (`.sdkmanrc`)
**Nawyk z frontendu:** Znasz zapewne plik `.nvmrc` oraz polecenie `nvm use`, które automatycznie przełącza wersję Node.js po wejściu do folderu projektu.

* **Zadanie:**
  1. Zainstaluj przy użyciu SDKMAN! dwie różne wersje Javy (np. starszą Java 11 oraz najnowszą Java 21 lub nowszą).
  2. W folderze swojego projektu stwórz plik konfiguracyjny `.sdkmanrc` i wpisz w nim wersję starszego JDK.
  3. Skonfiguruj SDKMAN! tak, aby automatycznie wykrywał ten plik (opcja `sdkman_auto_env=true` w pliku konfiguracyjnym SDKMAN).
  4. Otwórz terminal, wejdź do folderu projektu i zweryfikuj poleceniem `java -version`, czy wersja Javy automatycznie dopasowała się do wymagań projektu.
* **Cel:** Opanowanie profesjonalnego środowiska pracy wieloprojektowej na jednej maszynie programistycznej.