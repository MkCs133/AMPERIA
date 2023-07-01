package frame.menubar.menu;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import listeneri.MenubarListener;

public class MenuPodesavanjaRadnePovrsine extends JMenu{

	private static final long serialVersionUID = 1L;
	
	private JMenuItem menuItemPostavljanjeMreze = null;
	private JMenuItem menuItemPromjenaBoje = null;
	private JMenuItem menuItemPromjenaSkalabilnosti = null;
	
	private MenubarListener menubarListener = new MenubarListener();
	
public MenuPodesavanjaRadnePovrsine() {
		
		setText("Podešavanja radne povrsine");
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		menuItemPostavljanjeMreze = new JMenuItem("Postavi mrezu");
		Image mrezaImage = toolkit.getImage("Ikonice/mreza.png");
		menuItemPostavljanjeMreze.setIcon(new ImageIcon(mrezaImage));
		menuItemPostavljanjeMreze.setActionCommand("postavljanje mreze");
		menuItemPostavljanjeMreze.addActionListener(menubarListener);
		
		menuItemPromjenaBoje = new JMenuItem("Promijeni boju");
		Image paletaImage = toolkit.getImage("Ikonice/paint.png");
		menuItemPromjenaBoje.setIcon(new ImageIcon(paletaImage));
		menuItemPromjenaBoje.setActionCommand("promijeni boju");
		menuItemPromjenaBoje.addActionListener(menubarListener);
		
		menuItemPromjenaSkalabilnosti = new JMenuItem("Promijeni skalabilnost");
		Image skalabilnostImage = toolkit.getImage("Ikonice/skalabilnost.png");
		menuItemPromjenaSkalabilnosti.setIcon(new ImageIcon(skalabilnostImage));
		menuItemPromjenaSkalabilnosti.setActionCommand("promijeni skalabilnost");
		menuItemPromjenaSkalabilnosti.addActionListener(menubarListener);
		
		add(menuItemPostavljanjeMreze);
		add(menuItemPromjenaBoje);
		add(menuItemPromjenaSkalabilnosti);
		
	}
	
}