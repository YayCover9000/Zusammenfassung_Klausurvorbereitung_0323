# Klausurvorbereitung für Programmierung I Klausur am 20.03.2023

## Zweck dieses Programms ist es zusammenfassend alle "schwierigeren" code Probleme aufzulisten. 

Gegebenenfalls können Lösungen unter folgenden Begriffen auf GitHub unter dem Link: 

### https://github.com/YayCover9000 

gefunden werden. Im Folgenden werden Lösungsansätze und Erklärungen, sowie ein Verweis auf 
ein fertiges Beispiel Programm, welches in der einen oder der anderen Art mit dem Problem umgeht.

### Zwei Dimensionales Array:

https://github.com/YayCover9000/Binaeres_2-dim_Array_II_10

#### erstellen:

entweder int Array[][] = new int[5][5] // in der eckigen Klammer steht die Größe
oder int Array[][] = new int []{5}[]{5,6,7} // in den geschwungenen Klammern steht der Inhalt hier 
im ersten Array mit einer stelle eine 5 und im zweiten Array die 5,6 und 7. 

#### befüllen:

#### zufällig befüllen lassen:

#### ausgeben:

#### aufsteigend ausgeben:

#### absteigend ausgeben:

#### gegenläufig ausgeben:

foreach loop
for loop

==============================================================

### Auf NULL eingabe prüfen:

```
> scanner.hasNextInt()
> if (Array == null)
```



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
```
while (whileZaehler < 6) {
    for (int z = 0; z < 6; z++) {
        zufallsZahlen = 1 + (int)(Math.random() * 49);
         System.out.println("zufallsZahlen: " + zufallsZahlen);
        lottozahlen[z] = zufallsZahlen;
        boolean schonImArray = false;

         for (int y = 0; y < z; y++) {
            if (lottozahlen[y] == lottozahlen[z]) {
                schonImArray = true;
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
```


## SetterGetter:

### Wir haben die Klasse Alphabet

#### new:

```
/* Mit new wird ein neues Objekt erstellt, welchem wir Werte übergeben können im Beispiel den Buchstaben X. */
public class Alphabet {     
    public static void main (String [] args) {
             Alphabet Buchstabe = new Alphabet(X);
      } 
}
```

#### Setter:
/* Es wird eine Public Variable übergeben an eine private Variable. */

```
public void setErsterBuchstabe (int ersterBuchstabeSetter) {
    ersterBuchstabe = ersterBuchstabeSetter;
    }
```

#### Getter:

```
/* Die private Variable wird aufgerufen und als return gegeben. */
public float getErsterBuchstabe() {
    return ersterBuchstabe;
}
```

#### this Konstruktor:
> /* this referenziert ein bestimmtes Objekt und übergibt den bestimmten, von uns übergebenen, Wert. Dafür benötigen wirt eine Methode, in diesem fall public Alphabet. */

 
```
public Alphabet(int ersterBuchstabe){
    this.ersterBuchstabe = ersterBuchstabe;
}
```

## Beispiel:

``` 
public class Shopping
    private float weight;
    private float price;
    public static void main (String[] args) {
        Shopping Test = new Shopping(1, 2);
        Shopping.ausgeben(Test.weight, Test.price);
    }
    public Shopping(float weight, float price) {
        this.weight = weight;
        this.price = price;
    }
    public float getWeight() {
        return weight;
    }
    public void setWeight (float weightSetter) {
        weight = weightSetter;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float priceSetter) {
        price = priceSetter;
    }
    public static void ausgeben (float weight, float price) {
        System.out.println("Weight: " + weight);
        System.out.println("Price: " + price);
    }
    }
```
