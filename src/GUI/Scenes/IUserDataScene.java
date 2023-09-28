package GUI.Scenes;

/**
 * This interface acts as a flag to indicate whether a scene contains user data that may need to be saved.
 */
public interface IUserDataScene {

	/**
	 * @return 'true' if this scene has unsaved changes. 'false' if there are no unsaved changes.
	 */
	boolean hasUnsavedChanges();
}
