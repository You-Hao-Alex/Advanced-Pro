package Game;
/**
 * @date 03.04.2017
 * @author You Hao s3583715
 * @version 1.0
 * @Description AllMenu interface
 */

public class AllMenu {
	
	//Display start menu
	public static void menu() {
		final String title1 = "Ozlympic Game"; //set title1 value
		final String title2 = "==================================="; //set title 2 value
		//use array to save the list of menu
		final String[] choice = {
				"1. Select a game to run",
				"2. Predict the winner of the game",
				"3. Start the game",
				"4. Display the final results of all games",
				"5. Display the points of all athletes",
				"6. Exit",
				" ",
				"Enter an option: "
				};
		System.out.println(title1);//output title1
		System.out.println(title2);//output title2
		//use for to display the list of menu that store in array
		for (int i=0; i<choice.length; i++) {
			System.out.println(choice[i]);
		}
	}
	
	//Display game menu
	public static void gamemenu() {
		System.out.println("1. Swimming;");
		System.out.println("2. Cycling;");
		System.out.println("3. Running;");
		System.out.println("4. Back to previous menu;");
		System.out.println("Enter an option: ");
	}
}
