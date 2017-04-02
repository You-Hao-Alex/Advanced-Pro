package Game;

import java.util.ArrayList;

public class Cycling extends Games{
	private String Referee;
	private String sID;
	
	public Cycling(int ID) {
		super(ID);
		Referee = getReferee();
		sID = getsID();
	}
	public String getsID() {
		if ( super.getID() < 10) {
			sID = "C" + "0" + super.getID();
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
		if (Driver.Cyclists.size() + Driver.SuperAthletes.size() < MaxAth){
			random = (int)(MinAth+Math.random()*(Driver.Cyclists.size()+Driver.SuperAthletes.size()-MinAth+1));
		}
		else {
			random = (int)(MinAth+Math.random()*(MaxAth-MinAth+1));
		}
		
		int[] resultArr = produceNum(1, Driver.Cyclists.size()+Driver.SuperAthletes.size()+1, random);
        for (Integer num : resultArr) {
        	i = i+1;
        	if (num>Driver.Cyclists.size()){
        		SuperAthletes s=(SuperAthletes)Driver.SuperAthletes.get(num-Driver.Cyclists.size()-1);
    			s.SuperAthletesInfo();
    			Driver.tempresult[i] = s.compete2(s.getID());
    			playerID[i] = s.getID();
    			Driver.tempname[i] = s.getName(); 
        	}
        	else{
        		Cyclists s=(Cyclists)Driver.Cyclists.get(num-1);
    			s.CyclistsInfo();
    			Driver.tempresult[i] = s.compete(s.getID());
    			playerID[i] = s.getID();
    			Driver.tempname[i] = s.getName(); 
        	}
        }
        return playerID;
			  }

}
