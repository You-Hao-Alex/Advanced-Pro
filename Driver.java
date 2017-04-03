package Game;
import java.util.*;

public class Driver {
	/**
     * @date 03.04.2017
     * @author You Hao
     * @version 1.0
     * @Description Driver Class
     */
	int sportnum = 0; //record the type of game
	int gameid = 1; //record the ID of game
	String preID; //the ID of user's prediction
	boolean prediction = false; //record whether prediction has been done or not
	static boolean start = false; //control the start of game
	Scanner reader = new Scanner(System.in); //get input
	static String tempGameID; //record the current game ID
	static String tempreferee; //record the current referee name
	static String[] tempid = new String[8]; //record the current players' IDs
	static String[] tempname = new String[8]; //record the current players' names
	static int[] tempresult = new int[8]; //record the current players' results
	static int[] temprank = new int[8]; //record the current players' ranks
	static ArrayList Swimmers = (ArrayList) new Data().getSwimmers(); //input Swimmers data
	static ArrayList Cyclists = (ArrayList) new Data().getCyclists(); //input Cyclists data
	static ArrayList Sprinters = (ArrayList) new Data().getSprinters(); //input Sprinters data
	static ArrayList SuperAthletes = (ArrayList) new Data().getSAthlete(); //input SuperAthletes data
	static ArrayList Official = (ArrayList)new Data().getOfficial(); //input Officials data
	static ArrayList History = (ArrayList)new Data().getHistory(); //input History data
	
	public void runGame() {
		// display menu, choose options
		int choice; //the input choice
		boolean quit = false; //control quit
		boolean go = true; //control whether continue
		do{
			AllMenu.menu(); //show the menu
			do {
		        try {
		            choice = reader.nextInt();
		            if (choice > 6 || choice < 1) {
		            	System.out.println("Invalid input, please choose again: ");
		            	continue;
		            }
		            switch (choice) {
					case 1:
						gametype();
						break;
					case 2:
						predict();
						break;
					case 3:
						startgame();
						break;
					case 4:
						disresult();
						break;
					case 5:
						dispoint();
					case 6:
						System.out.println("Goodbye!");
						break;
					default:
						System.out.println("Please enter your choice: ");
						break;
					}
		            go = false;
		        }
		        catch (Exception e) {
		        	//catch errors
		            System.out.println("Invalid input, please choose again: ");
		            reader.nextLine();      
		        }
			} while (go);
		} while (quit);
	}
			
	private void dispoint() {
		//display the points of all athletes
		for(int i=0;i<Swimmers.size();i++){
			Swimmers s = (Swimmers)Swimmers.get(i);
			s.SwimmersInfo();
		} //display swimmers' point
		for(int i=0;i<Cyclists.size();i++){
			Cyclists s = (Cyclists)Cyclists.get(i);
			s.CyclistsInfo();
		}//display cyclists' point
		for(int i=0;i<Sprinters.size();i++){
			Sprinters s = (Sprinters)Sprinters.get(i);
			s.SprintersInfo();
		}//display sprinters' point
		for(int i=0;i<SuperAthletes.size();i++){
			SuperAthletes s = (SuperAthletes)SuperAthletes.get(i);
			s.SuperAthletesInfo();
		}//display super athletes' point
		runGame();
	}



	private void disresult() {
		//display the final results of all games
		for(int i=0;i<History.size();i++){
			History s = (History)History.get(i);
			System.out.println("GameID: "+s.getid());
			System.out.println("Referee: "+s.getreferee());
			for (int j=0; j<s.gettempid().length&&!s.gettemprank()[i].equals("0");j++){
				if (!s.gettemprank()[j].equals("0")){
				System.out.println(s.gettempid()[j]+" "+s.gettempname()[j]+" "+s.gettempresult()[j]+" "+s.gettemprank()[j]);
				}
			}
		}
		runGame();
	}

