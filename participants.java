import java.util.*;
interface athletes{
	
	public void compete();
	
};

class swimmer implements athletes{
    private String id;
    private String name;
    private int age;
    private String state;
    public void setSwimmer(String id,String name,int age,String state){
    	this.id=id;
    	this.name=name;
    	this.age=age;
    	this.state=state;
    }
	@Override
	public void compete() {
		// TODO Auto-generated method stub
		int max=200;
        int min=100;
        Random random = new Random();
        int s = random.nextInt(max)%(max-min+1) + min;
        
        System.out.println("ID:"+id);
        System.out.println("name:"+name);
        System.out.println("Age:"+age);
        System.out.println("State:"+state);
        System.out.println("Result:"+s);
        System.out.println();
    	
	}
	
	
	
}




public class participants {

	public static void main(String[] args) {
	swimmer s1=new swimmer();
	swimmer s2=new swimmer();
	swimmer s3=new swimmer();

	s1.setSwimmer("s01", "Peter", 20, "Vic");
	s1.compete();
	s2.setSwimmer("s02", "James", 25, "Vic");
	s2.compete();
	s3.setSwimmer("s03", "Tom", 30, "Vic");
	s3.compete();
	
	}

}
