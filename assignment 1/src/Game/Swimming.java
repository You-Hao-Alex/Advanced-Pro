package Game;
/**
 * @date 03.04.2017
 * @author You Hao s3583715
 * @version 1.0
 * @Description Use swimming class to connect driver and get random number of swimmers  
 */
import java.util.*;

import Data.Data;
import Data.SuperAthletes;
import Data.Swimmers;
//inherit attributes from Games
public class Swimming extends Games {
	private String Referee;  //set Referee parameter
	private String PlayerID;  //set PlayerID parameter

	//constructor of Swimming game
	public Swimming(int ID) {
		super(ID);
		Referee = getReferee();
		PlayerID = getsID();
	}
	//constructor of getting gameID
	public String getsID() {
		if ( super.getID() < 10) {
			PlayerID = "S" + "0" + super.getID();
		}
		else {
			PlayerID = "S" + super.getID();
		}
		   return PlayerID;
		   }
	
	//generate players randomly from the data of Swimmers and SuperAthlete
	public static String[] listplayers() {
		int random; //set random parameter
		int i = -1;
		String[] playerID = new String[8]; //set playerID array
		ArrayList Swimmers = (ArrayList)new Data().getSwimmers();
		ArrayList SAthlete = (ArrayList)new Data().getSAthlete();
		//Merge Swimmers ArrayList and SuperAthletes ArrayList size and restrict range of random player number
		if (Swimmers.size() + SAthlete.size() < MaxAth){
			random = (int)(MinAth+Math.random()*(Swimmers.size()+SAthlete.size()-MinAth+1));
		}
		else {
			random = (int)(MinAth+Math.random()*(MaxAth-MinAth+1));
		}
		
		int[] resultArr = produceNum(1, Swimmers.size()+SAthlete.size()+1, random);
		//use for to call particular number of player from Swimmers and SuperAthletes randomly
		for (Integer num : resultArr) {
        	i = i+1;
        	if (num>Swimmers.size()){
        		SuperAthletes SuperAthletes=(SuperAthletes)SAthlete.get(num-Swimmers.size()-1);
        		SuperAthletes.SuperAthletesInfo();
    			Driver.tempresult[i] = SuperAthletes.compete1(SuperAthletes.getID());
    			playerID[i] = SuperAthletes.getID();
    			Driver.tempname[i] = SuperAthletes.getName(); 
        	}
        	else{
        		Swimmers Swimmer=(Swimmers)Swimmers.get(num-1);
        		Swimmer.SwimmersInfo();
    			Driver.tempresult[i] = Swimmer.compete(Swimmer.getID());
    			playerID[i] = Swimmer.getID();
    			Driver.tempname[i] = Swimmer.getName(); 
        	}
        }
        return playerID;
			  }


}