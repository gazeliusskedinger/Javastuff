package rl22dv_lab3;

public class TextAnalyserMain {

	public static void main(String[] args) {
		
		String text = "My name is Anakin Skywalker. My age is 42.";
		
		TextAnalyser ta = new TextAnalyser(text);
		
		System.out.println("Char Count: "+ ta.charCount());
		
		System.out.println("Upper Case Count: "+ ta.upperCaseCount());
		
		System.out.println("Whitespace Count: "+ ta.whitespaceCount());
		
		System.out.println("Digit Count "+ ta.digitCount());
		
		if (ta.containsChar('x')){
			System.out.println("The text contains char \'x\'");
		}
		if (ta.containsString("42")){
			System.out.println("The text contains substring \"nakin\"");
		}
		// TODO Auto-generated method stub

	}

}
