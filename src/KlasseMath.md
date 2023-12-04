Die Klasse Math in Java ist eine der nützlichsten Klassen für Mathematik-bezogene Aufgaben. Sie enthält eine Vielzahl von Methoden, die in der Mathematik sehr häufig verwendet werden, wie zum Beispiel Randomisierung, Runden und Potenzierung von Zahlen.

Start wih Importing java.lang.Math
```java
import java.lang.Math;
```
Die Methode Math.random() erzeugt eine zufällige Fließkommazahl zwischen 0 und 1. Die zufällige Zahl kann dann in der Anwendung verwendet werden, um zufällige Ereignisse zu simulieren, wie zum Beispiel das Würfeln von Zahlen oder das Generieren von Passwörtern. Die folgende Codezeile zeigt ein Beispiel dafür, wie Math.random() verwendet werden kann, um eine zufällige Ganzzahl zwischen 1 und 6 zu erzeugen:
```java
int zufallszahl = (int)(Math.random() * 6) + 1;
```
Beispiel für Math.random()
```java
int zufallszahl = (int)(Math.random() * 6) + 1;
        System.out.println(zufallszahl); // gibt eine zufällige Ganzzahl zwischen 1 und 6 aus
```
Beispiel-Output:
```
4
```
Die Methode Math.round() rundet eine Dezimalzahl auf die nächste Ganzzahl. Wenn die Dezimalzahl 0,5 oder höher ist, wird aufgerundet, ansonsten wird abgerundet. Die folgende Codezeile zeigt ein Beispiel dafür, wie Math.round() verwendet werden kann:
```java
double zahl = 5.5;
int gerundeteZahl = (int) Math.round(zahl);
```
Beispiel für Math.round():
```java
double zahl = 5.5;
        int gerundeteZahl = (int) Math.round(zahl);
        System.out.println(gerundeteZahl); // gibt die gerundete Zahl (6) aus
```
Beispiel-Output:
``` 
6
```
Die Methode Math.pow() wird verwendet, um eine Zahl zu potenzieren. Sie nimmt zwei Argumente entgegen, die Basis und den Exponenten, und gibt die Basis zur Potenz des Exponenten zurück. Die folgende Codezeile zeigt ein Beispiel dafür, wie Math.pow() verwendet werden kann:
```java
double basis = 2.0;
int exponent = 3;
double ergebnis = Math.pow(basis, exponent); // ergibt 8.0
```
    Beispiel für Math.pow():
```java
double basis = 2.0;
int exponent = 3;
double ergebnis = Math.pow(basis, exponent);
System.out.println(ergebnis); // gibt das Ergebnis der Potenzierung (8.0) aus
```
Beispiel-Output:
``` 
8.0
```
In Java gibt es die Methode Math.ceil(), die verwendet wird, um eine Gleitkommazahl (vom Typ double oder float) auf die nächsthöhere ganze Zahl zu runden. Die Methode rundet eine Zahl auf den nächsten ganzzahligen Wert auf, der größer oder gleich der ursprünglichen Zahl ist.

Die Syntax für die Verwendung von Math.ceil() ist sehr einfach. Man gibt einfach die zu rundende Zahl als Argument an die Methode und die Methode gibt die nächsthöhere ganze Zahl zurück. Hier ist ein Beispiel:
```java
double zahl = 2.5;
double aufgerundet = Math.ceil(zahl);
System.out.println(aufgerundet);
```
Dieses Codebeispiel definiert eine Gleitkommazahl mit dem Wert 2.5 und rundet sie auf die nächsthöhere ganze Zahl, indem die Methode Math.ceil() aufgerufen wird. Der gerundete Wert wird dann auf der Konsole ausgegeben. Das Ergebnis dieses Beispiels ist der folgende Output:
```
3.0
```
Wie man sehen kann, wurde die Zahl -3.14 erfolgreich auf die nächsthöhere Ganzzahl gerundet. Da diese Zahl negativ ist, ist der gerundete Wert auch negativ.

Zusammenfassend kann man sagen, dass Math.ceil() eine sehr nützliche Methode in Java ist, um Gleitkommazahlen auf die nächsthöhere Ganzzahl zu runden. Sie ist einfach zu verwenden und kann positive und negative Zahlen verarbeiten.

In Java gibt es die Methode Math.floor(), die verwendet wird, um eine Gleitkommazahl auf die nächstkleinere Ganzzahl zu runden. Die Methode gibt dabei eine double-Zahl zurück.

Die Syntax für die Verwendung von Math.floor() ist sehr ähnlich wie bei Math.ceil(). Man gibt einfach die zu rundende Zahl als Argument an die Methode und die Methode gibt die nächstkleinere Ganzzahl zurück. Hier ist ein Beispiel:
```java
double zahl = 3.99;
double gerundeteZahl = Math.floor(zahl);
System.out.println(gerundeteZahl);
```
Dieses Codebeispiel definiert eine Gleitkommazahl mit dem Wert 3.99 und rundet sie dann auf die nächstkleinere Ganzzahl mit der Methode Math.floor(). Der gerundete Wert wird dann auf der Konsole ausgegeben. Das Ergebnis dieses Beispiels ist der folgende Output:


```
3.0
```
Die Funktionen "Math.floor", "Math.round" und "Math.ceil" sind alle Teil der Java-Klasse "Math" und werden zur Rundung von Dezimalzahlen verwendet.
Math.floor(x): Gibt die größte ganze Zahl zurück, die kleiner oder gleich x ist. Diese Funktion rundet eine Dezimalzahl auf die nächstkleinere Ganzzahl ab.
Auf Deutsch: Abrunden
Beispiel: Math.floor(2.7) gibt 2 zurück.

Math.round(x): Rundet x auf die nächstgelegene ganze Zahl. Wenn die Dezimalzahl genau in der Mitte liegt, wird auf die gerade Zahl gerundet. Diese Funktion kann auch zum Runden auf eine bestimmte Anzahl von Nachkommastellen verwendet werden. Beispiel: Math.round(2.7) gibt 3 zurück.

Math.ceil(x): Gibt die kleinste ganze Zahl zurück, die größer oder gleich x ist. Diese Funktion rundet eine Dezimalzahl auf die nächsthöhere Ganzzahl auf.
Auf Deutsch: Aufrunden
Beispiel: Math.ceil(2.7) gibt 3 zurück.
Hier sind Beispiele in Java, die die Verwendung dieser Funktionen demonstrieren:
```java
double x = 2.7;
double y = -3.5;

double floorResult = Math.floor(x);
double roundResult = Math.round(x);
double ceilResult = Math.ceil(x);

System.out.println("floorResult = " + floorResult); // Ausgabe: floorResult = 2.0
System.out.println("roundResult = " + roundResult); // Ausgabe: roundResult = 3.0
System.out.println("ceilResult = " + ceilResult); // Ausgabe: ceilResult = 3.0

floorResult = Math.floor(y);
roundResult = Math.round(y);
ceilResult = Math.ceil(y);

System.out.println("floorResult = " + floorResult); // Ausgabe: floorResult = -4.0
System.out.println("roundResult = " + roundResult); // Ausgabe: roundResult = -4.0
System.out.println("ceilResult = " + ceilResult); // Ausgabe: ceilResult = -3.0
```
Die Klasse Math in Java ist eine der nützlichsten Klassen für Mathematik-bezogene Aufgaben. Sie enthält eine Vielzahl von Methoden, die in der Mathematik sehr häufig verwendet werden, wie zum Beispiel Randomisierung, Runden und Potenzierung von Zahlen.
