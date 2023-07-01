package frame.menubar.menu;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import listeneri.MenubarListener;

public class MenuSimulacija extends JMenu{

	private static final long serialVersionUID = 1L;
	
	private JMenuItem menuItemPokretanjeSimulacije = null;
	private JMenuItem menuItemZaustavljanjeSimulacije = null;
	private JMenuItem menuItemPauziranjeSimulacije = null;
	private JMenuItem menuItemCuvanjeSimulacije = null;
	
	private MenubarListener menubarListener = new MenubarListener();
	
public MenuSimulacija() {
		
		setText("Simulacija");
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		menuItemPokretanjeSimulacije = new JMenuItem("Pokreni");
		Image startImage = toolkit.getImage("Ikonice/startPause.png");
		menuItemPokretanjeSimulacije.setIcon(new ImageIcon(startImage));
		menuItemPokretanjeSimulacije.setActionCommand("pokretanje simulacije");
		menuItemPokretanjeSimulacije.addActionListener(menubarListener);
		
		menuItemZaustavljanjeSimulacije = new JMenuItem("Zaustavi");
		Image stopImage = toolkit.getImage("Ikonice/stop.png");
		menuItemZaustavljanjeSimulacije.setIcon(new ImageIcon(stopImage));
		menuItemZaustavljanjeSimulacije.setActionCommand("zatvaranje simulacije");
		menuItemZaustavljanjeSimulacije.addActionListener(menubarListener);
		
		menuItemPauziranjeSimulacije = new JMenuItem("Pauziraj");
		Image pauseImage = toolkit.getImage("Ikonice/pause.png");
		menuItemPauziranjeSimulacije.setIcon(new ImageIcon(pauseImage));
		menuItemPauziranjeSimulacije.setActionCommand("pauziranje simulacije");
		menuItemPauziranjeSimulacije.addActionListener(menubarListener);
		
		menuItemCuvanjeSimulacije = new JMenuItem("Sacuvaj");
		Image saveImage = toolkit.getImage("Ikonice/sacuvaj.png");
		menuItemCuvanjeSimulacije.setIcon(new ImageIcon(saveImage));
		menuItemCuvanjeSimulacije.setActionCommand("cuvanje simulacije");
		menuItemCuvanjeSimulacije.addActionListener(menubarListener);
		
		add(menuItemPokretanjeSimulacije);
		add(menuItemZaustavljanjeSimulacije);
		add(menuItemPauziranjeSimulacije);
		add(menuItemCuvanjeSimulacije);
		
	}
	
}
