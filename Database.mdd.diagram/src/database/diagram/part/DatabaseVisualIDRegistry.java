package database.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

import database.Database;
import database.DatabasePackage;
import database.diagram.edit.parts.ColumnEditPart;
import database.diagram.edit.parts.DatabaseEditPart;
import database.diagram.edit.parts.ForeignKeyEditPart;
import database.diagram.edit.parts.TableEditPart;
import database.diagram.edit.parts.TableNameEditPart;
import database.diagram.edit.parts.TableTableColumnCompartmentEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class DatabaseVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "Database.mdd.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (DatabaseEditPart.MODEL_ID.equals(view.getType())) {
				return DatabaseEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return database.diagram.part.DatabaseVisualIDRegistry.getVisualID(view
				.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				DatabaseDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (DatabasePackage.eINSTANCE.getDatabase().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((Database) domainElement)) {
			return DatabaseEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = database.diagram.part.DatabaseVisualIDRegistry
				.getModelID(containerView);
		if (!DatabaseEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (DatabaseEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = database.diagram.part.DatabaseVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = DatabaseEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case DatabaseEditPart.VISUAL_ID:
			if (DatabasePackage.eINSTANCE.getTable().isSuperTypeOf(
					domainElement.eClass())) {
				return TableEditPart.VISUAL_ID;
			}
			break;
		case TableTableColumnCompartmentEditPart.VISUAL_ID:
			if (DatabasePackage.eINSTANCE.getColumn().isSuperTypeOf(
					domainElement.eClass())) {
				return ColumnEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = database.diagram.part.DatabaseVisualIDRegistry
				.getModelID(containerView);
		if (!DatabaseEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (DatabaseEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = database.diagram.part.DatabaseVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = DatabaseEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case DatabaseEditPart.VISUAL_ID:
			if (TableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TableEditPart.VISUAL_ID:
			if (TableNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TableTableColumnCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TableTableColumnCompartmentEditPart.VISUAL_ID:
			if (ColumnEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (DatabasePackage.eINSTANCE.getForeignKey().isSuperTypeOf(
				domainElement.eClass())) {
			return ForeignKeyEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(Database element) {
		return true;
	}

}
