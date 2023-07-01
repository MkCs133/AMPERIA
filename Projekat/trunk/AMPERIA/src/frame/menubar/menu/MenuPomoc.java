package frame.menubar.menu;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import listeneri.MenubarListener;

public class MenuPomoc extends JMenu{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JMenuItem menuItemOnlinePomoc = null;
	private JMenuItem  menuItemOAplikaciji = null;
	private JMenuItem  menuItemFAQ = null;
	
	private MenubarListener menubarListener = new MenubarListener();
	
	public MenuPomoc() {
		
		setText("Pomoc");
		
		
		menuItemOnlinePomoc = new JMenuItem("Online pomoc");
		//menuItemOnlinePomoc.setIcon(GeneralHelper.getIconFromName("help"));
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Image helpImage = toolkit.getImage("Ikonice/help.png");
		menuItemOnlinePomoc.setIcon(new ImageIcon(helpImage));
		menuItemOnlinePomoc.setActionCommand("online pomoc");
		menuItemOnlinePomoc.addActionListener(menubarListener);
		
		menuItemOAplikaciji = new JMenuItem("O Amperia");
		Image amperiaImage = toolkit.getImage("Ikonice/AMPERIA.png");
		menuItemOnlinePomoc.setIcon(new ImageIcon(amperiaImage));
		menuItemOAplikaciji.setActionCommand("O aplikaciji");
		menuItemOAplikaciji.addActionListener(menubarListener);
		
		menuItemFAQ = new JMenuItem("FAQ");
		Image faqImage = toolkit.getImage("Ikonice/faq.png");
		menuItemOnlinePomoc.setIcon(new ImageIcon(faqImage));
		menuItemFAQ.setActionCommand("faq");
		menuItemFAQ.addActionListener(menubarListener);
		
		
		add(menuItemOnlinePomoc);
		add(menuItemOAplikaciji);
		add(menuItemFAQ);
		
	}
	
}
