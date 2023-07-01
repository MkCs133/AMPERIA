package frame;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

import frame.menubar.CustomMenuBar;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	MainPanel mainPanel = null;
	public static Container contentPane = null;

	public MainFrame() {
		Image icon;

		icon = java.awt.Toolkit.getDefaultToolkit().getImage("Ikonice/Logo.png").getScaledInstance(500, 500,
				Image.SCALE_SMOOTH);
		mainPanel = new MainPanel();
		contentPane = getContentPane();
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/4-this.getSize().width/4, dim.height/6-this.getSize().height/2);

		setTitle("AMPERIA");
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setIconImage(icon);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setMinimumSize(new Dimension(800, 600));

		setJMenuBar(new CustomMenuBar());
		
		contentPane.add(mainPanel);

		setVisible(true);
	}

}
