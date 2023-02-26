package avatar_creator.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.List;

import javax.swing.JPanel;

import avatar_creator.AvatarTrait;

public class AvatarCreatorCanvas extends JPanel {

	// These are constants for the dimensions of the canvas. We've set the width of
	// this canvas to be 60% of the entire frame and the height to be the same as
	// the frame.
	public static final int CANVAS_WIDTH = (int) (AvatarCreatorFrame.FRAME_WIDTH * 0.6);

	public static final int CANVAS_HEIGHT = AvatarCreatorFrame.FRAME_HEIGHT;

	// This is a List! A List is like an array but with more functionality! You can
	// add and remove things from a List, and the size of the List can be expanded
	// (unlike an array).
	private List<AvatarTrait> avatarTraits;

	// The constructor for this class takes in a List of AvatarTraits as an
	// argument. This List will be used so that the canvas can draw pictures to our
	// GUI!
	public AvatarCreatorCanvas(List<AvatarTrait> avatarTraits) {
		this.avatarTraits = avatarTraits;
		this.setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));
	}

	// The paint method comes from a class called JPanel. We can borrow this method
	// and create our own functionality through a concept called overriding. The
	// paint method
	// takes in a Graphics object as an argument and uses this to draw things to our
	// GUI. (Type g. and see what options are available!)
	@Override
	public void paint(Graphics g) {
		// Here we set the color of what we want to draw to white.
		g.setColor(Color.WHITE);
		// This way, I can draw (and fill) a white rectangle to be our background.
		g.fillRect(0, 0, CANVAS_WIDTH, CANVAS_HEIGHT);
		// This is a for-each loop. This can be read as "For each AvatarTrait in
		// avatarTraits, do the following:". A for-each loop allows us to go through
		// each element in
		// a collection (in this case our List of AvatarTraits) and perform an action
		// using each element!
		for (AvatarTrait avatarTrait : avatarTraits) {
			// So, for each AvatarTrait in avatarTraits, we are going to draw it to our GUI!
			// We will draw the current image of the AvatarTrait at the x and y coordinators
			// of the anchor.
			g.drawImage(avatarTrait.getCurrentImage(), avatarTrait.getAnchorX(), avatarTrait.getAnchorY(), null);
		}
		g.setColor(Color.BLACK);
		g.drawString("Diya Rautela", 20, 20);
	}

}