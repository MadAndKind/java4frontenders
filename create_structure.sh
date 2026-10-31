#!/bin/bash

set -e

echo "Tworzenie struktury katalogów..."

# Tworzenie folderu na scenariusze dla prowadzącego
# mkdir -p scenarios

# Główny katalog na sesje
BASE_DIR="sessions"

# Pętla generująca 15 spotkań
for i in {1..15}; do
    # Formatowanie numeru z wiodącym zerem (np. session-01, session-02 ... session-15)
    session_num=$(printf "%02d" $i)
    session_dir="$BASE_DIR/session-$session_num"
    
    # Tworzenie podkatalogów
    mkdir -p "$session_dir/starter"
    mkdir -p "$session_dir/solution"
    mkdir -p "$session_dir/bonus"
    
    # Tworzenie pliku README.md dla spotkania, jeśli nie istnieje
    if [ ! -f "$session_dir/README.md" ]; then
        cat <<EOF > "$session_dir/README.md"
# Spotkanie $i

## Agenda
* **Teoria:** 
* **Praktyka:** 

## Zadania / Materiały
EOF
    fi
    
    # Dodanie .gitkeep do pustych katalogów, aby git je widział
    touch "$session_dir/starter/.gitkeep"
    touch "$session_dir/solution/.gitkeep"
    touch "$session_dir/bonus/.gitkeep"
    
    echo "Utworzono: $session_dir"
done

echo "Struktura pomyślnie utworzona!"