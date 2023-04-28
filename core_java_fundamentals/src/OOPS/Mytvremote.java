package OOPS;

interface Remote {
	void Power();
	void Chincrease();
	void Chdecrease();
	void Volincrease();
	void Voldecrease();
	
}

class Tvremote implements Remote{
	 boolean Tvon = false;
	 int currentchannel = 1;
	 int firstchannel = 1;
	 int lastchannel = 100;
	 int currentvolume = 10;
	 int minvolume = 1;
	 int maxvolume = 40;

	@Override
	public void Power() {
		if (Tvon == false) {
			System.out.println("Tvon");
			Tvon=true;
		}
		else {
			System.out.println("Tvoff");
			Tvon=false;
		}
		
		
	}

	@Override
	public void Chincrease() {
		if (Tvon == true) {
			if(currentchannel >= firstchannel && currentchannel < lastchannel) {
				currentchannel++;
				System.out.println("now you are in "+ currentchannel+"number chanel");
			}
			else {
				System.out.println("You cannont go up beyond this ..");
			}
			
		}
		else {
			System.out.println("please switch on the TV");
		}
			
		
	}

	@Override
	public void Chdecrease() {
		if (Tvon == true) {
			if(currentchannel >= firstchannel && currentchannel < lastchannel) {
				currentchannel--;
				System.out.println("now you are in "+ currentchannel+"number chanel");
			}
			else {
				System.out.println("You cannont go down beyond this ..");
			}
			
		}
		else {
			System.out.println("please switch on the TV");
		}
		
	}

	@Override
	public void Volincrease() {
		if (Tvon == true) {
			if(currentvolume >= minvolume && currentchannel < maxvolume) {
				currentvolume++;
				System.out.println("Your current volume is "+ currentvolume );
			}
			else {
				System.out.println("Max volume reached");
			}
			
		}
		else {
			System.out.println("please switch on the TV");
		}
		
	}

	@Override
	public void Voldecrease() {
		if (Tvon == true) {
			if(currentvolume >= minvolume && currentchannel < maxvolume) {
				currentvolume--;
				System.out.println("Your current volume is "+ currentvolume);
			}
			else {
				System.out.println("min volume reached");
			}
			
		}
		else {
			System.out.println("please switch on the TV");
		}
		
	}
	
}

public class Mytvremote {	

	public static void main(String[] args) {
		
		Remote remote = new Tvremote();
		remote.Power();
		remote.Chincrease();
		remote.Chdecrease();
		
		remote.Chincrease();
		remote.Chdecrease();
		remote.Volincrease();
		remote.Voldecrease();
		
		
		
		
		
	}

}
