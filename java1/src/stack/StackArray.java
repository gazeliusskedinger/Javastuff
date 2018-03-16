package stack;

public class StackArray implements Stack{ 
	
	private Object[] stackArray = new Object[8];
	int raknare = 0;
	
	public int size(){
		
		return raknare;
		
	}
	//kollar om stack är tom
	public boolean isEmpty(){
		
		if(raknare == 0){
			
			return true;
			
		}
		else{
			
			return false;
			
		}
	}
	
	// ändrar storlek på stacken 
	public Object[] resize(){
		
		Object[] salange = new Object[stackArray.length*2];
		
		for(int i = 0; i < stackArray.length; i++){
			
			salange[i] = stackArray[i];
			
		}
		
		return salange;
	}

	// lägger till objekt i stacken
	@Override
	public void push(Object element) {
		
		if(raknare == stackArray.length){
			
			stackArray = resize();
			
		}
		
			stackArray[raknare++] = element;
		// TODO Auto-generated method stub
		
	}

	//tar ut object ur stacken	
	@Override
	public Object pop() {
		if(isEmpty()){
			throw new IllegalArgumentException("Det finns inget i stacken!");
		}
		else{
		// TODO Auto-generated method stub
		return stackArray[--raknare];
		}
	}
	// kollar vad det finns för object överst på stacken
	@Override
	public Object peek() {
		if(isEmpty()){
			throw new IllegalArgumentException("Det finns inget i stacken!");
		}
		else{
		// TODO Auto-generated method stub
				return stackArray[raknare-1];
		}	
		
	}

	//kollar vad det finns för object i stacken
	public Iterator iterator() {
		return new Iterator(stackArray, raknare);
	}
	
	
	
}
