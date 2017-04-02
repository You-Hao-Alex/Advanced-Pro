package Game;
import java.util.*;

public class Driver {
	int sportnum = 0;
	int gameid = 1;
	String preID;
	boolean abcd = false;
	static boolean start = false;
	Scanner reader = new Scanner(System.in);
	String tempGameID;
	String tempreferee;
	static String[] tempid = new String[8];
	static String[] tempname = new String[8];
	static int[] tempresult = new int[8];
	
	public void runGame() {
		int choice;
		boolean quit = false;
		boolean go = true;
		do{
			AllMenu.menu();
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
		            System.out.println("Invalid input, please choose again: ");
		            reader.nextLine();		       
		        }
			} while (go);
		} while (quit);
	}
			
	private void dispoint() {
		// TODO Auto-generated method stub
		
	}



	private void disresult() {
		// TODO Auto-generated method stub
		
	}



	private void startgame() {
		if (abcd==true){
			if (sportnum == 1){
				Swimming newSwimming = new Swimming(gameid);
				tempGameID = newSwimming.getsID();
				tempreferee = newSwimming.getReferee();
				System.out.println("GameID: " + tempGameID);
				System.out.println("Referee: " + tempreferee);
			}
			else if (sportnum == 2){
				Cycling newCycling = new Cycling(gameid);
				tempGameID = newCycling.getsID();
				tempreferee = newCycling.getReferee();
				System.out.println("GameID: " + tempGameID);
				System.out.println("Referee: " + tempreferee);
			}
			else {
				Running newRunning = new Running(gameid);
				tempGameID = newRunning.getsID();
				tempreferee = newRunning.getReferee();
				System.out.println("GameID: " + tempGameID);
				System.out.println("Referee: " + tempreferee);
			}
			for (int i=0; i<tempid.length; i++){
				if (tempresult[i] !=0){
				System.out.println(tempid[i]+" "+ tempname[i] + " "+ tempresult[i]);
				System.out.println(tempGameID+tempreferee);
				tempresult[i] = 0;
				}
			}
			gameid = gameid +1;
			sportnum = 0;
			start = false;
			abcd = false;
			runGame();
		}
		else{
			System.out.println("You need to select a game and predict a winner first!");
			runGame();
		}
	}



	private void predict() {
		if (sportnum == 0 || start == false) {
			System.out.println("Please select a game first!");
			runGame();
		}
		else if (sportnum == 1) {
			tempid = Swimming.listplayers();
			do{
			System.out.println("Please enter the ID of the swimmer: ");
			preID = reader.next();
				for(int i = 0;i<tempid.length;i++){
					if (preID.equals(tempid[i])){
						abcd = true;
					}
				}
			}while(abcd == false);
			System.out.println("Your prediction is: "+ preID);
			runGame();
			}	
		else if (sportnum == 2){
			tempid = Cycling.listplayers();
			do{
			System.out.println("Please enter the ID of the cyclist: ");
			preID = reader.next();
				for(int i = 0;i<tempid.length;i++){
					if (preID.equals(tempid[i])){
						abcd = true;
					}
				}
			}while(abcd == false);
			System.out.println("Your prediction is: "+ preID);
			runGame();
			}	
		else if (sportnum == 3){
			tempid = Running.listplayers();
			do{
			System.out.println("Please enter the ID of the sprinter: ");
			preID = reader.next();
				for(int i = 0;i<tempid.length;i++){
					if (preID.equals(tempid[i])){
						abcd = true;
					}
				}
			}while(abcd == false);
			System.out.println("Your prediction is: "+ preID);
			runGame();
			}	
	}


	private void gametype() {
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

