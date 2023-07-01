package frame.toolbars;

import java.awt.Color;

import javax.swing.JToolBar;

public class Toolbar extends JToolBar {

	private static final long serialVersionUID = 1L;

	public Toolbar() {
		setRollover(true);
		setBorderPainted(true);
		setFloatable(true);
		
		
		add(new BasicToolbar());
		addSeparator();
		add(new EditToolbar());
		addSeparator();
		add(new SimulacijaToolbar());
		
	}
}
