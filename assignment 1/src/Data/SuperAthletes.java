package Data;
/**
 * @date 03.04.2017
 * @author Chih Yuan Chen S3585502
 * @version 1.0
 * @Description  setting the role of SuperAthlete
 */

import java.util.Random; //import random function to set compete time 

public class SuperAthletes extends Athletes {
	//Set the attribute of SuperAthletes and inherit attributes from Athletes
	public SuperAthletes(String id, String name, int age, String state,int point) {
		super(id, name, age, state, point);
		
	}
	//Display the information of SuperAthletes
	public void SuperAthletesInfo (){
		System.out.print("ID: " + this.getID());
	      System.out.print(" Name: " + this.getName());
	      System.out.print(" Age: " + this.getAge());
	      System.out.print(" State: " + this.getState());
	      System.out.println(" Point: " + this.getPoint());
	}

	//Restrict the record time and let SuperAthletes run Swimming and set parameter id to connect with driver
	public int compete1(String id) {
		int max=200;//set the max game time
        int min=100;//set the max game time
        Random random = new Random();
        return result = random.nextInt(max)%(max-min+1) + min;
		
	}
	//Restrict the record time and let SuperAthletes run the Cycling and set parameter id to connect with driver
	public int compete2(String id) {
		int max=800;//set the max game time
        int min=500;//set the max game time
        Random random = new Random();//Create random variable
        return result = random.nextInt(max)%(max-min+1) + min;//generate time and return it to result
	}
	
	//Restrict the record time and let SuperAthletes run sprint and set parameter id to connect with driver
	public int compete3(String id) {
		int max=20;//set the max game time
        int min=10;//set the max game time
        Random random = new Random();//Create random variable
       return result = random.nextInt(max)%(max-min+1) + min;//generate time and return it to result
		
	}
}
