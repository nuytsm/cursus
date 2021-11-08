public class Oppervlakte {
	
	public static void main(String[] args) {
		voorbeeldFunctie();
		zegHallo("Erik");
		zegHallo("Dirk");
		zegHallo("Beethoven");
		zegHallo("Jennifer");
		zegHalloMetLeeftijd("Vladimir", 65);
		zegHalloMetLeeftijd("Erika", 16);
		zegHalloMetLeeftijdJongOfOud("Thomas", 11);
		zegHalloMetLeeftijdJongOfOud("Popeye", 90);
		int oppervlaktevandedriehoek = oppervlakteDriehoek(5, 10);
		System.out.println(oppervlaktevandedriehoek);	
		oppervlaktevandedriehoek = oppervlakteDriehoek(5, -10);
		System.out.println(oppervlaktevandedriehoek);
	}
	
	public static void voorbeeldFunctie() {
		System.out.println("Hello World!");
	}
	
	public static void zegHallo(String naam){
		System.out.println("Hallo " + naam);
	}
	
	public static void zegHalloMetLeeftijd(String naam, int leeftijd){
		System.out.println("Hallo " + naam + ", je bent " + leeftijd + " jaar oud.");
	}
	
	public static void zegHalloMetLeeftijdJongOfOud(String naam, int leeftijd){
		if (leeftijd > 18){
			System.out.println("Hallo " + naam + ", je bent " + leeftijd + " jaar jong.");
		} else {
			System.out.println("Hallo " + naam + ", je al zeeer oud, namelijk " + leeftijd + " jaar.");
		}
	}
	
	public static int oppervlakteDriehoek(int basis, int hoogte) {
		if (hoogte < 0 || basis < 0) {
			System.out.println("Negatieve invoer is niet toegestaan");
			return 0;
		}
		int result = (basis * hoogte) / 2;
		return result;
		
	}
	
	public static double berekeninhoudcylinder(int straal, int hoogte) {
		double oppervlakte = berekenoppervlaktevancirkel(straal);
		double inhoud = oppervlakte * hoogte;
		return inhoud;
		
	}
	
	public static double berekenoppervlaktevancirkel(int straal) {
		double oppervlakte = 3.1415 * straal * straal;
		return oppervlakte;
	}

}
