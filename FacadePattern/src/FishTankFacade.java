
public class FishTankFacade {

	private FishTank airFilter;
	private FishTank bubbles;
	private FishTank thermostat;
	private FishTank fishLights;
	
	public FishTankFacade() {
		airFilter = new airFilter();
		bubbles = new bubbles();
		thermostat = new thermostat();
		fishLights = new FishLights();
				
	}
	
	public void FishTankOn() {
		System.out.println("Fish Tank Activated");
		airFilter.on();
		bubbles.on();
		thermostat.on();
		fishLights.on();
	}
	
	public void FishTankOff() {
		System.out.println("Fish Tank off");
		airFilter.off();
		bubbles.off();
		thermostat.off();
		fishLights.off();
	}
	
}
