package ADP;
import java.util.*;
public class Sprinters extends participant{
	private int result;
	public Sprinters(String id,String name,int age, String state, int result) {
		      setID(id);      
		      setName(name);
		      setAge(age);
		      setState(state);
		      this.result = result;
		   }
			public void SprintersInfo() {
		      System.out.println("[Sprinter information]=====");
		      System.out.println("ID: " + getID());
		      System.out.println("Name: " + getName());
		      System.out.println("Age: " + getAge());
		      System.out.println("State: " + getState());
		   }
		   public void compete(){
			   int max=20;
		        int min=10;
		        Random random = new Random();
		        result = random.nextInt(max)%(max-min+1) + min;
		   }
		
		}
