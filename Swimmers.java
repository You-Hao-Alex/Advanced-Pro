package ADP;
import java.util.*;
public class Swimmers extends participant {
private int result;
	public Swimmers(String id,String name,int age, String state, int result) {
		      setID(id);      
		      setName(name);
		      setAge(age);
		      setState(state);
		      this.result = result;
		   }
			public void SwimmerInfo() {
		      System.out.println("[Swimmer information]=====");
		      System.out.println("ID: " + getID());
		      System.out.println("Name: " + getName());
		      System.out.println("Age: " + getAge());
		      System.out.println("State: " + getState());
		   }
		   public void compete(){
			   int max=200;
		        int min=100;
		        Random random = new Random();
		        result = random.nextInt(max)%(max-min+1) + min;
		        
		   }
		   
		   public int getResult(){return result;}
		
		}

