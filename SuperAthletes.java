package Game;

import java.util.Random;

public class SuperAthletes extends Athletes {

	public SuperAthletes(String id, String name, int age, String state,int point) {
		super(id, name, age, state, point);
		// TODO Auto-generated constructor stub
	}
	public void SuperAthletesInfo (){
		System.out.print("ID: " + this.getID());
	      System.out.print(" Name: " + this.getName());
	      System.out.print(" Age: " + this.getAge());
	      System.out.print(" State: " + this.getState());
	      System.out.println(" Point: " + this.getPoint());
	}


	public int compete1(String id) {
		int max=200;
        int min=100;
        Random random = new Random();
        return result = random.nextInt(max)%(max-min+1) + min;
		
	}
	public int compete2(String id) {
		int max=800;
        int min=500;
        Random random = new Random();
        return result = random.nextInt(max)%(max-min+1) + min;
	}
	public int compete3(String id) {
		int max=20;
        int min=10;
        Random random = new Random();
       return result = random.nextInt(max)%(max-min+1) + min;
		
	}
}
