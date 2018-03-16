package stack;

public class StackMain{

	public static void main(String[] args) {
		
		Stack stack = new StackArray();
		
		System.out.println(stack.size());
		System.out.println(stack.isEmpty());
		
		stack.push("gröt");
		stack.push("fisk");
		stack.push("bacon");
		stack.push("ost");
		
		
		try{
			System.out.println(stack.peek());
			System.out.println(stack.pop());
			System.out.println(stack.peek());
		}
		catch(Exception e){
			
			System.err.println(e.toString());
			
		}
		Iterator list = stack.iterator();
		while(list.hasNext()){
			Object n = list.next();
			System.out.print(n + " ");
		}
	}
}
