package Game;
/**
 * @date 03.04.2017
 * @author You Hao s3583715
 * @version 1.0
 * @Description setting game environment 
 */


import java.util.ArrayList;

import Data.Data;
import Data.Official;

public class Games {
	private int ID; //set ID parameter
	private String Referee; //set Referee parameter
	final public static int MinAth = 4; //restrict the min number of Athletes for each game
	final public static int MaxAth = 8; //restrict the max number of Athletes for each game
	
	
	//set GameID and assign referee
	public Games (int ID){
		this.ID = ID;
		Referee = getReferee();
	}
	
	//get GameID constructor
	public int getID() {
	   return ID;
	   }
	
	//getReferee constructor
	public String getReferee() {
		ArrayList Official = (ArrayList)new Data().getOfficial(); //load official data from data class
		int RandomOfficial = (int) (Math.random()*(Official.size())); //general one of official from data randomly
		Official GameReferee = (Official)Official.get(RandomOfficial); //get random official from data 
		return Referee = GameReferee.getName(); //get random official name
	   }

	//constructor of dealing with duplicate data to avoid same players to run the same game
	public static int[] produceNum(int minNum, int maxNum, int numCount) {
		if (numCount > (maxNum - minNum + 1) || maxNum < minNum) {
            return null;
        }
         
        //save result array 
        int[] resultArr = new int[numCount];
         
        //record number of random value 
        int count = 0;
         
        while(count < numCount) {
             
            // generate random value
            int num = (int) (Math.random() * (maxNum - minNum)) + minNum;
             
            // distinguish does the random value exist
            boolean flag = true;
             
            //checking the random value
            for (int i=0; i<count; i++) {
                 
                //compare with current random value
                if (num == resultArr[i]) {
                     
                    //if random value exists,create another random value
                    flag = false;
                    break;
                }
            }
             
            // id random value does not exists, save the random value
            if (flag) {
                resultArr[count] = num;
                 
                //count the number of random value  
                count++;
            }
        }
        return resultArr;
    }
	
	//Check number of athletes 
	public static void check (int athleteNum1, int athleteNum2){
		if (athleteNum1 + athleteNum2 > MinAth){
			Driver.start = true;
		}
		else{
			System.out.println("Sorry, not enough players");
			Driver.start = false;
		}
	}
}
