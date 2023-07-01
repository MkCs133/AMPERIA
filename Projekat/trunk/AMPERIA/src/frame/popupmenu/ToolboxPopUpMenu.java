package frame.popupmenu;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JPopupMenu;

import listeneri.PopupMenuListener;

public class ToolboxPopUpMenu extends JPopupMenu {
	
	private static final long serialVersionUID = 1L;

	JCheckBoxMenuItem cbShowToolbox = null;
	
	public ToolboxPopUpMenu() {
		
		PopupMenuListener popupMenuListener = new PopupMenuListener();
		cbShowToolbox = new JCheckBoxMenuItem("Prikazi toolbox");
		cbShowToolbox.setState(true);
		cbShowToolbox.setActionCommand("popupMenuItem");
		cbShowToolbox.addActionListener(popupMenuListener);
		add(cbShowToolbox);
	}

}
