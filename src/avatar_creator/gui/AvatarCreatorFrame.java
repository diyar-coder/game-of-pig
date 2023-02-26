package avatar_creator.gui;

import java.awt.Container;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JFrame;

import avatar_creator.AvatarTrait;

// TODO: Add code in add() (10 points)
public class AvatarCreatorFrame extends JFrame {

	// These are constants representing how big our GUI should be.
	public static final int FRAME_WIDTH = 750;

	public static final int FRAME_HEIGHT = 800;

	// These are private instance variables! We have an instance variable for the
	// AvatarCreatorCanvas and the AvatarCreatorSelection!
	private AvatarCreatorCanvas canvas;

	private AvatarCreatorSelection selection;

	// This is the list of all the customizable options we have!
	private List<AvatarTrait> avatarTraits = new ArrayList<AvatarTrait>();

	// The constructor for this class sets up the GUI.
	public AvatarCreatorFrame() {
		// We instantiate and assign values to our private instance variables. Note that
		// the AvatarCreatorCanvas class takes in a List of AvatarTraits as an argument!
		canvas = new AvatarCreatorCanvas(avatarTraits);
		selection = new AvatarCreatorSelection();

		// Here we set up the layout of the GUI and add our canvas and selection menu to
		// the GUI.
		Container panel = this.getContentPane();
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		panel.add(canvas);
		panel.add(selection);

		this.setPreferredSize(new Dimension(FRAME_WIDTH, FRAME_HEIGHT));
	}

	// This method adds an AvatarTrait to our list of AvatarTraits! Try it yourself
	// by using the List.add() method!
	public void add(AvatarTrait avatarTrait) {
		// TODO: Add an element to the list of AvatarTraits! (Hint: use List.add())

		// YOUR CODE BELOW: (10 pts)

		avatarTraits.add(avatarTrait);

		// YOUR CODE ABOVE:

		// Here, we also add an AvatarTrait to the selection menu. This is not adding to
		// a list, however, it's creating the buttons in the selection menu! Check out
		// the AvatarCreatorSelection class for more details. Notice that we use "this"
		// as a variable - remember that "this" refers to the instance of this class
		// (it's an object)!
		selection.add(avatarTrait, this);
	}

}