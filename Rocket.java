package cat.rocket.main;

public class Rocket {
	
	// Attribute
	
		private int engineNum;
		private String id;
		
		// Constructor
		public Rocket(String id,int engineNum){
			getEngineNum();
			getId();
			this.engineNum = engineNum;
			this.id = id;
		
		}
		
	    // Methods 
		public int getEngineNum() {
			return engineNum;
			/*validar?
		* public int getInteger(int n){
		* int n = "";} 
			 * opció 2:
			 */
		}

		public String getId() {
			return id;
			/*validar?
			* public String getString(String identifier){
			* String alfanum = " ";
			* while (alfanum.equals(" ")){
			* System.ou.println(identifier);
			* alfanum = sc.nextline();} 
				 * 
				 */
		}

}
