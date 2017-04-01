 /**
     * @date 01.4.2017
     * @author Chih Yuan Chen
     * @version 1.0
     * @Description setting the role of official 
     */
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
	   
}
