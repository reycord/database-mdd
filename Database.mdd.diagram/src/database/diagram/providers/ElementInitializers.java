package database.diagram.providers;

import database.diagram.part.DatabaseDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = DatabaseDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			DatabaseDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
