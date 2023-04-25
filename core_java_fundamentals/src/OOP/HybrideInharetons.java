package OOP;

class Machine{
	int Mid;
	String MachineName;
	public Machine(int Mid,String MachineName) {
		this.MachineName = MachineName;
		this.Mid = Mid;
	}
}

class Delay extends Machine{
	String DelayType;
	int Duriation;
	public Delay(String DelayType,int Duriation,int Mid,String MachineName) {
		super(Mid, MachineName);
		this.DelayType= DelayType;
		this.Duriation= Duriation;
	}
	
}
public class HybrideInharetons {
	
	public static void main(String[] args) {
		Delay delay = new Delay("m",120,101,"2L33");
		Delay delay1 = new Delay("e",20,106,"5L57");
		System.out.println(delay.MachineName+"\t"+delay.Mid+"\t"+delay.DelayType+"\t"+delay.Duriation+"\t");
		System.out.println(delay1.MachineName+"\t"+delay1.Mid+"\t"+delay1.DelayType+"\t"+delay1.Duriation+"\t");

	}

}
