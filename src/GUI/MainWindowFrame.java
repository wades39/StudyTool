package GUI;

import javax.swing.*;

/**
 * This class acts as a wrapper for the JFrame class. It will be able to switch between "scenes" to offer a seamless,
 * single-window experience for the user.
 * <p>
 * This class implements the singleton pattern, as for each instance of the program running, there should be one and
 * only one MainWindowFrame.
 */
public class MainWindowFrame extends JFrame {

	/*-----| Private/Instance Variables |-----*/
	private static MainWindowFrame INSTANCE;

	/*-----| Private Methods |-----*/

	/**
	 * Constructs a MainWindowFrame and sets some properties to meet standard expectations of GUI/Windowed applications
	 */
	private MainWindowFrame() {
		super(); // do the default JFrame construction

		this.setTitle("StudyTool");
		// todo - implement a check to see if the current scene has any unsaved changes that the user needs to save
		//  prior to closing. if so, display a popup that will allow the user to perform that save operation.
	}


	/*-----| Public-Facing Methods |-----*/

	/**
	 * @return the singleton instance of the MainWindowFrame
	 */
	public static MainWindowFrame getInstance() {
		if (INSTANCE == null)
			INSTANCE = new MainWindowFrame();
		return INSTANCE;
	}

	/**
	 * Sets the scene being displayed by the MainWindowFrame
	 */
	public void setScene() {
		// todo - implement scenes

		INSTANCE.revalidate();
		INSTANCE.pack();
	}

	/**
	 * Returns the scene currently being displayed by the MainWindowFrame
	 */
	public void getScene() {
		// todo - implement scenes
		// return scene;
	}

	/**
	 * Makes the MainWindowFrame visible to the user
	 */
	public void show() {
		if (!INSTANCE.isShowing())
			INSTANCE.setVisible(true);
	}

	/**
	 * Hides the MainWindowFrame from the user
	 */
	public void hide() {
		if (INSTANCE.isShowing())
			INSTANCE.setVisible(false);
	}
}
