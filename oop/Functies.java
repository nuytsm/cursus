public class Oppervlakte {
	
	public static void main(String[] args) {
		int oppervlaktevandedriehoek = oppervlakteDriehoek(5, 10);
		System.out.println(oppervlaktevandedriehoek);
		
		oppervlaktevandedriehoek = oppervlakteDriehoek(5, -10);
		System.out.println(oppervlaktevandedriehoek);
	}
	
	public static void voorbeeldFunctie() {
		System.out.println("Hello World!");
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
