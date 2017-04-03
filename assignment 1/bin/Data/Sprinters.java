package Data;
/**
 * @date 03.04.2017
 * @author Chih Yuan Chen S3585502
 * @version 1.0
 * @Description setting the role of Sprinters
 */

import java.util.Random; //import random function to set compete time 

public class Sprinters extends Athletes{
	//Set the attribute of sprinters and inherit attributes from Athletes
	public Sprinters(String id, String name, int age, String state,int point) {
		super(id, name, age, state, point);
		
	}
	//Display the information of Sprinters
	public void SprintersInfo (){
		System.out.print("ID: " + this.getID());
	    System.out.print(" Name: " + this.getName());
	    System.out.print(" Age: " + this.getAge());
	    System.out.print(" State: " + this.getState());
	    System.out.println(" Point: " + this.getPoint());
	}
	//Restrict time and run the sprint and set parameter id to connect with driver
	public int compete(String id) {
			int max=20;//set the max game time
	        int min=10;//set the min game time
	        Random random = new Random();//Create random variable
	       return result = random.nextInt(max)%(max-min+1) + min;//generate time and return it to result
	}

}
