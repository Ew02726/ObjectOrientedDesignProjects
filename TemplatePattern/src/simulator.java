
public class simulator {

	public static void main(String[] args) {
		
		makePool mp = new makePool();
		makeHotTub mht = new makeHotTub();
		
		System.out.println(" Making pool");
		mp.prepareBuild();
		
		System.out.println(" Making hotTub");
		mht.prepareBuild();
	
	}
}
