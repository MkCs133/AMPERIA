package main;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import frame.MainFrame;

public class MainClass {

	public static void main(String[] args) {
		try {
			com.jtattoo.plaf.aero.AeroLookAndFeel.setTheme("Large-Font", "", "AMPERIA");
			// UIManager.put("Tree.rendererFillBackground", false);
			UIManager.setLookAndFeel("com.jtattoo.plaf.aero.AeroLookAndFeel");
		} catch (UnsupportedLookAndFeelException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			// handle exception
		} catch (InstantiationException e) {
			// handle exception
		} catch (IllegalAccessException e) {
			// handle exception
		}
		 
		new MainFrame();
	}
}
