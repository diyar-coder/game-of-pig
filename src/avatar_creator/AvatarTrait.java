package avatar_creator;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

// TODO: Add code in constructor (10 points), next() (10 points), previous() (10 points) and accessors (20 points).
public class AvatarTrait {

	// These are the private instance variables for this class.

	// The name of the trait.
	private String name;

	// The x value where the image of this trait should be drawn.
	private int anchorX;

	// The y value where the image of this trait should be drawn.
	private int anchorY;

	// The array of images that represent this trait.
	private Image[] images;

	// The current image that we want to draw.
	private int index;

	public AvatarTrait(String name, int anchorX, int anchorY, String[] imagePaths) {
		// TODO: Assign values to the private instance variables for name, anchorX, and
		// anchorY by using the parameters given.
		// In the past, the parameter names have been shortened so that we don't have to
		// worry about ambiguity (i.e. name = name - which name is equal to which
		// name?).
		// To solve this problem, we can use the "this" keyword. The "this" keyword will
		// refer to the instance variables while the absence of the word will refer to
		// the variable within the scope.
		// For example, to assign a value to name (instance variable) using name
		// (parameter variable), we can say this.name = name;

		// YOUR CODE BELOW: (10 pts)
		this.name = name;

		this.anchorX = anchorX;

		this.anchorY = anchorY;

		// YOUR CODE ABOVE:

		// Here we assign values to the variables images and index. The Image[] is
		// created and sized based on the given imagePaths parameter. The index tells us
		// which image to draw.
		this.images = new Image[imagePaths.length];
		this.index = 0;
		// And finally, we will use the imagePaths to populate the images array. First,
		// we loop through the images array so that we can assign a value to each index.
		for (int i = 0; i < images.length; i++) {
			try {
				// We use a helper class called ImageIO to help read files and change them into
				// images! The method ImageIO.read() takes in a File as an argument, and we can
				// create a file
				// based on the file paths given to us via the parameter imagePaths.
				images[i] = ImageIO.read(new File(imagePaths[i]));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * This method should increase the index and if the index exceeds the bounds of
	 * our images array, then it should reset back to the beginning.
	 */
	public void next() {
		// TODO: Increase the index and reset it back to the beginning when necessary.

		// YOUR CODE BELOW: (10 pts)
		index = index + 1;
		if (index > images.length - 1) {
			index = 0;
		}

		// YOUR CODE ABOVE:
	}

	/**
	 * This method should decrease the index and if the index exceeds the bounds of
	 * our images array, then it should set the index to the end.
	 */
	public void previous() {
		// TODO: Decrease the index and set it to the end when necessary.

		// YOUR CODE BELOW; (10 pts)
		index = index - 1;
		if (index < 0) {
			index = images.length - 1;
		}
		// YOUR CODE ABOVE:
	}

	// Here we have our accessors. Complete the accessors!

	public String getName() {
		// YOUR CODE BELOW: (5 pts)
		return name;
		// YOUR CODE ABOVE:
	}

	public int getAnchorX() {
		// YOUR CODE BELOW: (5 pts)
		return anchorX;
		// YOUR CODE ABOVE:
	}

	public int getAnchorY() {
		// YOUR CODE BELOW: (5 pts)
		return anchorY;
		// YOUR CODE ABOVE:
	}

	// This accessor is a little bit different! We want to return a single Image
	// from the images array, and to do that, we will need to use our index!
	public Image getCurrentImage() {
		// YOUR CODE BELOW: (5 pts)
		return images[index];

		// YOUR CODE ABOVE:
	}

}