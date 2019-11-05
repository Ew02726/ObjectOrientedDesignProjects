
public abstract class buildWaterConstruction {

	final void prepareBuild() {
		dig();
		escavate();
		fillWithWater();
		pourConcrete();
		
		if( customerWantsCosmetics()) {
			addDecorations();
		}
	}
	abstract void addDecorations();
	abstract void fillWithWater(); //salt or freshwater

	
	 void dig() {
		 System.out.println(" Digging dirt ");
	 };
	 void escavate() {;
	 	System.out.println(" Escavating area ");
	 }
	
	
	void pourConcrete() {
		System.out.println(" Pouring concrete ");
	};
	
	boolean customerWantsCosmetics() {
		return true;
	}
}