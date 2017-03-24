package Game;
import java.util.*;

public class Driver {
	private static final String title1 = "Ozlympic Game";
	private static final String title2 = "===================================";
	private static final String[] choice = {
			"1. Select a game to run",
			"2. Predict the winner of the game",
			"3. Start the game",
			"4. Display the final results of all games",
			"5. Display the points of all athletes",
			"6. Exit",
			" ",
			"Enter an option: "
			};
	private boolean quit;
	
	public void runGame() {
		Scanner reader = new Scanner(System.in);
		int choice;
		boolean goon = true;
		do{
			menu();
			do {
		        try {
		            choice = reader.nextInt();
		            if (choice > 6 || choice < 1) {
		            	System.out.println("Invalid input, please choose again: ");
		            	continue;
		            }
		            switch (choice) {
					case 1:
						gamelist();
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
		            goon = false;
		        }
		        catch (Exception e) {
		            System.out.println("Invalid input, please choose again: ");
		            reader.nextLine();		       
		        }
			} while (goon);
		} while(quit);
	}
			
	private void menu() {
		System.out.println(title1);
		System.out.println(title2);
		for (int i=0; i<choice.length; i++) {
			System.out.println(choice[i]);
		}
	}
}