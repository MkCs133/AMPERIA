package frame.menubar;

import javax.swing.JMenuBar;

import frame.menubar.menu.MenuFile;
import frame.menubar.menu.MenuKorisnickiNalog;
import frame.menubar.menu.MenuPodesavanjaRadnePovrsine;
import frame.menubar.menu.MenuPomoc;
import frame.menubar.menu.MenuSimulacija;

public class CustomMenuBar extends JMenuBar {

	private static final long serialVersionUID = 1l;
	
	public CustomMenuBar() {
		
			add(new MenuFile());
			add(new MenuSimulacija());
			add(new MenuPodesavanjaRadnePovrsine());
			add(new MenuKorisnickiNalog());
			add(new MenuPomoc());
			add(new MenuSimulacija());
			
	}
}
