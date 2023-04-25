package Building_blocks_of_java;

public class Static_Variables {
	static String name = "Hemanth";
	static int age = 28;
	static int Likes = 0;
	
//	public static void Liked () {
//		this.Likes =this. Likes++;
//	}
	
	public static void main(String[] args) {
		System.out.println(name);
		System.out.println(age);
		System.out.println(Static_Variables.name);
		System.out.println(Static_Variables.age);
		Static_Variables.name="mani";
		Static_Variables.age = 27;
		System.out.println(Static_Variables.name);
		System.out.println(Static_Variables.age);
		
		Static_Variables mani = new Static_Variables();
		Static_Variables Hemanth = new Static_Variables();
		System.out.println(Static_Variables.Likes);
		mani.Likes++;
		Hemanth.Likes++;
		mani.Likes++;
		Hemanth.Likes++;
		
		System.out.println(Static_Variables.Likes);
		
		
		
		
		
		
	}
	
	
}
