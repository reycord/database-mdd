package database.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import database.diagram.providers.DatabaseElementTypes;

/**
 * @generated
 */
public class ForeignKeyItemSemanticEditPolicy extends
		DatabaseBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ForeignKeyItemSemanticEditPolicy() {
		super(DatabaseElementTypes.ForeignKey_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
