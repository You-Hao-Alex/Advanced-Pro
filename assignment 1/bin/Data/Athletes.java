package Data;
/**
 * @date 03.04.2017
 * @author Chih Yuan Chen S3585502
 * @version 1.0
 * @Description setting the role of athletes and inherit attributes from participant
 */


public class Athletes extends Participant{
	   public int point;  //Set point  parameter
	   public int result; //Set result parameter
	   
	   //Set attributes for each athletes
	   public Athletes(String id,String name,int age,String state,int point){
		   setID(id);
		   setName(name);
		   setAge(age);
		   setState(state);
		   this.point=point;

	   }
	   
	   // set the method to add points
	   public void setpoint(int score) { 
		   point = point + score;
	   }
	   
	   // set the method to acquire point and return its value
	   public int getPoint() {
			return point;
		}
		

			
	   //set the compete method to run the game
	   public int compete(String id){
		   return result;
	   }

	
}
