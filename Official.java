package Game;

public class Official extends Participant{
	   private String id;         
	   private String name;   
	   private int age;  
	   private String state;
	   public Official (String id,String name,int age,String state){
		   setID(id);
		   setName(name);
		   setAge(age);
		   setState(state);
	   }
	   public void OfficialInfo (){
			System.out.print("ID: " + this.getID());
		    System.out.print(" Name: " + this.getName());
		    System.out.print(" Age: " + this.getAge());
		    System.out.println(" State: " + this.getState());
		}
}