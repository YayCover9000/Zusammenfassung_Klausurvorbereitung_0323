In Java gibt es die Methode Integer.toString(), die verwendet wird, um eine Ganzzahl (vom Typ int) in einen String umzuwandeln. Diese Methode ist sehr nützlich, wenn man beispielsweise eine Zahl in eine Datei oder in eine Datenbank schreiben möchte, die nur Strings speichern kann.

Die Syntax für die Verwendung von Integer.toString() ist sehr einfach. Man gibt einfach die zu konvertierende Zahl als Argument an die Methode und die Methode gibt den entsprechenden String zurück. Hier ist ein Beispiel:

```java
int zahl = 42;
        String stringZahl = Integer.toString(zahl);
        System.out.println(stringZahl);
```
Dieses Codebeispiel definiert eine Ganzzahl mit dem Wert 42 und wandelt sie dann in einen String um, indem die Methode Integer.toString() aufgerufen wird. Der erzeugte String wird dann auf der Konsole ausgegeben. Das Ergebnis dieses Beispiels ist der folgende Output:

```
42
```
Man kann auch einen zweiten Parameter an Integer.toString() übergeben, um das gewünschte Zahlensystem für die Konvertierung anzugeben. Wenn man beispielsweise eine Zahl in das Hexadezimalsystem umwandeln möchte, kann man die folgende Syntax verwenden:

```java
int zahl = 255;
        String hexString = Integer.toString(zahl, 16);
        System.out.println(hexString);
```
In diesem Beispiel wird die Zahl 255 in einen Hexadezimal-String umgewandelt, indem der zweite Parameter von Integer.toString() auf den Wert 16 gesetzt wird. Das Ergebnis dieses Beispiels ist der folgende Output:

```
ff
```
Wie man sehen kann, wurde die Zahl 255 erfolgreich in den Hexadezimal-String "ff" umgewandelt.

Zusammenfassend kann man sagen, dass Integer.toString() eine sehr nützliche Methode in Java ist, um Ganzzahlen in Strings umzuwandeln. Sie ist einfach zu verwenden und kann mit einem optionalen zweiten Parameter erweitert werden, um die Konvertierung in verschiedenen Zahlensystemen durchzuführen.



Beispielt code:
```java
import java.util.Scanner;
public class ArrayIni {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        int ziffer = scanner.nextInt();
        int [] Array = new int[5];
        ArrayIni.ini(Array, ziffer);
    }
    public static void ini (int[] ArrayFirst, int ziffer) {

        if (ziffer > 0 && ziffer < 10) {
            // Cast ziffer to String
            String zwischen = Integer.toString(ziffer);
            String zifferString = Integer.toString(ziffer);
            int backToInt;
            //System.out.println("Ziffer To String: " + zifferString);
            // Gibt Stzring plus Ziffer als String aus bis Array voll
            ArrayFirst[0] = ziffer;
            for (int k = 1; k < ArrayFirst.length; k++) {
                zwischen += zifferString;
                //System.out.println("Zwischen: " + zwischen);
                // casts String to Int
                backToInt = Integer.parseInt(zwischen);
                //System.out.println("backToInt: " + backToInt);
                ArrayFirst[k] = backToInt;
                //System.out.println("Ziffer als Int ausgabe: " + ArrayFirst[k]);
            }

            for (int e : ArrayFirst) {
                System.out.println("Ziffer: " + e);
            }
        } else {
            System.out.println("Falsche Eingabe");
        }
    }
}
```
