package rl22dv_lab3;

public class MultiDisplay {
	
	private int counter;
	private String textToPrint;
	
	MultiDisplay(){
		counter = 0;
		textToPrint = "";
	}
	
	MultiDisplay(String text, int tal){
		counter = tal;
		textToPrint = text;
	}
	
	public void setDisplayMessage(String text) {
		textToPrint = text;
	}

	public void setDisplayCount(int tal) {
		counter = tal;
	}

	public void display(){
		
		for(int i = 0; i < counter; i++){
			System.out.println(textToPrint);
		}
	}

	public void display(String text, int tal) {
		setDisplayMessage(text);
		setDisplayCount(tal);
		display();
	}

	public String getDisplayMessage() {
		return textToPrint;
	}
}
