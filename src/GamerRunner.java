import java.util.Scanner;

public class GamerRunner {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("How many many points do you need to win?");
		int points = keyboard.nextInt();

		// keyboard.close();

		PigGame game = new PigGame(points);
		game.play();
	}

}
