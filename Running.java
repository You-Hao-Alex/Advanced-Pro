package Game;

import java.util.ArrayList;

public class Running extends Games{

	public Running(int ID, String Referee, ArrayList<String> players) {
		super(ID, Referee, players);
		// TODO Auto-generated constructor stub
	}
	public static void listplayers() {
		int random;	

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
        	if (num>Sprinters.size()){
        		SuperAthletes s=(SuperAthletes)SAthlete.get(num-Sprinters.size()-1);

    			s.SuperAthletesInfo();
        	}
        	else{
        		Sprinters s=(Sprinters)Sprinters.get(num-1);

    			s.SprintersInfo();
        	}
        }
	}
}
