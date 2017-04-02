package Game;
import java.util.*;

public class Driver {
	int sportnum = 0;
	int gameid = 1;
	String preID;
	boolean prediction = false;
	static boolean start = false;
	Scanner reader = new Scanner(System.in);
	String tempGameID;
	String tempreferee;
	static String[] tempid = new String[8];
	static String[] tempname = new String[8];
	static int[] tempresult = new int[8];
	static int[] temprank = new int[8];
	static ArrayList Swimmers = (ArrayList)new Data().getSwimmers();
	static ArrayList Cyclists = (ArrayList)new Data().getCyclists();
	static ArrayList Sprinters = (ArrayList)new Data().getSprinters();
	static ArrayList SuperAthletes = (ArrayList)new Data().getSAthlete();
	
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
		for(int i=0;i<Swimmers.size();i++){
			Swimmers s = (Swimmers)Swimmers.get(i);
			s.SwimmersInfo();
		}
		for(int i=0;i<Cyclists.size();i++){
			Cyclists s = (Cyclists)Cyclists.get(i);
			s.CyclistsInfo();
		}
		for(int i=0;i<Sprinters.size();i++){
			Sprinters s = (Sprinters)Sprinters.get(i);
			s.SprintersInfo();
		}
		for(int i=0;i<SuperAthletes.size();i++){
			SuperAthletes s = (SuperAthletes)SuperAthletes.get(i);
			s.SuperAthletesInfo();
		}
		runGame();
	}



	private void disresult() {
		// TODO Auto-generated method stub
		
	}



	private void startgame() {
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
			for (int i=0; i<tempid.length; i++){
				if (tempresult[i] !=0){
					temprank[i] = rank(i);
					System.out.println(tempid[i]+" "+ tempname[i] + " "+ tempresult[i]+" Rank: "+temprank[i]);
				}
			}
			congra();
			addpoint1();
			addpoint2();
			addpoint3();
			refresh();
		}
		else{
			System.out.println("You need to select a game and predict a winner first!");
			runGame();
		}
	}



	private void congra() {
		for (int i = 0; i<tempid.length; i++){
			if (temprank[i]==1){
				if (preID.equals(tempid[i])){
					System.out.println("Congratulations! Your prediction is right!");
				}
			}
		}
		
	}

	private void addpoint1() {
		String idid = null;
		for (int i = 0; i<tempid.length; i++){
			if (temprank[i]==1){
				idid = tempid[i];
			}
		}
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
	
	private void addpoint2() {
		String idid = null;
		for (int i = 0; i<tempid.length; i++){
			if (temprank[i]==2){
				idid = tempid[i];
			}
		}
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
	
	private void addpoint3() {
		String idid = null;
		for (int i = 0; i<tempid.length; i++){
			if (temprank[i]==3){
				idid = tempid[i];
			}
		}
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

	private void refresh() {
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
		int rank = 1;
		for (int i=0; i<tempid.length; i++){
			if (tempresult[number]>tempresult[i] && tempresult[i] != 0){
				rank = rank+1;
			}
		}
		return rank;
	}

	private void predict() {
		for (int i=0;i<tempresult.length;i++){
			tempresult[i] = 0;
		}
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
						prediction = true;
					}
				}
			}while(prediction == false);
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
						prediction = true;
					}
				}
			}while(prediction == false);
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
						prediction = true;
					}
				}
			}while(prediction == false);
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

