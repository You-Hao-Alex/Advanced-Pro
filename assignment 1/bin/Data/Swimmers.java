package Data;
/**
 * @date 03.04.2017
 * @author Chih Yuan Chen S3585502
 * @version 1.0
 * @Description  setting the role of Swimmers
 */
import java.util.Random;//import random function to set compete time 

public class Swimmers extends Athletes{
	//Set the attribute of Swimmers and inherit attributes from Athletes
	public Swimmers(String id, String name, int age, String state,int point) {
		super(id, name, age, state, point);
	}
	//Display the information of Sprinters
	public void SwimmersInfo (){
		System.out.print("ID: " + this.getID());
	      System.out.print(" Name: " + this.getName());
	      System.out.print(" Age: " + this.getAge());
	      System.out.print(" State: " + this.getState());
	      System.out.println(" Point: " + this.getPoint());
	}
	
	
	//Restrict time and run Swimming and set parameter id to connect with driver
	public int compete(String id) {
		int max=200;//set the max game time
        int min=100;//set the max game time
        Random random = new Random();//Create random variable
        return result = random.nextInt(max)%(max-min+1) + min;//generate time and return it to result
	}
	

	

}
