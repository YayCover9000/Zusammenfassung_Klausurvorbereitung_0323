# Klausurvorbereitung für Programmierung I Klausur am 20.03.2023

## Zweck dieses Programms ist es zusammenfassend alle "schwierigeren" code Probleme aufzulisten. 

>Gegebenenfalls können Lösungen unter folgenden Begriffen auf GitHub unter dem Link: 
>### https://github.com/YayCover9000 
> gefunden werden. Im Folgenden werden Lösungsansätze und Erklärungen, sowie ein Verweis auf ein fertiges Beispiel Programm, welches in der einen oder der anderen Art mit dem Problem umgeht.

> ### Zwei Dimensionales Array:
> https://github.com/YayCover9000/Binaeres_2-dim_Array_II_10
> #### erstellen:
> entweder int Array[][] = new int[5][5] // in der eckigen Klammer steht die Größe
> oder int Array[][] = new int []{5}[]{5,6,7} // in den Geschwundgenen Klammer steht der Inhalt hier im ersten Array mit einer stelle eine 5 und im zweiten Array die 5,6 und 7. 
> #### befüllen:
> #### zufällig befüllen lassen:
> #### ausgeben:
> #### aufsteigend ausgeben:
> #### absteigend ausgeben:
> #### gegenöäufig ausgeben:
> foreach loop
> for loop
==============================================================
> ### Auf NULL eingabe pruefen:
> scanner.hasNextInt()
> if (Array == null)



*Fahrenheit Celsius
BodyMass
Devisienrechner
Dreiecksfläche
Geschwindiugkeit auto
GPS Empfang
Kalorien
KReisfläche
Schalltjahr
settergetter
taschenrechner
Unterscheid For loop und foreach loop // bei foreach gibt man nicht ||System.out.print(Array[e]);|| aus, sondern nur ||System.out.print(e);||. Diese Methode dient EINZIG UND ALLEINE der AUSGABE
wohingegen es bei for loop wichtig ist es so zu schreiben: ||System.out.print(laufzeiten[r]);||.
for schleife mit abbruchbedingung -1 versehen: ||for (int i = 0; i < array.lemgth && !exit; i++) {||
immer erst Abbruchbedinugn checken
 
Math.random
Math.Pow
Math.round
Arrays

Auf dopplung checken im Array:
`````
while (exit || whileZaehler < 6) {
    for (int z = 0; z < 6; z++) {
        zufallsZahlen = 1 + (int)(Math.random() * 49);
         System.out.println("zufallsZahlen: " + zufallsZahlen);
        lottozahlen[z] = zufallsZahlen;
        boolean schonImArray = false;

         for (int y = 0; y < z; y++) {
            if (lottozahlen[y] == lottozahlen[z]) {
                schonImArray = true;
                exit = true;
            }
        }
        if (schonImArray) {
            z--;
        } else {
            System.out.println(lottozahlen[z]);
            whileZaehler++;
        }
    }
}
`````
