package database.diagram.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import database.diagram.providers.DatabaseElementTypes;

/**
 * @generated
 */
public class DatabasePaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createTable1Group());
		paletteRoot.add(createRelationship2Group());
	}

	/**
	 * Creates "Table" palette tool group
	 * @generated
	 */
	private PaletteContainer createTable1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Table1Group_title);
		paletteContainer.setId("createTable1Group"); //$NON-NLS-1$
		paletteContainer.add(createTable1CreationTool());
		paletteContainer.add(createColumn2CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Relationship" palette tool group
	 * @generated
	 */
	private PaletteContainer createRelationship2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Relationship2Group_title);
		paletteContainer.setId("createRelationship2Group"); //$NON-NLS-1$
		paletteContainer.add(createRelation1CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTable1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Table1CreationTool_title,
				Messages.Table1CreationTool_desc,
				Collections.singletonList(DatabaseElementTypes.Table_2001));
		entry.setId("createTable1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DatabaseElementTypes
				.getImageDescriptor(DatabaseElementTypes.Table_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createColumn2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Column2CreationTool_title,
				Messages.Column2CreationTool_desc,
				Collections.singletonList(DatabaseElementTypes.Column_3001));
		entry.setId("createColumn2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DatabaseElementTypes
				.getImageDescriptor(DatabaseElementTypes.Column_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRelation1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Relation1CreationTool_title,
				Messages.Relation1CreationTool_desc,
				Collections.singletonList(DatabaseElementTypes.ForeignKey_4001));
		entry.setId("createRelation1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DatabaseElementTypes
				.getImageDescriptor(DatabaseElementTypes.ForeignKey_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
