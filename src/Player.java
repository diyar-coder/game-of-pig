import java.util.Scanner;

public class Player {

	public int score;
	private String name;

	private int playerTurnScore;

	Scanner keyboard = new Scanner(System.in);

	public Player(String pName) {
		name = pName;
		score = 0;
	}

	public String getPlayerName() {// accessor method for the player name(s)
		return name;

	}

	public int getScore() {// accessor method for the score
		return score;
	}

	public void takeTurn(Die d) {// most of the logic
		System.out.println();
		System.out.println(name + " you currently have " + score + " points.");
		boolean nextTurn = false;

		while (nextTurn == false) {
			String answer = "";
			if (playerTurnScore > 0) {
				System.out.println("You have gotten " + playerTurnScore + " points this turn.");
			}
			while (!answer.toLowerCase().equals("r") && !answer.toLowerCase().equals("h")) {
				System.out.println("Do you want to roll or hold? Choose r to roll, and h to hold ");
				answer = keyboard.nextLine();

			}
			if (answer.equals("r")) {
				int roll = d.roll();
				if (roll != 1) {
					System.out.println("You rolled a " + roll);
					playerTurnScore += roll;
				} else {
					System.out.println("You rolled a PIG");
					playerTurnScore = 0;
					nextTurn = true;
				}
			} else {
				score += playerTurnScore;
				playerTurnScore = 0;
				nextTurn = true;
			}
		}
		System.out.println(name + " you currently have " + score + " points.");

	}

}
