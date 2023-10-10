
## Clasa Main
Clasa Main conține metoda main, care reprezintă punctul de intrare în program. Programul începe prin afișarea unui meniu cu opțiuni pentru utilizator, așteptând ca acesta să aleagă o opțiune. Meniul are următoarele opțiuni:

## Introducere laptop

Această opțiune permite utilizatorului să introducă informații despre un laptop nou, inclusiv producătorul, capacitatea de RAM, arhitectura procesorului și prețul. Aceste informații sunt apoi adăugate la lista lista de laptopuri.

## Afișare capacitatii de RAM

Această opțiune afișează capacitatea de RAM a tuturor laptopurilor din lista lista.

## Căutare laptop după pretul cautat

Această opțiune permite utilizatorului să introducă un preț dorit și afișează laptopurile din lista lista care au un preț mai mic sau egal cu prețul introdus.

## Iesire

Această opțiune permite utilizatorului să iasă din program.

## Clasa Laptop
Clasa Laptop este o clasă simplă care servește ca model pentru a stoca informații despre laptopuri. Are următoarele caracteristici și funcționalități:

## Atributele

Clasa Laptop conține atribute private pentru producător, capacitatea de RAM, arhitectura procesorului și prețul unui laptop.

## Constructorul

Clasa Laptop are un constructor care permite inițializarea obiectelor de laptop cu informațiile necesare la momentul creării.

## Metoda afiseazaCapacitateRam()

Această metodă afișează capacitatea de RAM a unui laptop, folosind producătorul și capacitatea stocate în obiectul respectiv.

## Metoda cautarePret(double valoareCautata)

Această metodă acceptă o valoare de preț ca argument și verifică dacă prețul laptopului este mai mic sau egal cu acea valoare. Returnează true dacă condiția este îndeplinită și false în caz contrar.

## Metoda getProducator()

Această metodă furnizează acces la producătorul unui laptop, permițând altor clase să obțină acest detaliu.