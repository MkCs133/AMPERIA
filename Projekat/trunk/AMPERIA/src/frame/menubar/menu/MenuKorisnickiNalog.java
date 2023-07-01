package frame.menubar.menu;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import listeneri.MenubarListener;

public class MenuKorisnickiNalog extends JMenu{

	private static final long serialVersionUID = 1L;
	
	private JMenuItem menuItemRegistracija = null;
	private JMenuItem menuItemPrijava = null;
	private JMenuItem menuItemPromjenaLozinke = null;
	private JMenuItem menuItemOdjava = null;
	
	private MenubarListener menubarListener = new MenubarListener();
	
public MenuKorisnickiNalog() {
		
		setText("Korisnicki nalog");
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		menuItemRegistracija = new JMenuItem("Registracija");
		Image regImage = toolkit.getImage("Ikonice/registration.png");
		menuItemRegistracija.setIcon(new ImageIcon(regImage));
		menuItemRegistracija.setActionCommand("registracija korisnika");
		menuItemRegistracija.addActionListener(menubarListener);
		
		menuItemPrijava = new JMenuItem("Prijava");
		Image loginImage = toolkit.getImage("Ikonice/login.png");
		menuItemPrijava.setIcon(new ImageIcon(loginImage));
		menuItemPrijava.setActionCommand("prijava korisnika");
		menuItemPrijava.addActionListener(menubarListener);
		
		menuItemPromjenaLozinke = new JMenuItem("Nova lozinka");
		Image npImage = toolkit.getImage("Ikonice/newPassword.png");
		menuItemPromjenaLozinke.setIcon(new ImageIcon(npImage));
		menuItemPromjenaLozinke.setActionCommand("nova lozinka");
		menuItemPromjenaLozinke.addActionListener(menubarListener);
		
		menuItemOdjava = new JMenuItem("Odjava");
		Image logoutImage = toolkit.getImage("Ikonice/logout.png");
		menuItemOdjava.setIcon(new ImageIcon(logoutImage));
		menuItemOdjava.setActionCommand("odjava korisnika");
		menuItemOdjava.addActionListener(menubarListener);
		
		add(menuItemRegistracija);
		add(menuItemPrijava);
		add(menuItemPromjenaLozinke);
		add(menuItemOdjava);
		
	}
	
}