	private void startgame() {
		//start the game
		if (prediction==true){
			if (sportnum == 1){
				Swimming newSwimming = new Swimming(gameid);
				tempGameID = newSwimming.getsID();
				tempreferee = newSwimming.getReferee();
			}
			else if (sportnum == 2){
				Cycling newCycling = new Cycling(gameid);
				tempGameID = newCycling.getsID();
				tempreferee = newCycling.getReferee();
			}
			else {
				Running newRunning = new Running(gameid);
				tempGameID = newRunning.getsID();
				tempreferee = newRunning.getReferee();
			}
			System.out.println("GameID: " + tempGameID);
			System.out.println("Referee: " + tempreferee);
			// display the game ID and referee
			for (int i=0; i<tempid.length; i++){
				if (tempresult[i] !=0){
					temprank[i] = rank(i);
					System.out.println(tempid[i]+" "+ tempname[i] + " "+ tempresult[i]+" Rank: "+temprank[i]);
				}
			}
			//display the results and ranks of this game
			congra(); //send congratulation message
			addpoint1(); //add point for 1st player
			addpoint2(); //add point for 2nd player
			addpoint3(); //add point for 3rd player
			save();
			refresh(); //refresh all the data for next game
		}
		else{
			System.out.println("You need to select a game and predict a winner first!");
			runGame();
		}
	}

	private void save() {
		String[] tre = new String[8];
		String[] tra = new String[8];
		for(int i=0;i<tempresult.length;i++){
			tre[i]=String.valueOf(tempresult[i]);
		}
		for(int i=0;i<temprank.length;i++){
			tra[i]=String.valueOf(temprank[i]);
		}
		History.add(new History(tempGameID,tempreferee,tempid,tempname,tre,tra));
	}
		

	private void congra() {
		//display a congratulation message if the user's prediction is correct
		for (int i = 0; i<tempid.length; i++){
			if (temprank[i]==1){
				if (preID.equals(tempid[i])){
					System.out.println("Congratulations! Your prediction is right!");
				}
			}
		}
	}

	private void addpoint1() {
		//award point for 1st player
		String idid = null;
		for (int i = 0; i<tempid.length; i++){
			if (temprank[i]==1){
				idid = tempid[i];
		for(int j=0;j<Swimmers.size();j++){
			Swimmers a = (Swimmers)Swimmers.get(j);
			if (a.getID().equals(idid)){
				a.setpoint(5);
				}
			}
		for(int j=0;j<Cyclists.size();j++){
			Cyclists s = (Cyclists)Cyclists.get(j);
			if (s.getID().equals(idid)) {
				s.setpoint(5);
				}
			}
		for(int j=0;j<Sprinters.size();j++){
			Sprinters d = (Sprinters)Sprinters.get(j);
			if (d.getID().equals(idid)){
				d.setpoint(5);
				}
			}
		for(int j=0;j<SuperAthletes.size();j++){
			SuperAthletes f = (SuperAthletes)SuperAthletes.get(j);
			if (f.getID().equals(idid)){
				f.setpoint(5);
				}
		}
			}
			}	
	}
	
	private void addpoint2() {
		//award point for 2nd player
		String idid = null;
		for (int i = 0; i<tempid.length; i++){
			if (temprank[i]==2){
				idid = tempid[i];
		for(int j=0;j<Swimmers.size();j++){
			Swimmers a = (Swimmers)Swimmers.get(j);
			if (a.getID().equals(idid)){
				a.setpoint(2);
				}
			}
		for(int j=0;j<Cyclists.size();j++){
			Cyclists s = (Cyclists)Cyclists.get(j);
			if (s.getID().equals(idid)) {
				s.setpoint(2);
				}
			}
		for(int j=0;j<Sprinters.size();j++){
			Sprinters d = (Sprinters)Sprinters.get(j);
			if (d.getID().equals(idid)){
				d.setpoint(2);
				}
			}
		for(int j=0;j<SuperAthletes.size();j++){
			SuperAthletes f = (SuperAthletes)SuperAthletes.get(j);
			if (f.getID().equals(idid)){
				f.setpoint(2);
				}
			}
			}
		}
	}
	
