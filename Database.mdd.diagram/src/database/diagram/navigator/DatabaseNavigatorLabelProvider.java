package database.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import database.diagram.edit.parts.ColumnEditPart;
import database.diagram.edit.parts.DatabaseEditPart;
import database.diagram.edit.parts.ForeignKeyEditPart;
import database.diagram.edit.parts.TableEditPart;
import database.diagram.edit.parts.TableNameEditPart;
import database.diagram.part.DatabaseDiagramEditorPlugin;
import database.diagram.part.DatabaseVisualIDRegistry;
import database.diagram.providers.DatabaseElementTypes;
import database.diagram.providers.DatabaseParserProvider;

/**
 * @generated
 */
public class DatabaseNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		DatabaseDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		DatabaseDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof DatabaseNavigatorItem
				&& !isOwnView(((DatabaseNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof DatabaseNavigatorGroup) {
			DatabaseNavigatorGroup group = (DatabaseNavigatorGroup) element;
			return DatabaseDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof DatabaseNavigatorItem) {
			DatabaseNavigatorItem navigatorItem = (DatabaseNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (DatabaseVisualIDRegistry.getVisualID(view)) {
		case DatabaseEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://database/1.0?Database", DatabaseElementTypes.Database_1000); //$NON-NLS-1$
		case TableEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://database/1.0?Table", DatabaseElementTypes.Table_2001); //$NON-NLS-1$
		case ForeignKeyEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://database/1.0?ForeignKey", DatabaseElementTypes.ForeignKey_4001); //$NON-NLS-1$
		case ColumnEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://database/1.0?Column", DatabaseElementTypes.Column_3001); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = DatabaseDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& DatabaseElementTypes.isKnownElementType(elementType)) {
			image = DatabaseElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof DatabaseNavigatorGroup) {
			DatabaseNavigatorGroup group = (DatabaseNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof DatabaseNavigatorItem) {
			DatabaseNavigatorItem navigatorItem = (DatabaseNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (DatabaseVisualIDRegistry.getVisualID(view)) {
		case DatabaseEditPart.VISUAL_ID:
			return getDatabase_1000Text(view);
		case TableEditPart.VISUAL_ID:
			return getTable_2001Text(view);
		case ForeignKeyEditPart.VISUAL_ID:
			return getForeignKey_4001Text(view);
		case ColumnEditPart.VISUAL_ID:
			return getColumn_3001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getDatabase_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getTable_2001Text(View view) {
		IParser parser = DatabaseParserProvider.getParser(
				DatabaseElementTypes.Table_2001,
				view.getElement() != null ? view.getElement() : view,
				DatabaseVisualIDRegistry.getType(TableNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DatabaseDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getForeignKey_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getColumn_3001Text(View view) {
		IParser parser = DatabaseParserProvider.getParser(
				DatabaseElementTypes.Column_3001,
				view.getElement() != null ? view.getElement() : view,
				DatabaseVisualIDRegistry.getType(ColumnEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DatabaseDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 3001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return DatabaseEditPart.MODEL_ID.equals(DatabaseVisualIDRegistry
				.getModelID(view));
	}

}
