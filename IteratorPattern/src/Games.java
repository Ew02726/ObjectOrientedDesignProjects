import java.util.Iterator;

public class Games implements Game{

	String name;
	String description;
	double price;
	boolean rRated;
	
	public String getName() {
		return name;
	}

	

	public String getDescription() {
		return description;
	}


	public double getPrice() {
		return price;
	}


	public boolean isrRated() {
		return rRated;
	}


	public Games(String name, String description, boolean rRated, double price) {
		this.name = name;
		this.description = description;
		this.rRated = rRated;
		this.price = price;
	}



	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
