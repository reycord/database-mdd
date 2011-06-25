package ui.db2java.atlplugin.popup.actions;

import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import console.Db2Java.atlplugin.files.Db2Java;

public class Db2JavaAction implements IObjectActionDelegate {

	private Shell shell;
	private ISelection currentSelection;
	
	/**
	 * Constructor for Action1.
	 */
	public Db2JavaAction() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		IStructuredSelection iss = (IStructuredSelection)currentSelection;
		for (Iterator<?> iterator = iss.iterator(); iterator.hasNext();) {
			try {
				Db2Java runner = new Db2Java();
				IFile file = (IFile)iterator.next();
				String inModelPath = file.getFullPath().toString();
				String outModelPath = file.getFullPath().toString();
				outModelPath = outModelPath.replace(".database", ".Java");
				runner.doMyAction(inModelPath, outModelPath);
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}
		MessageDialog.openInformation(
			shell,
			"Db2Java",
			"Do it was executed.");
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		this.currentSelection = selection;
	}

}
