package Game;

import java.util.ArrayList;

public class Cycling extends Games{

	public Cycling(int ID, String Referee, ArrayList<String> players) {
		super(ID, Referee, players);
		// TODO Auto-generated constructor stub
	}
	public static void listplayers() {
		int random;	

		ArrayList Cyclists = (ArrayList)new Data().getCyclists();
		ArrayList SAthlete = (ArrayList)new Data().getSAthlete();
		if (Cyclists.size() + SAthlete.size() < MaxAth){
			random = (int)(MinAth+Math.random()*(Cyclists.size()+SAthlete.size()-MinAth+1));
		}
		else {
			random = (int)(MinAth+Math.random()*(MaxAth-MinAth+1));
		}
		
		int[] resultArr = produceNum(1, Cyclists.size()+SAthlete.size()+1, random);
        for (Integer num : resultArr) {
        	if (num>Cyclists.size()){
        		SuperAthletes s=(SuperAthletes)SAthlete.get(num-Cyclists.size()-1);

    			s.SuperAthletesInfo();
        	}
        	else{
        		Cyclists s=(Cyclists)Cyclists.get(num-1);

    			s.CyclistsInfo();
        	}
        }
	}

}
