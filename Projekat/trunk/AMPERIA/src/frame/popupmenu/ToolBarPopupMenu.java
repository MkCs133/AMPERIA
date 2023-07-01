package frame.popupmenu;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JPopupMenu;

import listeneri.PopupMenuListener;

public class ToolBarPopupMenu extends JPopupMenu {

	private static final long serialVersionUID = 1L;

	JCheckBoxMenuItem cbShowToolbar = null;
	
	public ToolBarPopupMenu() {
		
		PopupMenuListener popupMenuListener = new PopupMenuListener();
		
		cbShowToolbar = new JCheckBoxMenuItem("Prikazi paletu sa alatima");
		cbShowToolbar.setState(true);
		cbShowToolbar.setActionCommand("popumMenuItem");
		cbShowToolbar.addActionListener(popupMenuListener);

		add(cbShowToolbar);

	}
}
