package frame.panels;

import java.awt.FlowLayout;

import javax.swing.JPanel;

import frame.popupmenu.ToolBarPopupMenu;
import frame.toolbars.BasicToolbar;
import frame.toolbars.EditToolbar;
import frame.toolbars.SimulacijaToolbar;

public class ToolbarPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private ToolBarPopupMenu toolBarPopupMenu = new ToolBarPopupMenu();

	public ToolbarPanel() {
		setLayout(new FlowLayout(FlowLayout.LEFT));
		setComponentPopupMenu(toolBarPopupMenu);
		add(new BasicToolbar());
		add(new EditToolbar());
		add(new SimulacijaToolbar());

	}

}
