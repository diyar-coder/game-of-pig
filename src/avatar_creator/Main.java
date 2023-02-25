package avatar_creator;

import avatar_creator.gui.AvatarCreatorFrame;

// TODO: Add code in main method (20 points)
public class Main {

	public static void main(String[] args) {
		// This creates an AvatarCreatorFrame object. This is used to display the GUI
		// (Graphical User Interface) for this program.
		AvatarCreatorFrame avatarCreator = new AvatarCreatorFrame();

		// TODO: Add your different customization options here! AvatarCreatorFrame has a
		// method called add() which takes an AvatarTrait as an argument.
		// An AvatarTrait can be instantiated with 4 arguments: the name of the trait,
		// the x coordinate of the anchor point, the y coordinate of the anchor point
		// and a list of file paths for each image you want to use for this trait.
		// Usage: avatarCreator.add(new AvatarTrait(String name, int anchorX, int
		// anchorY, String[] filePaths)

		// YOUR CODE BELOW: (20 pts)
		String[] shirts = new String[5];
		shirts[0] = "./pictures/catShirt.jpeg";
		shirts[1] = "./pictures/dogShirt.jpeg";
		shirts[2] = "./pictures/llamaShirt.jpeg";
		shirts[3] = "./pictures/potatoShirt.jpeg";
		shirts[4] = "./pictures/shirt1.jpeg";
		avatarCreator.add(new AvatarTrait("Shirts", 120, 13, shirts));

		String[] pants = new String[5];
		pants[0] = "./pictures/dogPants.jpeg";
		pants[1] = "./pictures/GingerbreadPants.jpeg";
		pants[2] = "./pictures/cartoonPants.jpeg";
		pants[3] = "./pictures/jeans.jpeg";
		pants[4] = "./pictures/dunkinDonutPants.jpeg";
		avatarCreator.add(new AvatarTrait("Pants", 125, 250, pants));

		String[] shoes = new String[4];
		shoes[0] = "./pictures/rainbowHeels.jpeg";
		shoes[1] = "./pictures/sneakersMens.jpeg";
		shoes[2] = "./pictures/whiteShoes.jpeg";
		shoes[3] = "./pictures/yellowCrocs.jpeg";
		avatarCreator.add(new AvatarTrait("Shoes", 130, 500, shoes));

		// YOUR CODE ABOVE:

		// AvatarCreatorFrame extends a class called JFrame. This lets the
		// AvatarCreatorFrame object use methods from the JFrame class.
		// JFrame.pack() makes sure that all components of the GUI are sized properly.
		avatarCreator.pack();
		// JFrame.setVisible(boolean) lets you toggle the visibility of the GUI.
		avatarCreator.setVisible(true);
	}
}