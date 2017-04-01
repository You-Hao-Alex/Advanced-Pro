 /**
     * @date 01.4.2017
     * @author Chih Yuan Chen
     * @version 1.0
     * @Description setting the role of superathletes
     */
import java.util.Random;

public class SuperAthletes extends Athletes {
	private String gameType;
	public SuperAthletes(String id, String name, int age, String state,int point,int result) {
		super(id, name, age, state, point,result);
		// TODO Auto-generated constructor stub
	}
	public void SuperAthletesInfo (){
		System.out.println("ID: " + this.getID());
	      System.out.println("Name: " + this.getName());
	      System.out.println("Age: " + this.getAge());
	      System.out.println("State: " + this.getState());
	      System.out.println("Point: " + this.getPoint());
	}
	@Override
	public void compete() {
		// TODO Auto-generated method stub
		if(gameType=="Cycling"){
			int r;
			int max=800;
		        int min=500;
		        Random random = new Random();
		       r = random.nextInt(max)%(max-min+1) + min;
		       this.setResult(r);
		}
		else if(gameType=="Swimming"){
			int r;
			int max=200;
	        int min=100;
	        Random random = new Random();
	        r = random.nextInt(max)%(max-min+1) + min;
	        this.setResult(r);
		}
		else if(gameType=="Sprinting"){
			int r ;
			int max=20;
		        int min=10;
		        Random random = new Random();
		        r = random.nextInt(max)%(max-min+1) + min;
		        this.setResult(r);
		}
		
	}

}
