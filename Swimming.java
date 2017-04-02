package Game;
import java.util.*;

public class Swimming extends Games {
	private String Referee;
	private String sID;

	public Swimming(int ID) {
		super(ID);
		Referee = getReferee();
		sID = getsID();
	}
	
	public String getsID() {
		if ( super.getID() < 10) {
			sID = "S" + "0" + super.getID();
		}
		else {
		sID = "S" + super.getID();
		}
		   return sID;
		   }
	
	
	public static String[] listplayers() {
		int random;
		int i = -1;
		String[] playerID = new String[8];

		if (Driver.Swimmers.size() + Driver.SuperAthletes.size() < MaxAth){
			random = (int)(MinAth+Math.random()*(Driver.Swimmers.size()+Driver.SuperAthletes.size()-MinAth+1));
		}
		else {
			random = (int)(MinAth+Math.random()*(MaxAth-MinAth+1));
		}
		
		int[] resultArr = produceNum(1, Driver.Swimmers.size()+Driver.SuperAthletes.size()+1, random);
        for (Integer num : resultArr) {
        	i = i+1;
        	if (num>Driver.Swimmers.size()){
        		SuperAthletes s=(SuperAthletes)Driver.SuperAthletes.get(num-Driver.Swimmers.size()-1);
    			s.SuperAthletesInfo();
    			Driver.tempresult[i] = s.compete1(s.getID());
    			playerID[i] = s.getID();
    			Driver.tempname[i] = s.getName(); 
        	}
        	else{
        		Swimmers s=(Swimmers)Driver.Swimmers.get(num-1);
    			s.SwimmersInfo();
    			Driver.tempresult[i] = s.compete(s.getID());
    			playerID[i] = s.getID();
    			Driver.tempname[i] = s.getName(); 
        	}
        }
        return playerID;
			  }


}