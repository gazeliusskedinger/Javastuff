package rl22dv_lab3;

public class AlarmClockmain {
	
private static final int FEMHUNDRA = 500;

	public static void main(String[] args) {
		
		AlarmClock ac = new AlarmClock(23, 48);
		// visar tiden
		ac.displayTime();
		// sätter larm
		ac.setAlarm(6, 15);
		//tickar 500 min 
		for(int i = 0; i < FEMHUNDRA; i++ ){
			ac.timeTick();
		}
		//visar tiden igen
		ac.displayTime();
		// TODO Auto-generated method stub
	}

}
