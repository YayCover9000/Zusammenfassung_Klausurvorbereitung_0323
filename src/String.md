## Umgang mit Strings

### Split
```java
 // Trennen von Nachnamen und Vornamen durch Komma
String[] nameParts = fullName.split(",", 2);
	
// Trennen von mehreren Nachnamen und Vornamen
nachnameArray[i] = nameParts[0].split("\\s*,\\s*");
vornameArray[i] = nameParts[1].split("\\s*,\\s*");
```