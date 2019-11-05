import java.util.Scanner;

public class makePool extends buildWaterConstruction{

	@Override
	void addDecorations() {
		System.out.println(" Adding pool chairs and lifeguard area");
		
	}

	@Override
	void fillWithWater() {
		System.out.println(" Freshwater ");
		
	}

	public boolean customerWantsCosmetics() {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Would you like to add decorations?");
		
		String str = scan.next();
		
		if(str.startsWith("y") || str.startsWith("Y")) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
