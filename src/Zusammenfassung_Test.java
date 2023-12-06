
public class Zusammenfassung_Test extends ZusammenfassungTesttreiber {
	
	public static void ausgeben() {
		System.out.println("Byte MAX und MIN Value");
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		
		System.out.println("Short MAX und MIN Value");
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		
		System.out.println("Integer MAX und MIN Value");
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println("Long MAX und MIN Value");
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		
		System.out.println("Float MAX und MIN Value");
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);

		System.out.println("Double MAX und MIN Value");
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);

		System.out.println("Wert mit / gespeichert wird als Zusammengesetze Zahl ausgegeben: ");
		int x1 = 2_04_1;
		int x2 = 9_98;
		int x11 = 02041; // führende 0 führt zur Interpretation als Oktalzahl
		
		System.out.println(x1 + "" + x2);
		System.out.println("Bitweise verknüpfung durch & Operator: ");
		System.out.println(x1 & x2); //Bitweise verknüpfung deshalb wird das binäre 2041 = 11111111001 + 998 = 1111100110 zu 11111001000 also 992 bzw eig 1000
		System.out.println("Führende 0 führt zur Interpretation als OktalZahl: ");
		System.out.println(x11);
	}
}
