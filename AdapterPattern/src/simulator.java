
public class simulator {

	public static void main(String[] args) {

		GalaxyS10 an = new GalaxyS10();

		Iphone8 eight = new Iphone8();

		Iphone androidAdapter = new AndroidAdapter(an);


		System.out.println("Galaxys10: ");
		an.charger();
		an.type();
		
		System.out.println("");
		System.out.println("Iphone8: ");
		testAdapter(eight);
		System.out.println("");
		System.out.println("Android Adapter:");
		testAdapter(androidAdapter);
		
	}

	private static void testAdapter(Iphone phone) {
		phone.type();
		phone.charger();
		
	}
}