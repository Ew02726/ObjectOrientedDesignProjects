import java.nio.channels.IllegalSelectorException;
import java.util.Iterator;

public class GameIterator implements Iterator<Object> {

	Games[] list;
	int position = 0;
	
	public GameIterator(Games[] list) {
		this.list = list;
	}
	@Override
	public boolean hasNext() {
		if(position >= list.length || list[position] == null) {
			return false;
		}
		return true;
	}

	@Override
	public Object next() {
		Games game = list[position];
		position++;
		
		return game;
	}

	public void remove() {
		if(position <= 0) {
			throw new IllegalStateException("You can not remove until you have done at least one next()");
		}
		
		if(list[position-1] != null) {
			for(int i = position-1; i < (list.length-1); i++) {
				list[i] = list[i+1];
			}
			list[list.length-1] = null;
		}
	}
}
