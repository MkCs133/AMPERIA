package frame.tree;

import javax.swing.JTree;

import frame.tree.renderer.CustomTreeCellRenderer;
import model.tree.CustomTreeModel;

public class CustomTree extends JTree {

	private static final long serialVersionUID = 1L;

	public CustomTree(CustomTreeModel customTreeModel) {
		super(customTreeModel);

		setRootVisible(false);
		setShowsRootHandles(true);

		setCellRenderer(new CustomTreeCellRenderer());
		setEditable(true);
	}
}
