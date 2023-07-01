package frame.menubar.menu;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

import listeneri.MenubarListener;



public class MenuFile extends JMenu {

	private static final long serialVersionUID = 1L;
	
	private JMenuItem noviFajl = null;
	private JMenuItem otvori = null;
	private JMenuItem izlaz = null;
	
	private MenubarListener menubarListener = new MenubarListener();
	
	public MenuFile() {
		
		
		setText("File");
		//setMnemonic('F');
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		noviFajl = new JMenuItem("Novi fajl");
		Image docImage = toolkit.getImage("Ikonice/dokument.png");
		noviFajl.setIcon(new ImageIcon(docImage));
		noviFajl.setActionCommand("novi fajl");
		noviFajl.addActionListener(menubarListener);
		
		
		
		otvori = new JMenuItem("Otvori");
		Image otvoriImage = toolkit.getImage("Ikonice/open.png");
		otvori.setIcon(new ImageIcon(otvoriImage));
		otvori.setActionCommand("otvori");
		otvori.addActionListener(menubarListener);
		

		addSeparator();
		
		izlaz = new JMenuItem("Izlaz");
		Image logoutImage = toolkit.getImage("Ikonice/logout.png");
		izlaz.setIcon(new ImageIcon(logoutImage));
		izlaz.setActionCommand("izlaz");
		izlaz.addActionListener(menubarListener);
		
		
		add(noviFajl);
		add(otvori);
		add(izlaz);
	}

}