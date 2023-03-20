In Java gibt es keine Methode namens to.char(). Es gibt jedoch eine Methode namens charAt(), die ein einzelnes Zeichen eines Strings zurückgibt, das an einer bestimmten Indexposition im String liegt.

Die charAt() Methode wird auf eine Instanz eines String-Objekts angewendet und erwartet als Argument den Index des gewünschten Zeichens. Der Index beginnt bei 0 für das erste Zeichen im String und erhöht sich um 1 für jedes folgende Zeichen.

Hier ist ein Beispiel, das die Verwendung der charAt() Methode demonstriert:

```java
String text = "Hallo Welt!";
char firstChar = text.charAt(0);
char fifthChar = text.charAt(4);
char lastChar = text.charAt(text.length() - 1);

System.out.println("Das erste Zeichen ist: " + firstChar);
System.out.println("Das fünfte Zeichen ist: " + fifthChar);
System.out.println("Das letzte Zeichen ist: " + lastChar);
```
In diesem Beispiel wird zuerst ein String-Objekt mit dem Wert "Hallo Welt!" erstellt. Dann werden die charAt() Methode aufgerufen, um das erste Zeichen, das fünfte Zeichen und das letzte Zeichen des Strings abzurufen. Die Rückgabewerte der charAt() Methodenaufrufe werden jeweils in Variablen vom Typ char gespeichert.

Schließlich wird der Inhalt jeder Variablen auf der Konsole ausgegeben, indem sie in eine println() Methode eingebettet werden. Das Ergebnis der Ausführung des obigen Codes wäre:
    
``` 
Das erste Zeichen ist: H
Das fünfte Zeichen ist: o
Das letzte Zeichen ist: !
```
Beispielcode:
    
```java
public class Parity {
public static void main (String [] args) {
long wert = 22225555;
Parity.getParity(wert);
}

    public static short getParity (long wert){
        long longy = wert;
        short shorty = 0;
        int oddcount = 0;
        int evencount = 0;
        String loner;
        loner = Long.toString(longy);
        // System.out.println("\nLong to String: " + loner);

        for (int i = 0; i < loner.length(); i++) {
            char digit =  loner.charAt(i);
            //System.out.println("\n" + digit);
            if(digit % 2 == 0){
                evencount++;
                // System.out.println(" even ");
            } else {
                oddcount++;
                // System.out.println(" odd ");
            }
        }

        if (oddcount > evencount) {
            shorty = -1;
            System.out.println("\nMore odd numbers. Shorty is: " + shorty);
        } else if (oddcount < evencount){
            shorty = 1;
            System.out.println("\nMore even numbers. Shorty is: " + shorty);
        } else if (oddcount == evencount){
            shorty = 0;
            System.out.println("\nEqually even and odd numbers. Shorty is: " + shorty);
        }
        return shorty;
    }

}
```
    
