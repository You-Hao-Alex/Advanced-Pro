 /**
     * @date 01.4.2017
     * @author Chih Yuan Chen
     * @version 1.0
     * @Description setting the role of participant
     */

public class Participant {
	 private String id;         
	   private String name;   
	   private int age;  
	   private String state;

	
	   public String getID() { return id; }
	  
	   public String getName() { return name; }
	 
	   public int getAge() { return age; }
	   
	   public String getState() { return state; }
	   

	  
	   public void setID(String id) { this.id = id; }
	 
	   public void setName(String name) { this.name = name; }
	  
	   public void setAge(int age) { this.age =age; }
	   
	   public void setState(String state) { this.state = state; }
	   

	   
	   public void personInfo() {
	      System.out.println("ID: " + id);
	      System.out.println("Name: " + name);
	      System.out.println("Age: " + age);
	      System.out.println("State: " + state);
}
}
