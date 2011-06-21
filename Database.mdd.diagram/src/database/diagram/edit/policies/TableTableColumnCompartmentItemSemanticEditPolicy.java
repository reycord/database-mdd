package database.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import database.diagram.edit.commands.ColumnCreateCommand;
import database.diagram.providers.DatabaseElementTypes;

/**
 * @generated
 */
public class TableTableColumnCompartmentItemSemanticEditPolicy extends
		DatabaseBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public TableTableColumnCompartmentItemSemanticEditPolicy() {
		super(DatabaseElementTypes.Table_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DatabaseElementTypes.Column_3001 == req.getElementType()) {
			return getGEFWrapper(new ColumnCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
