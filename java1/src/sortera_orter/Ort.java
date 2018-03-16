package sortera_orter;


public class Ort implements Comparable<Ort>{
	
	private final int postNum;
	private final String postOrt;
	
	public Ort(int nummer, String ort){
	
		postNum = nummer;
		postOrt = ort;
	}
	
	public int getPostNum(){
		return postNum;
	}
	
	public String getPostOrt(){
		return postOrt;
	}

	@Override
	public int compareTo(Ort o) {
		if(postNum > o.getPostNum()){
			return 1;
		}
		if(postNum < o.getPostNum()){
			return -1;
		}
		return 0;
		
	}
	
	
}
