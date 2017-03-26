package ADP;
import java.util.*;
public class superAthletes extends participant{
	private int result;
	public superAthletes(String id,String name,int age, String state, int result) {
		      setID(id);      
		      setName(name);
		      setAge(age);
		      setState(state);
		      this.result = result;
		   }
			public void superAthletesInfo() {
		      System.out.println("[superAthlete information]=====");
		      System.out.println("ID: " + getID());
		      System.out.println("Name: " + getName());
		      System.out.println("Age: " + getAge());
		      System.out.println("State: " + getState());
		   }
		   public void competeRunning(){
			    int max=20;
		        int min=10;
		        Random random = new Random();
		        result = random.nextInt(max)%(max-min+1) + min;
		   }
		   public void competeSwimming(){
			   int max=200;
		        int min=100;
		        Random random = new Random();
		        result = random.nextInt(max)%(max-min+1) + min;
		   }
		   public void competeCycling(){
			   int max=800;
		        int min=500;
		        Random random = new Random();
		        result = random.nextInt(max)%(max-min+1) + min;
		   }
		
		}