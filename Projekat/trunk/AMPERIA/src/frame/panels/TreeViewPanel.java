package frame.panels;

import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import frame.tree.CustomTree;
import model.tree.CustomTreeModel;

public class TreeViewPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private CustomTreeModel customTreeModel;

	public TreeViewPanel() {
		setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));

		customTreeModel = new CustomTreeModel();
		CustomTree tree = new CustomTree(customTreeModel);

		JScrollPane scrollPane = new JScrollPane(tree);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setPreferredSize(new Dimension(180, 0));

		add(scrollPane);
	}
}
