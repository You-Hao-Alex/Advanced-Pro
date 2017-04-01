package Game;

import java.util.Random;

public class Cyclists extends Athletes {

	public Cyclists(String id, String name, int age, String state,int point) {
		super(id, name, age, state, point);
		// TODO Auto-generated constructor stub
	}
	public void CyclistsInfo (){
		System.out.print("ID: " + this.getID());
	    System.out.print(" Name: " + this.getName());
	    System.out.print(" Age: " + this.getAge());
	    System.out.print(" State: " + this.getState());
	    System.out.println(" Point: " + this.getPoint());
	}
	@Override
	public void compete(int result) {
		// TODO Auto-generated method stub
		 int max=800;
	        int min=500;
	        Random random = new Random();
	        result = random.nextInt(max)%(max-min+1) + min;
	}

}
