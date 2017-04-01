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
	
	
	public static void listplayers() {
		int random;	
		ArrayList Swimmers = (ArrayList)new Data().getSwimmers();
		ArrayList SAthlete = (ArrayList)new Data().getSAthlete();
		if (Swimmers.size() + SAthlete.size() < MaxAth){
			random = (int)(MinAth+Math.random()*(Swimmers.size()+SAthlete.size()-MinAth+1));
		}
		else {
			random = (int)(MinAth+Math.random()*(MaxAth-MinAth+1));
		}
		
		int[] resultArr = produceNum(1, Swimmers.size()+SAthlete.size()+1, random);
        for (Integer num : resultArr) {
        	if (num>Swimmers.size()){
        		SuperAthletes s=(SuperAthletes)SAthlete.get(num-Swimmers.size()-1);
    			s.SuperAthletesInfo();
        	}
        	else{
        		Swimmers s=(Swimmers)Swimmers.get(num-1);
    			s.SwimmersInfo();
        	}
        }
			  }


}