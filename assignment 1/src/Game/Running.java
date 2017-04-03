package Game;
/**
 * @date 03.04.2017
 * @author You Hao s3583715
 * @version 1.0
 * @Description Use swimming class to connect driver and get random number of sprinters 
 */

import java.util.ArrayList;

import Data.Sprinters;
import Data.SuperAthletes;
//inherit attributes from Games
public class Running extends Games{
	private String Referee; //set Referee parameter
	private String PlayerID; //set PlayerID parameter
	//constructor of running game
	public Running(int ID) {
		super(ID);
		Referee = getReferee();
		PlayerID = getsID();
	}
	//constructor of getting PlayerID
	public String getsID() {
		if ( super.getID() < 10) {
			PlayerID = "S" + "0" + super.getID();
		}
		else {
			PlayerID = "R" + super.getID();
		}
		   return PlayerID;
		   }
	//generate players randomly from the data of Sprinters and SuperAthlete
	public static String[] listplayers() {
		int random;	//set random parameter
		int i = -1;
		String[] playerID = new String[8];//set playerID array
		//Merge Sprinters ArrayList and SuperAthletes ArrayList size and restrict range of random player number
		if (Driver.Sprinters.size() + Driver.SuperAthletes.size() < MaxAth){
			random = (int)(MinAth+Math.random()*(Driver.Sprinters.size()+Driver.SuperAthletes.size()-MinAth+1));
		}
		else {
			random = (int)(MinAth+Math.random()*(MaxAth-MinAth+1));
		}
		
		int[] resultArr = produceNum(1, Driver.Sprinters.size()+Driver.SuperAthletes.size()+1, random);
		//use for to call particular number of player from Sprinters and SuperAthletes randomly
		for (Integer num : resultArr) {
        	i = i+1;
        	if (num>Driver.Sprinters.size()){
        		SuperAthletes SuperAthletes=(SuperAthletes)Driver.SuperAthletes.get(num-Driver.Sprinters.size()-1);
        		SuperAthletes.SuperAthletesInfo();
    			Driver.tempresult[i] = SuperAthletes.compete3(SuperAthletes.getID());
    			playerID[i] = SuperAthletes.getID();
    			Driver.tempname[i] = SuperAthletes.getName(); 
        	}
        	else{
        		Sprinters Sprinters=(Sprinters)Driver.Sprinters.get(num-1);
        		Sprinters.SprintersInfo();
    			Driver.tempresult[i] = Sprinters.compete(Sprinters.getID());
    			playerID[i] = Sprinters.getID();
    			Driver.tempname[i] = Sprinters.getName(); 
        	}
        }
        return playerID;
	}
}
