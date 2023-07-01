package frame.tree.renderer;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.TreeCellRenderer;

import frame.popupmenu.ProjectPopupMenu;

public class CustomTreeCellRenderer extends JLabel implements TreeCellRenderer {

	private static final long serialVersionUID = 1L;

	private DefaultTreeCellRenderer defaultTreeCellRenderer = new DefaultTreeCellRenderer();
	private ProjectPopupMenu projectPopupMenu = new ProjectPopupMenu();

	@Override
	public Component getTreeCellRendererComponent(JTree tree, Object value, boolean selected, boolean expanded,
			boolean leaf, int row, boolean hasFocus) {

		setOpaque(true);
		setBackground(defaultTreeCellRenderer.getBackground());
		setForeground(defaultTreeCellRenderer.getForeground());

		String naziv = value.toString();
		setText(naziv);

		if (leaf) {
			Image image = new ImageIcon("Ikonice/diagram.png").getImage();
			setIcon(new ImageIcon(image.getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
			setFont(defaultTreeCellRenderer.getFont());
		} else {
			Image image = new ImageIcon("Ikonice/project.png").getImage();
			setIcon(new ImageIcon(image.getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
			Font font = new Font("Arial", Font.BOLD, 12);
			setFont(font);
		}

		if (selected) {
			setBackground(new Color(200, 200, 200));
			tree.addMouseListener(new MouseAdapter() {
				
				 public void mousePressed(MouseEvent e) {
				        maybeShowPopup(e);
				    }

				    public void mouseReleased(MouseEvent e) {
				        maybeShowPopup(e);
				    }

				    private void maybeShowPopup(MouseEvent e) {
				        if (e.isPopupTrigger()) {
				        	projectPopupMenu.show(e.getComponent(),
				                       e.getX(), e.getY());
				        }
				    }
				});
		}

		setBorder(BorderFactory.createEmptyBorder(3, 5, 3, 5));
		tree.setRowHeight(22);

		return this;
	}

}
