package database.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import database.DatabasePackage;
import database.diagram.edit.parts.ColumnEditPart;
import database.diagram.edit.parts.TableNameEditPart;
import database.diagram.parsers.MessageFormatParser;
import database.diagram.part.DatabaseVisualIDRegistry;

/**
 * @generated
 */
public class DatabaseParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser tableName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getTableName_5001Parser() {
		if (tableName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { DatabasePackage.eINSTANCE
					.getTable_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			tableName_5001Parser = parser;
		}
		return tableName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser column_3001Parser;

	/**
	 * @generated
	 */
	private IParser getColumn_3001Parser() {
		if (column_3001Parser == null) {
			EAttribute[] features = new EAttribute[] { DatabasePackage.eINSTANCE
					.getColumn_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			column_3001Parser = parser;
		}
		return column_3001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case TableNameEditPart.VISUAL_ID:
			return getTableName_5001Parser();
		case ColumnEditPart.VISUAL_ID:
			return getColumn_3001Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(DatabaseVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(DatabaseVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (DatabaseElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
