package Game;


public abstract class Athletes extends Participant{
	public int point;
	   public int result;
	   public Athletes(String id,String name,int age,String state,int point){
		   setID(id);
		   setName(name);
		   setAge(age);
		   setState(state);
		   this.point=point;

	   }
	   public void setpoint(int score) { 
		   point = point + score;
	   }
	   
		public int getPoint() {
			return point;
		}
		

			
	
	   public int compete(String id){
		   return result;
	   }

	
}
