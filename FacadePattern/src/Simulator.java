
public class Simulator {

	public static void main(String[] args) {
		
		FishTankFacade ftf = new FishTankFacade();
		
		ftf.FishTankOn();
		
		System.out.println("---------------------");
		ftf.FishTankOff();
		
	}
}
