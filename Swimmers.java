 /**
     * @date 01.4.2017
     * @author Chih Yuan Chen
     * @version 1.0
     * @Description setting the role of swimmers
     */
import java.util.Random;

public class Swimmers extends Athletes{

	public Swimmers(String id, String name, int age, String state,int point,int result) {
		super(id, name, age, state,point,result);
		// TODO Auto-generated constructor stub
	}
   
	public void SwimmersInfo (){
		System.out.println("ID: " + this.getID());
	      System.out.println("Name: " + this.getName());
	      System.out.println("Age: " + this.getAge());
	      System.out.println("State: " + this.getState());
	      System.out.println("Point: " + this.getPoint());
	}
	
	public void SwimmersResultInfo (){
		  System.out.println("ID: " + this.getID());
	      System.out.println("Name: " + this.getName());
	      System.out.println("Age: " + this.getAge());
	      System.out.println("State: " + this.getState());
	      System.out.println("Result: " + this.getResult());
	      System.out.println("Point: " + this.getPoint());
	}


	@Override
	public void compete() {
		int r;
		int max=200;
        int min=100;
        Random random = new Random();
        r = random.nextInt(max)%(max-min+1) + min;
        this.setResult(r);
	}

	

}
