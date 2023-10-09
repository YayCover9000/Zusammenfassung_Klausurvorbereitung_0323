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

### Auf NULL Eingabe prüfen:

```java
scanner.hasNextInt()
if (Array == null){
        ...
        }
```

* Fahrenheit Celsius
* BodyMass
* Devisenrechner
* Dreiecksfläche
* Geschwindigkeit Auto
* GPS Empfang
* Kalorien
* Kreisfläche
* Schaltjahr
* settergetter
* Taschenrechner

Unterschied: For loop und foreach loop // bei foreach gibt man nicht ||System.out.print(Array[e]);|| aus, sondern nur ||System.out.print(e);||. Diese Methode dient EINZIG UND ALLEINE der AUSGABE
wohingegen es bei for loop wichtig ist es so zu schreiben: ||System.out.print(laufzeiten[r]);||.
for schleife mit abbruchbedingung -1 versehen: ||for (int i = 0; i < array.lemgth && !exit; i++) {||
immer erst Abbruchbedinugn checken

Methoden

* Math.random
* Math.Pow
* Math.round
* Arrays

Auf Dopplung checken im Array:
```java
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

```java
/* Mit new wird ein neues Objekt erstellt, welchem wir Werte übergeben können im Beispiel den Buchstaben X. */
public class Alphabet {     
    public static void main (String [] args) {
             Alphabet Buchstabe = new Alphabet(X);
      } 
}
```

#### Setter:
```java
/* Es wird eine Public Variable übergeben an eine private Variable. */
public void setErsterBuchstabe (int ersterBuchstabeSetter) {
    ersterBuchstabe = ersterBuchstabeSetter;
    }
```

#### Getter:

```java
/* Die private Variable wird aufgerufen und als return gegeben. */
public float getErsterBuchstabe() {
    return ersterBuchstabe;
}
```

#### this Konstruktor:

```java
/* this referenziert ein bestimmtes Objekt und übergibt den bestimmten, 
von uns übergebenen, Wert. Dafür benötigen wirt eine Methode, in diesem Fall
public Alphabet. */

public Alphabet(int ersterBuchstabe){
    this.ersterBuchstabe = ersterBuchstabe;
}
```

## Beispiel:

``` java
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

Link to: [Arrays](Arrays.md)

Arrays in Java sind eine Sammlung von Variablen des gleichen Datentyps, 
die nacheinander in einem Speicherbereich angeordnet sind. Sie können verwendet
werden, um Daten zu speichern, auf sie zuzugreifen und sie zu manipulieren. 
In diesem Text werden wir uns auf die Verwendung von Arrays in Java konzentrieren
und verschiedene Methoden behandeln, wie man mit Arrays umgehen kann.

*Überprüfung von Null- und 0-Eingaben:*
Manchmal kann es vorkommen, dass Sie eine Null- oder 0-Eingabe erhalten. 
Um dies zu vermeiden, können Sie eine Überprüfung durchführen, ob das Array null 
oder leer ist. Hier ist ein Beispiel:

```java
int[] array = null;

// Überprüfen, ob das Array null ist
if(array == null) {
System.out.println("Das Array ist null");
}

// Überprüfen, ob das Array leer ist
if(array.length == 0) {
System.out.println("Das Array ist leer");
}
```

### Befüllen von Arrays

Arrays können auf verschiedene Arten befüllt werden. 
Eine Möglichkeit ist die Verwendung der Schleife "for". Hier ist ein Beispiel:

```java
int[] array = new int[5];

// Array mit 1-5 befüllen
for(int i = 0; i < array.length; i++) {
array[i] = i + 1;
}
```

### Ausgabe von Arrays

Arrays können auch auf verschiedene Arten ausgegeben werden. 
Eine Möglichkeit ist die Verwendung der Schleife "for". Hier ist ein Beispiel:

```java
int[] array = {1, 2, 3, 4, 5};

// Array ausgeben
for(int i = 0; i < array.length; i++) {
System.out.println(array[i]);
}
```

### Umgekehrte Ausgabe von Arrays

Sie können auch die Elemente eines Arrays in umgekehrter Reihenfolge ausgeben. 
Hier ist ein Beispiel:

```java
int[] array = {1, 2, 3, 4, 5};

// Array in umgekehrter Reihenfolge ausgeben
for(int i = array.length - 1; i >= 0; i--) {
System.out.println(array[i]);
}
```

### Swappen von Arrays

Sie können auch die Elemente zweier Arrays tauschen. Hier ist ein Beispiel:

```java
int[] array1 = {1, 2, 3, 4, 5};
int[] array2 = {6, 7, 8, 9, 10};

// Arrays tauschen
int[] temp = array1;
array1 = array2;
array2 = temp;
````

### Weitere Möglichkeiten

Es gibt noch viele weitere Möglichkeiten, wie man mit Arrays in Java umgehen kann. Hier sind einige Beispiele:

Arrays sortieren: Verwenden Sie die Methode "sort" der Klasse "Arrays" zum Sortieren von Arrays.
    
Arrays kopieren: Verwenden Sie die Methode "copyOf" der Klasse "Arrays", um Arrays zu kopieren.
    
Arrays durchsuchen: Verwenden Sie die Methode "binarySearch" der Klasse "Arrays", um Arrays zu durchsuchen.

## Multidimensionale Arrays
    
### Überprüfung von Null- und 0-Eingaben:
Um Null- oder 0-Eingaben in einem multidimensionalen Array zu vermeiden, 
können Sie eine Überprüfung durchführen, ob das Array null oder leer ist. 
Hier ist ein Beispiel:

```java

int[][] array = null;

// Überprüfen, ob das Array null ist
if(array == null) {
System.out.println("Das Array ist null");
}

// Überprüfen, ob das Array leer ist
if(array.length == 0) {
System.out.println("Das Array ist leer");
}
```

### Befüllen von multidimensionalen Arrays:

Multidimensionale Arrays können auf verschiedene Arten befüllt werden. 
Eine Möglichkeit ist die Verwendung von verschachtelten Schleifen "for". 
Hier ist ein Beispiel:

```java

int[][] array = new int[3][3];

// Array mit Zahlen von 1-9 befüllen
int zahl = 1;
for(int i = 0; i < array.length; i++) {
for(int j = 0; j < array[i].length; j++) {
array[i][j] = zahl;
zahl++;
}
}
```

### Ausgabe von multidimensionalen Arrays

Multidimensionale Arrays können auch auf verschiedene Arten ausgegeben werden. 
Eine Möglichkeit ist die Verwendung von verschachtelten Schleifen "for". 
Hier ist ein Beispiel:

```java

int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

// Array ausgeben
for(int i = 0; i < array.length; i++) {
for(int j = 0; j < array[i].length; j++) {
System.out.print(array[i][j] + " ");
}
System.out.println();
}
```

### Umgekehrte Ausgabe von multidimensionalen Arrays

Sie können auch die Elemente eines multidimensionalen Arrays in 
umgekehrter Reihenfolge ausgeben. Hier ist ein Beispiel:

```java
int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

// Array in umgekehrter Reihenfolge ausgeben
for(int i = array.length - 1; i >= 0; i--) {
for(int j = array[i].length - 1; j >= 0; j--) {
System.out.print(array[i][j] + " ");
}
System.out.println();
}
```

### Swappen von multidimensionalen Arrays:
    
Sie können auch die Elemente zweier multidimensionaler Arrays tauschen. 
Hier ist ein Beispiel:

```java
int[][] array1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
int[][] array2 = {{10, 11, 12}, {13, 14, 15}, {16, 17, 18}};

// Arrays tauschen
```

Um die Arrays zu tauschen, können Sie eine temporäre Variable verwenden, 
um die Inhalte der Arrays zu speichern, bevor Sie sie austauschen. 
Hier ist ein Beispiel:

```java

// Array1 und Array2 vor dem Tausch ausgeben
System.out.println("Array1 vor dem Tausch:");
for(int i = 0; i < array1.length; i++) {
for(int j = 0; j < array1[i].length; j++) {
System.out.print(array1[i][j] + " ");
}
System.out.println();
}

System.out.println("Array2 vor dem Tausch:");
for(int i = 0; i < array2.length; i++) {
for(int j = 0; j < array2[i].length; j++) {
System.out.print(array2[i][j] + " ");
}
System.out.println();
}

// Arrays tauschen
int[][] temp = array1;
array1 = array2;
array2 = temp;

// Array1 und Array2 nach dem Tausch ausgeben
System.out.println("Array1 nach dem Tausch:");
for(int i = 0; i < array1.length; i++) {
for(int j = 0; j < array1[i].length; j++) {
System.out.print(array1[i][j] + " ");
}
System.out.println();
}

System.out.println("Array2 nach dem Tausch:");
for(int i = 0; i < array2.length; i++) {
for(int j = 0; j < array2[i].length; j++) {
System.out.print(array2[i][j] + " ");
}
System.out.println();
}
```

### Weitere Möglichkeiten zur Verwendung von multidimensionalen Arrays

Multidimensionale Arrays können auch für eine Vielzahl von Anwendungen 
verwendet werden, wie beispielsweise für die Erstellung von Schachbrettern, 
für das Speichern von Punktwerten in einem Koordinatensystem, 
für das Speichern von RGB-Werten in einem Bild oder für das Erstellen von Arrays,
die mehrere Dimensionen von Daten wie eine Klassenliste oder 
ein Scoreboard aufnehmen können.

Zusammenfassend lässt sich sagen, dass die Verwendung von Arrays in Java 
für eine Vielzahl von Anwendungen und Situationen geeignet ist. 
Durch die Verwendung von eindimensionalen und multidimensionalen Arrays können 
Sie komplexe Datenstrukturen und -muster speichern, bearbeiten und ausgeben.

## Array Sorting
```
// Java program to perform the sorting
// operation on a string array
 
import java.util.Arrays;
 
class GFG {
    public static void main(String[] args)
    {
        String[] arr = { "Apple",   "Cat",    "Ball",
                         "Cartoon", "Banana", "Avocado" };
 
        // sorting the String array
        Arrays.sort(arr);
 
        for (String i : arr) {
            System.out.print(i + " ");
        }
    }
}
```
### Output
```
Apple Avocado Ball Banana Cartoon Cat 
```
## StringArray to String
```
// Java program to demonstrate the
// conversion of String array to String
 
import java.util.Arrays;
 
class GFG {
    public static void main(String[] args)
    {
        String[] arr
            = { "The",  "quick", "brown", "fox", "jumps",
                "over", "the",   "lazy",  "dog" };
 
        // converting to string
        String s = Arrays.toString(arr);
        System.out.println(s);
    }
}
```
### Output
```
[The, quick, brown, fox, jumps, over, the, lazy, dog]
```
# StringBuilder
## Stringbuilding with sb.
```
// Java program to demonstrate the
// conversion of String array to String
 
public class GFG {
    public static void main(String[] args)
    {
        String[] myarr
            = { "The",  "quick", "brown", "fox", "jumps",
                "over", "the",   "lazy",  "dog" };
 
        StringBuilder sb = new StringBuilder();
        sb.append(myarr[0]);
 
        for (int i = 1; i < myarr.length; i++) {
            sb.append(" " + myarr[i]);
        }
 
        String s = sb.toString();
        System.out.println(s);
    }
}
```

### Output mit sb.
```
The quick brown fox jumps over the lazy dog
```





