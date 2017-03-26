package ADP;

public class officials extends participant {
	public officials(String id,String name,int age, String state) {
	      setID(id);      
	      setName(name);
	      setAge(age);
	      setState(state);
	      
	   }
		public void officialsInfo() {
	      System.out.println("[officials information]=====");
	      System.out.println("ID: " + getID());
	      System.out.println("Name: " + getName());
	      System.out.println("Age: " + getAge());
	      System.out.println("State: " + getState());
	   }
}
