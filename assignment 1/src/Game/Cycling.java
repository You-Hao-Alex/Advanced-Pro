package Game;
/**
 * @date 03.04.2017
 * @author You Hao s3583715
 * @version 1.0
 * @Description Use cycling class to connect driver and get random number of cyclists  
 */


import java.util.ArrayList;

import Data.Cyclists;
import Data.SuperAthletes;

//inherit attributes from Games
public class Cycling extends Games{
	
	private String Referee; //set Referee parameter
	private String PlayerID;     //set PlayerID parameter
	
	
	//constructor of cycling game
	public Cycling(int ID) {
		super(ID);
		Referee = getReferee();
		PlayerID = getsID();
	}
	
	//constructor of getting gameID
	public String getsID() {
		if ( super.getID() < 10) {
			PlayerID = "C" + "0" + super.getID();
		}
		else {
			PlayerID = "S" + super.getID();
		}
		   return PlayerID;
		   }

	
	//generate players randomly from the data of Cyclists and SuperAthlete
	public static String[] listplayers() {
		int random; //set random parameter
		int i = -1; 
		String[] playerID = new String[8]; //set playerID array
		//Merge Cyclists ArrayList and SuperAthletes ArrayList size and restrict range of random player number
		if (Driver.Cyclists.size() + Driver.SuperAthletes.size() < MaxAth){
			random = (int)(MinAth+Math.random()*(Driver.Cyclists.size()+Driver.SuperAthletes.size()-MinAth+1));
		}
		else {
			random = (int)(MinAth+Math.random()*(MaxAth-MinAth+1));
		}
		
		int[] resultArr = produceNum(1, Driver.Cyclists.size()+Driver.SuperAthletes.size()+1, random);
        //use for to call particular number of player from Cyclists and SuperAthletes randomly
		for (Integer num : resultArr) {
        	i = i+1;
        	if (num>Driver.Cyclists.size()){
        		SuperAthletes SuperAthletes=(SuperAthletes)Driver.SuperAthletes.get(num-Driver.Cyclists.size()-1);
        		SuperAthletes.SuperAthletesInfo();
    			Driver.tempresult[i] = SuperAthletes.compete2(SuperAthletes.getID());
    			playerID[i] = SuperAthletes.getID();
    			Driver.tempname[i] = SuperAthletes.getName(); 
        	}
        	else{
        		Cyclists Cyclists=(Cyclists)Driver.Cyclists.get(num-1);
        		Cyclists.CyclistsInfo();
    			Driver.tempresult[i] = Cyclists.compete(Cyclists.getID());
    			playerID[i] = Cyclists.getID();
    			Driver.tempname[i] = Cyclists.getName(); 
        	}
        }
        return playerID;
			  }

}