	private void addpoint3() {
		//award point for 3rd player
		String idid = null;
		for (int i = 0; i<tempid.length; i++){
			if (temprank[i]==3){
				idid = tempid[i];
		for(int j=0;j<Swimmers.size();j++){
			Swimmers a = (Swimmers)Swimmers.get(j);
			if (a.getID().equals(idid)){
				a.setpoint(1);
				}
			}
		for(int j=0;j<Cyclists.size();j++){
			Cyclists s = (Cyclists)Cyclists.get(j);
			if (s.getID().equals(idid)) {
				s.setpoint(1);
				}
			}
		for(int j=0;j<Sprinters.size();j++){
			Sprinters d = (Sprinters)Sprinters.get(j);
			if (d.getID().equals(idid)){
				d.setpoint(1);
				}
			}
		for(int j=0;j<SuperAthletes.size();j++){
			SuperAthletes f = (SuperAthletes)SuperAthletes.get(j);
			if (f.getID().equals(idid)){
				f.setpoint(1);
				}
			}
			}
		}
	}

	private void refresh() {
		//refresh all the data for next game
		gameid = gameid +1;
		sportnum = 0;
		start = false;
		prediction = false;
		for (int i=0;i<tempresult.length;i++){
			tempresult[i] = 0;
			temprank[i]=0;
		}
		runGame();
	}

	private int rank(int number) {
		//rank for current game
		int rank = 1;
		for (int i=0; i<tempid.length; i++){
			if (tempresult[number]>tempresult[i] && tempresult[i] != 0){
				rank = rank+1;
			}
		}
		return rank;
	}

	private void predict() {
		//allow the user to predict the winner of that game
		for (int i=0;i<tempresult.length;i++){
			tempresult[i] = 0;
		}
		if (sportnum == 0 || start == false) {
			System.out.println("Please select a game first!");
		}
		else{
			if (sportnum == 1) {
				tempid = Swimming.listplayers();
				do{
				System.out.println("Please enter the ID of the swimmer: ");
				preID = reader.next();
					for(int i = 0;i<tempid.length;i++){
						if (preID.equals(tempid[i])){
							prediction = true;
						}
					}
				}while(prediction == false);
				}
			else if (sportnum == 2){
				tempid = Cycling.listplayers();
				do{
				System.out.println("Please enter the ID of the cyclist: ");
				preID = reader.next();
					for(int i = 0;i<tempid.length;i++){
						if (preID.equals(tempid[i])){
							prediction = true;
						}
					}
				}while(prediction == false);
				}
			else if (sportnum == 3){
				tempid = Running.listplayers();
				do{
				System.out.println("Please enter the ID of the sprinter: ");
				preID = reader.next();
					for(int i = 0;i<tempid.length;i++){
						if (preID.equals(tempid[i])){
							prediction = true;
						}
					}
				}while(prediction == false);
				}
			System.out.println("Your prediction is: "+ preID);
			}
		runGame();
		}

	private void gametype() {
		//select a game to run
		boolean gogo = true;
		List<Swimmers> Swimmers = new Data().getSwimmers();
		List<Cyclists> Cyclists = new Data().getCyclists();
		List<Sprinters> Sprinters = new Data().getSprinters();
		List<SuperAthletes> SAthlete = new Data().getSAthlete();
			AllMenu.gamemenu();
			for (int i=0;i<tempresult.length;i++){
				tempresult[i] = 0;
			}
			do {
		        try {
		            int selection = reader.nextInt();
		            if (selection > 4 || selection < 1) {
		            	System.out.println("Invalid input, please choose again: ");
		            	continue;
		            }
		            switch (selection) {
					case 1:
						sportnum = 1;
						System.out.println("Your choice is: Swimming!");
						Games.check(Swimmers.size(),SAthlete.size());
						break;
					case 2:
						sportnum = 2;
						System.out.println("Your choice is: Cycling!");
						Games.check(Cyclists.size(),SAthlete.size());
						break;
					case 3:
						sportnum = 3;
						System.out.println("Your choice is: Running!");
						Games.check(Sprinters.size(),SAthlete.size());
						break;
					case 4:
						break;
					default:
						System.out.println("Please enter your choice: ");
						break;
					}
		            gogo = false;
		        }
		        catch (Exception e) {
		            System.out.println("Invalid input, please choose again: ");
		            reader.nextLine();		       
		        }
			} while (gogo);
			runGame();
	}
}

