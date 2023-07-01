package model.tree;

import javax.swing.tree.DefaultMutableTreeNode;

import frame.popupmenu.ProjectPopupMenu;

public class CustomTreeModel extends DefaultMutableTreeNode {

	private static final long serialVersionUID = 1L;
	
	ProjectPopupMenu projectPopupMenu = new ProjectPopupMenu();

	public CustomTreeModel() {
		super("Root");

		DefaultMutableTreeNode project1 = new DefaultMutableTreeNode("Projekat1");
		add(project1);
		

		DefaultMutableTreeNode dijagram11 = new DefaultMutableTreeNode("Diagram 1");
		DefaultMutableTreeNode dijagram12 = new DefaultMutableTreeNode("Diagram 2");
		DefaultMutableTreeNode dijagram13 = new DefaultMutableTreeNode("Diagram 3");

		project1.add(dijagram11);
		project1.add(dijagram12);
		project1.add(dijagram13);
		

		DefaultMutableTreeNode project2 = new DefaultMutableTreeNode("Projekat2");
		add(project2);

		DefaultMutableTreeNode dijagram21 = new DefaultMutableTreeNode("Diagram 1");
		DefaultMutableTreeNode dijagram22 = new DefaultMutableTreeNode("Diagram 2");

		project2.add(dijagram21);
		project2.add(dijagram22);

		DefaultMutableTreeNode project3 = new DefaultMutableTreeNode("Projekat3");
		add(project3);

		DefaultMutableTreeNode dijagram31 = new DefaultMutableTreeNode("Diagram 1");
		DefaultMutableTreeNode dijagram32 = new DefaultMutableTreeNode("Diagram 2");
		DefaultMutableTreeNode dijagram33 = new DefaultMutableTreeNode("Diagram 3");

		project3.add(dijagram31);
		project3.add(dijagram32);
		project3.add(dijagram33);

	}
}
