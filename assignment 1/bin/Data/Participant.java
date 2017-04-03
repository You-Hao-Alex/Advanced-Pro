package Data;
/**
 * @date 03.04.2017
 * @author Chih Yuan Chen S3585502
 * @version 1.0
 * @Description setting the role of participant
 */


public class Participant {
	   private  String id;   //set id parameter        
	   private String name;  //set name parameter 
	   private int age;      //set age parameter
	   private String state; //set state parameter
	
	   //get id method
	   public String getID() { return id; }
	  
	   //get name method
	   public String getName() { return name; }
	 
	   //get age method
	   public int getAge() { return age; }
	   
	   //get state method
	   public String getState() { return state; }
	  
	   //set id method
	   public void setID(String id) { this.id = id; }
	 
	   //set name method
	   public void setName(String name) { this.name = name; }
	  
	   //set age method
	   public void setAge(int age) { this.age =age; }
	   
	   //set state method
	   public void setState(String state) { this.state = state; }
	   
	  
}

