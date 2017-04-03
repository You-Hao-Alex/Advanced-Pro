package Data;

/**
 * @date 03.04.2017
 * @author Chih Yuan Chen S3585502
 * @version 1.0
 * @Description setting the role of official and inherit attributes from participant
 */

public class Official extends Participant{
	   private String id;      //set id parameter  
	   private String name;   //set name parameter   
	   private int age;       //set age parameter
	   private String state; //set state parameter
	   
	   //set attributes of official
	   public Official (String id,String name,int age,String state){
		   setID(id);
		   setName(name);
		   setAge(age);
		   setState(state);
	   }

}