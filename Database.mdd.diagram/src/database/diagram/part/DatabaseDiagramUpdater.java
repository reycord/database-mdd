package database.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

import database.Column;
import database.Database;
import database.DatabasePackage;
import database.ForeignKey;
import database.Table;
import database.diagram.edit.parts.ColumnEditPart;
import database.diagram.edit.parts.DatabaseEditPart;
import database.diagram.edit.parts.ForeignKeyEditPart;
import database.diagram.edit.parts.TableEditPart;
import database.diagram.edit.parts.TableTableColumnCompartmentEditPart;
import database.diagram.providers.DatabaseElementTypes;

/**
 * @generated
 */
public class DatabaseDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<DatabaseNodeDescriptor> getSemanticChildren(View view) {
		switch (DatabaseVisualIDRegistry.getVisualID(view)) {
		case DatabaseEditPart.VISUAL_ID:
			return getDatabase_1000SemanticChildren(view);
		case TableTableColumnCompartmentEditPart.VISUAL_ID:
			return getTableTableColumnCompartment_7001SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DatabaseNodeDescriptor> getDatabase_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Database modelElement = (Database) view.getElement();
		LinkedList<DatabaseNodeDescriptor> result = new LinkedList<DatabaseNodeDescriptor>();
		for (Iterator<?> it = modelElement.getDbTable().iterator(); it
				.hasNext();) {
			Table childElement = (Table) it.next();
			int visualID = DatabaseVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TableEditPart.VISUAL_ID) {
				result.add(new DatabaseNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DatabaseNodeDescriptor> getTableTableColumnCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Table modelElement = (Table) containerView.getElement();
		LinkedList<DatabaseNodeDescriptor> result = new LinkedList<DatabaseNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTableColumn().iterator(); it
				.hasNext();) {
			Column childElement = (Column) it.next();
			int visualID = DatabaseVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ColumnEditPart.VISUAL_ID) {
				result.add(new DatabaseNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DatabaseLinkDescriptor> getContainedLinks(View view) {
		switch (DatabaseVisualIDRegistry.getVisualID(view)) {
		case DatabaseEditPart.VISUAL_ID:
			return getDatabase_1000ContainedLinks(view);
		case TableEditPart.VISUAL_ID:
			return getTable_2001ContainedLinks(view);
		case ColumnEditPart.VISUAL_ID:
			return getColumn_3001ContainedLinks(view);
		case ForeignKeyEditPart.VISUAL_ID:
			return getForeignKey_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DatabaseLinkDescriptor> getIncomingLinks(View view) {
		switch (DatabaseVisualIDRegistry.getVisualID(view)) {
		case TableEditPart.VISUAL_ID:
			return getTable_2001IncomingLinks(view);
		case ColumnEditPart.VISUAL_ID:
			return getColumn_3001IncomingLinks(view);
		case ForeignKeyEditPart.VISUAL_ID:
			return getForeignKey_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DatabaseLinkDescriptor> getOutgoingLinks(View view) {
		switch (DatabaseVisualIDRegistry.getVisualID(view)) {
		case TableEditPart.VISUAL_ID:
			return getTable_2001OutgoingLinks(view);
		case ColumnEditPart.VISUAL_ID:
			return getColumn_3001OutgoingLinks(view);
		case ForeignKeyEditPart.VISUAL_ID:
			return getForeignKey_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DatabaseLinkDescriptor> getDatabase_1000ContainedLinks(
			View view) {
		Database modelElement = (Database) view.getElement();
		LinkedList<DatabaseLinkDescriptor> result = new LinkedList<DatabaseLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_ForeignKey_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DatabaseLinkDescriptor> getTable_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DatabaseLinkDescriptor> getColumn_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DatabaseLinkDescriptor> getForeignKey_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DatabaseLinkDescriptor> getTable_2001IncomingLinks(
			View view) {
		Table modelElement = (Table) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DatabaseLinkDescriptor> result = new LinkedList<DatabaseLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ForeignKey_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DatabaseLinkDescriptor> getColumn_3001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DatabaseLinkDescriptor> getForeignKey_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DatabaseLinkDescriptor> getTable_2001OutgoingLinks(
			View view) {
		Table modelElement = (Table) view.getElement();
		LinkedList<DatabaseLinkDescriptor> result = new LinkedList<DatabaseLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ForeignKey_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DatabaseLinkDescriptor> getColumn_3001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DatabaseLinkDescriptor> getForeignKey_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<DatabaseLinkDescriptor> getContainedTypeModelFacetLinks_ForeignKey_4001(
			Database container) {
		LinkedList<DatabaseLinkDescriptor> result = new LinkedList<DatabaseLinkDescriptor>();
		for (Iterator<?> links = container.getDbFK().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ForeignKey) {
				continue;
			}
			ForeignKey link = (ForeignKey) linkObject;
			if (ForeignKeyEditPart.VISUAL_ID != DatabaseVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Table dst = link.getTargetTable();
			Table src = link.getSourceTable();
			result.add(new DatabaseLinkDescriptor(src, dst, link,
					DatabaseElementTypes.ForeignKey_4001,
					ForeignKeyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DatabaseLinkDescriptor> getIncomingTypeModelFacetLinks_ForeignKey_4001(
			Table target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DatabaseLinkDescriptor> result = new LinkedList<DatabaseLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != DatabasePackage.eINSTANCE
					.getForeignKey_TargetTable()
					|| false == setting.getEObject() instanceof ForeignKey) {
				continue;
			}
			ForeignKey link = (ForeignKey) setting.getEObject();
			if (ForeignKeyEditPart.VISUAL_ID != DatabaseVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Table src = link.getSourceTable();
			result.add(new DatabaseLinkDescriptor(src, target, link,
					DatabaseElementTypes.ForeignKey_4001,
					ForeignKeyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DatabaseLinkDescriptor> getOutgoingTypeModelFacetLinks_ForeignKey_4001(
			Table source) {
		Database container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Database) {
				container = (Database) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<DatabaseLinkDescriptor> result = new LinkedList<DatabaseLinkDescriptor>();
		for (Iterator<?> links = container.getDbFK().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ForeignKey) {
				continue;
			}
			ForeignKey link = (ForeignKey) linkObject;
			if (ForeignKeyEditPart.VISUAL_ID != DatabaseVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Table dst = link.getTargetTable();
			Table src = link.getSourceTable();
			if (src != source) {
				continue;
			}
			result.add(new DatabaseLinkDescriptor(src, dst, link,
					DatabaseElementTypes.ForeignKey_4001,
					ForeignKeyEditPart.VISUAL_ID));
		}
		return result;
	}

}
