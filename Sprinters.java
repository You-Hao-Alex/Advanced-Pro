package Game;

import java.util.Random;

public class Sprinters extends Athletes{

	public Sprinters(String id, String name, int age, String state,int point) {
		super(id, name, age, state, point);
		// TODO Auto-generated constructor stub
	}
	public void SprintersInfo (){
		System.out.print("ID: " + this.getID());
	    System.out.print(" Name: " + this.getName());
	    System.out.print(" Age: " + this.getAge());
	    System.out.print(" State: " + this.getState());
	    System.out.println(" Point: " + this.getPoint());
	}
	@Override
	public int compete(String id) {
		// TODO Auto-generated method stub
		 int max=20;
	        int min=10;
	        Random random = new Random();
	       return result = random.nextInt(max)%(max-min+1) + min;
	}

}
