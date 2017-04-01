package Game;
import java.util.*;

public class Driver {
	int sportnum = 0;
	static boolean start = false;
	private boolean quit;
	int ss;
	

	
	public void runGame() {
		Scanner reader = new Scanner(System.in);
		int choice;
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
						athletelist();
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
						quit = false;
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
		} while(quit);
	}
			


	private void dispoint() {
		// TODO Auto-generated method stub
		
	}



	private void disresult() {
		// TODO Auto-generated method stub
		
	}



	private void startgame() {
		// TODO Auto-generated method stub
		
	}



	private void athletelist() {
		if (sportnum == 0) {
			System.out.println("Please select a game first!");
			runGame();
		}
		else if (sportnum == 1) {
			if (start = false){
				System.out.println("Please select another game type");
				runGame();
			}
			else{
				Swimming.listplayers();
				System.out.println("Please enter the ID of the Swimmer: ");
			}
			
		}
	}


	private void gametype() {
		Scanner reader = new Scanner(System.in);
		boolean gogo = true;
		List<Swimmers> Swimmers = new Data().getSwimmers();
		List<Cyclists> Cyclists = new Data().getCyclists();
		List<Sprinters> Sprinters = new Data().getSprinters();
		List<SuperAthletes> SAthlete = new Data().getSAthlete();
			AllMenu.gamemenu();
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

