import java.util.Scanner;

public class PigGame {
	private Player player1;
	private Player player2;
	private Die die;
	private int goal;

	public PigGame(int goalPoints) {
		this.goal = goalPoints;
		die = new Die();// Calling the method, assigning number of faces to die. the die has six sides

		Scanner keyboard = new Scanner(System.in);

		// initializing player 1
		System.out.println("What is Player 1's name?");
		String name1 = keyboard.nextLine();
		player1 = new Player(name1);// name for Player 1

		// initializing player 2
		System.out.println("What is Player 2's name?");
		String name2 = keyboard.nextLine();
		player2 = new Player(name2);// name for Player 2

	}

	public void play() {

		while (player1.score < goal && player2.score < goal) {
			player1.takeTurn(die);
			if (player1.score < goal && player2.score < goal) {
				player2.takeTurn(die);
			}
		}
		if (player1.score >= goal) {
			System.out.println(player1.getPlayerName() + " wins!");
		} else {
			System.out.println(player2.getPlayerName() + " wins!");
		}
	}

	public void printInstructions() {

		System.out.println("Let's play the Game of PIG!");
		System.out.println("The rules are simple.");
		System.out.println("Two players roll dice and try to reach a certain number of goal points first.");
		System.out.println(
				"Each player rolls a die until they either decide to 'hold', adding the total of the die rolls to their score, or a 1 is rolled - ending their turn and adding zero points to their total.");
		System.out.println(
				"Note: rolling a 1 does not cause the player to lose already accumulated points, only that turns points.");

	}

}
