# Arrays

Arrays in Java sind eine Sammlung von Variablen des gleichen Datentyps,
die nacheinander in einem Speicherbereich angeordnet sind. Sie können verwendet
werden, um Daten zu speichern, auf sie zuzugreifen und sie zu manipulieren.
In diesem Text werden wir uns auf die Verwendung von Arrays in Java konzentrieren
und verschiedene Methoden behandeln, wie man mit Arrays umgehen kann.

## Inhalt

[Überprüfung Null und 0 Eingabe](#ueberpruefung-von-eingaben)

[Befüllen von Arrays](#befuellen-von-arrays)

[](#ausgabe-von-arrays)


### Ueberpruefung von Eingaben

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

### Befuellen von Arrays

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

### 2-dim Arrays miteinander swappen

Beispiel 

```java
import java.util.Random;

public class Array2Dim {

    public static void output(int[][] arr) {
        if (arr == null) {
            return;
        }

        int numRows = arr.length;
        int numCols = arr[0].length;

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void swap(int[][] arr1, int[][] arr2) {
        if (arr1 == null || arr2 == null) {
            return;
        }

        int numRows1 = arr1.length;
        int numCols1 = arr1[0].length;
        int numRows2 = arr2.length;
        int numCols2 = arr2[0].length;

        if (numRows1 != numCols2 || numCols1 != numRows2) {
            return;
        }

        int[][] result = new int[numRows2][numCols2];

        for (int i = 0; i < numRows2; i++) {
            for (int j = 0; j < numCols2; j++) {
                result[i][j] = arr1[j][i];
            }
        }

        for (int i = 0; i < numRows2; i++) {
            for (int j = 0; j < numCols2; j++) {
                arr2[i][j] = result[i][j];
            }
        }
    }

    public static void main(String[] args) {
        // Erzeuge ein 2D-Array mit zufälligen Werten
        Random rand = new Random();
        int numRows1 = rand.nextInt(5) + 1;
        int numCols1 = rand.nextInt(5) + 1;
        int[][] arr1 = new int[numRows1][numCols1];
        for (int i = 0; i < numRows1; i++) {
            for (int j = 0; j < numCols1; j++) {
                arr1[i][j] = rand.nextInt(10);
            }
        }

        // Erzeuge ein 2D-Array mit gleicher Anzahl Zeilen/Spalten wie arr1
        int numRows2 = numCols1;
        int numCols2 = numRows1;
        int[][] arr2 = new int[numRows2][numCols2];

        // Gib das ursprüngliche arr1 aus
        System.out.println("Array 1:");
        output(arr1);

        // Vertausche Zeilen und Spalten von arr1 und schreibe das Ergebnis in arr2
        swap(arr1, arr2);

        // Gib das transponierte arr2 aus
        System.out.println("Array 2:");
        output(arr2);
    }
}
```

### ElementweiseAddition von Arrays

```java
for(int i = 0; i < array1.length; i++) {
	System.out.println(Array1[i] + Array2[i]);
}
```
