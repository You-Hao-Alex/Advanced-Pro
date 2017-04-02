package Game;

public class AllMenu {
	public static void menu() {
		final String title1 = "Ozlympic Game";
		final String title2 = "===================================";
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
		System.out.println(title1);
		System.out.println(title2);
		for (int i=0; i<choice.length; i++) {
			System.out.println(choice[i]);
		}
	}
	public static void gamemenu() {
		System.out.println("1. Swimming;");
		System.out.println("2. Cycling;");
		System.out.println("3. Running;");
		System.out.println("4. Back to previous menu;");
		System.out.println("Enter an option: ");
	}
}
