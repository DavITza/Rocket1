package cat.rocket.main;

public class Main {

	
	public static void main(String[] args) {
		
		Rocket R1 = new Rocket("32WESSDS", 3);
		Rocket R2 = new Rocket("LDSFJA32", 6);
		
		
		
		System.out.println(R1.getId()+ " " + R1.getEngineNum());
		System.out.println(R2.getId()+ "  " +R2.getEngineNum());
		

	}

}
