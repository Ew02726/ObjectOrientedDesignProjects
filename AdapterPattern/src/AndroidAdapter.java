
public class AndroidAdapter implements Iphone {

	Android android;
	
	public AndroidAdapter(Android android) {
		this.android = android;
	}
	
	@Override
	public void type() {
		android.type();
		
	}

	@Override
	public void charger() {
		android.charger();
		
	}

}
