package frame.panels;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JPanel;

import frame.popupmenu.WorkSpacePopupMenu;
import frame.workspace.RadnaPovrsina;

public class RadnaPovrsinaPanel extends JPanel{


	private static final long serialVersionUID = 1L;
	private WorkSpacePopupMenu workSpacePopupMenu = new WorkSpacePopupMenu();
	public RadnaPovrsinaPanel() {
		
		setLayout(new BorderLayout());
		add(new RadnaPovrsina());
		setComponentPopupMenu(workSpacePopupMenu);
	}
}
