package avatar_creator.gui;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import avatar_creator.AvatarTrait;

// TODO: Add code for actionPerformed() in each button (20 points)
public class AvatarCreatorSelection extends JPanel {

	// These are the constant variables for the width and height of the selection
	// menu.
	// The width is just the width of the frame minus the width of the canvas, and
	// the height is the height of the frame.
	public static final int SELECTION_WIDTH = AvatarCreatorFrame.FRAME_WIDTH - AvatarCreatorCanvas.CANVAS_WIDTH;

	public static final int SELECTION_HEIGHT = AvatarCreatorFrame.FRAME_HEIGHT;

	// The constructor for this class sets up the layout for the selection menu.
	public AvatarCreatorSelection() {
		this.setPreferredSize(new Dimension(SELECTION_WIDTH, SELECTION_HEIGHT));
		this.setLayout(new GridLayout(0, 3));
	}

	// Here is where we add buttons to the selection menu! This method takes in 2
	// arguments: the customizable AvatarTrait, and the JFrame that holds the canvas
	// and selection menu!
	public void add(AvatarTrait avatarTrait, JFrame frame) {
		// Here we create a button for moving to the previous selection for the given
		// AvatarTrait. It's represented by a "<" to show that we are changing to the
		// previous selection.
		// You can change what appears in the arrow if you wish!
		JButton left = new JButton("<");
		// And this is the button to move to the next selection!
		JButton right = new JButton(">");
		// These buttons are useless without what's called an ActionListener. The
		// ActionListener is what allows a button to have some kind of functionality!
		// Otherwise, you would just
		// click on the button and nothing would happen. The method
		// JButton.addActionListener() takes in an ActionListener object as an argument.
		// Here, we've made an anonymous object - an instance
		// that doesn't have a name!
		left.addActionListener(new ActionListener() {

			// This is the method that will be called each time the button is pressed.
			// Notice that we are adding an ActionListener to the left button!
			@Override
			public void actionPerformed(ActionEvent e) {
				// Since this is the left button, we should change the current selection of the
				// AvatarTrait to the previous one!
				// TODO: Call the previous() method from the given AvatarTrait parameter!

				// YOUR CODE BELOW: (10 pts)

				avatarTrait.previous();

				// YOUR CODE ABOVE:

				// After we change our selection, we will want to repaint our canvas!
				frame.repaint();
			}

		});
		right.addActionListener(new ActionListener() {

			// Now this ActionListener is for the right button! Let's add some code so that
			// our AvatarTrait will move to the next selection.
			@Override
			public void actionPerformed(ActionEvent e) {
				// YOUR CODE BELOW: (10 pts)

				avatarTrait.next();

				// YOUR CODE ABOVE:
				frame.repaint();
			}

		});
		// And finally, once we've made our buttons and given them some functionality,
		// we can add them to our selection menu (this).
		this.add(left);
		// Also, let's add a label so that we know what the buttons are supposed to
		// change!
		this.add(new JLabel(avatarTrait.getName(), JLabel.CENTER));
		this.add(right);

	}

}