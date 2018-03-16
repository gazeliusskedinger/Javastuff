package stack;

public class Iterator {
		
	private int nastaTal = 0;
	private final Object[] elementArray;
	private final int max;
	
	public Iterator(Object[] stack, int maxTal){
		elementArray = stack;
		max = maxTal;
	}
	

	public boolean hasNext() {
		return nastaTal<max;
	}

	public Object next() {
		return elementArray[nastaTal++];
	}
	
}

	
