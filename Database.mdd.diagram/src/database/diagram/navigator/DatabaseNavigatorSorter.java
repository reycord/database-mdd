package database.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import database.diagram.part.DatabaseVisualIDRegistry;

/**
 * @generated
 */
public class DatabaseNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7003;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof DatabaseNavigatorItem) {
			DatabaseNavigatorItem item = (DatabaseNavigatorItem) element;
			return DatabaseVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
