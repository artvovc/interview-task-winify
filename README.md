# Winify Interview Task

### Specifications
1. pagina de logare / implementat utilizând spring security
2. dupa logare se deschide o pagina unde este o lista de produse ,un produs are nume ,preț și stoc ,poţi să adaugi in baza - date random cu care sa poti lucra
3. sa se folosească Java DB  http://www.oracle.com/technetwork/java/javadb/overview/index.html pentru stocarea datelor
4. pentru maparea datelor si pentru interogări sa se folosească hibernate
5. sa se facă o clasă ProductService în care sa fie implementata metoda buy (la cumpărare se decrementează valoare stoc din produs si suma de bani se adaugă in câmpul wallet atașata de userul care deține produsul)

Încearcă sa aranjezi pe layere aplicația și sunt câteva nuanțe în implementarea  procesului de cumpărare, ar fi bine sa le rezolvi sau cel puțin sa le enumeri.

Baza va avea doua tabele:

Users
-----
    id
    login
    password
    wallet

Products
--------
    id
    creationtime
    name
    price
    stock
    owner
    
Tipurile de date a câmpurilor, le alegi singur(fii atent)