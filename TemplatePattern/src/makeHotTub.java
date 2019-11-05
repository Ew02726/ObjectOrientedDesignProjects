import java.util.Scanner;

public class makeHotTub extends buildWaterConstruction{

	@Override
	void addDecorations() {
		System.out.println(" Adding marbling, audio system, and pathway");
		
	}

	@Override
	void fillWithWater() {
		System.out.println("Filling with salt water");
		
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
