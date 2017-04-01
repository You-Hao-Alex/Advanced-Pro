 /**
     * @date 01.4.2017
     * @author Chih Yuan Chen
     * @version 1.0
     * @Description setting the role of athlete 
     */

public abstract class Athletes extends Participant{
	 private String id;         
	   private String name;   
	   private int age;  
	   private String state;
	   private int point;
	   private int result;
	   public Athletes(String id,String name,int age,String state,int point,int result){
		   setID(id);
		   setName(name);
		   setAge(age);
		   setState(state);
		   this.point=point;
		   this.result=result;
	   }
		public int getPoint() {
			return point;
		}
		
		public void setPoint(int point) {
			this.point = point;
		}
		
		public void setResult(int result) {
			this.result = result;
		}
		public int getResult() {
			return result;
		}
	   abstract public void compete();

	
}
