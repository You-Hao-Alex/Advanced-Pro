package Game;

import java.util.ArrayList;

public class Running extends Games{
	private String Referee;
	private String sID;

	public Running(int ID) {
		super(ID);
		Referee = getReferee();
		sID = getsID();
	}
	public String getsID() {
		if ( super.getID() < 10) {
			sID = "S" + "0" + super.getID();
		}
		else {
		sID = "R" + super.getID();
		}
		   return sID;
		   }

	public static String[] listplayers() {
		int random;	
		int i = -1;
		String[] playerID = new String[8];
		if (Driver.Sprinters.size() + Driver.SuperAthletes.size() < MaxAth){
			random = (int)(MinAth+Math.random()*(Driver.Sprinters.size()+Driver.SuperAthletes.size()-MinAth+1));
		}
		else {
			random = (int)(MinAth+Math.random()*(MaxAth-MinAth+1));
		}
		
		int[] resultArr = produceNum(1, Driver.Sprinters.size()+Driver.SuperAthletes.size()+1, random);
        for (Integer num : resultArr) {
        	i = i+1;
        	if (num>Driver.Sprinters.size()){
        		SuperAthletes s=(SuperAthletes)Driver.SuperAthletes.get(num-Driver.Sprinters.size()-1);
    			s.SuperAthletesInfo();
    			Driver.tempresult[i] = s.compete3(s.getID());
    			playerID[i] = s.getID();
    			Driver.tempname[i] = s.getName(); 
        	}
        	else{
        		Sprinters s=(Sprinters)Driver.Sprinters.get(num-1);
    			s.SprintersInfo();
    			Driver.tempresult[i] = s.compete(s.getID());
    			playerID[i] = s.getID();
    			Driver.tempname[i] = s.getName(); 
        	}
        }
        return playerID;
	}
}
