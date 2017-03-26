package ADP;
import java.util.*;
public class Cyclists extends participant{
	private int result;
	public Cyclists(String id,String name,int age, String state, int result) {
		      setID(id);      
		      setName(name);
		      setAge(age);
		      setState(state);
		      this.result = result;
		   }
			public void CyclistsInfo() {
		      System.out.println("[Cyclist information]=====");
		      System.out.println("ID: " + getID());
		      System.out.println("Name: " + getName());
		      System.out.println("Age: " + getAge());
		      System.out.println("State: " + getState());
		   }
		   public void compete(){
			   int max=800;
		        int min=500;
		        Random random = new Random();
		        result = random.nextInt(max)%(max-min+1) + min;
		   }
		
		}

