import java.util.Random;

public class Die {
	private int numFaces;

	public Die() {
		numFaces = 6;
	}

	public Die(int numFaces) {
		this.numFaces = numFaces;
	}

	public int roll() {
		Random random = new Random();
		return (random.nextInt(numFaces) + 1);

	}
}
