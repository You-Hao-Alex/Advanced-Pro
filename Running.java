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
		ArrayList Sprinters = (ArrayList)new Data().getSprinters();
		ArrayList SAthlete = (ArrayList)new Data().getSAthlete();
		if (Sprinters.size() + SAthlete.size() < MaxAth){
			random = (int)(MinAth+Math.random()*(Sprinters.size()+SAthlete.size()-MinAth+1));
		}
		else {
			random = (int)(MinAth+Math.random()*(MaxAth-MinAth+1));
		}
		
		int[] resultArr = produceNum(1, Sprinters.size()+SAthlete.size()+1, random);
        for (Integer num : resultArr) {
        	i = i+1;
        	if (num>Sprinters.size()){
        		SuperAthletes s=(SuperAthletes)SAthlete.get(num-Sprinters.size()-1);
    			s.SuperAthletesInfo();
    			Driver.tempresult[i] = s.compete3(s.getID());
    			playerID[i] = s.getID();
    			Driver.tempname[i] = s.getName(); 
        	}
        	else{
        		Sprinters s=(Sprinters)Sprinters.get(num-1);
    			s.SprintersInfo();
    			Driver.tempresult[i] = s.compete(s.getID());
    			playerID[i] = s.getID();
    			Driver.tempname[i] = s.getName(); 
        	}
        }
        return playerID;
	}
}
