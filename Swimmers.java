package Game;

import java.util.Random;

public class Swimmers extends Athletes{

	public Swimmers(String id, String name, int age, String state,int point) {
		super(id, name, age, state, point);
	}
   
	public void SwimmersInfo (){
		System.out.print("ID: " + this.getID());
	      System.out.print(" Name: " + this.getName());
	      System.out.print(" Age: " + this.getAge());
	      System.out.print(" State: " + this.getState());
	      System.out.println(" Point: " + this.getPoint());
	}
	
	
	@Override
	public int compete(String id) {
		int max=200;
        int min=100;
        Random random = new Random();
        return result = random.nextInt(max)%(max-min+1) + min;
	}
	

	

}
