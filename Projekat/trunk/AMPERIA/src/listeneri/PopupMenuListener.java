package listeneri;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import frame.MainFrame;


public class PopupMenuListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		
		switch (e.getActionCommand()) {
		case "popupMenuItem":
			JOptionPane.showMessageDialog(MainFrame.contentPane, "Funkcija u implementaciji!!!", "Poruka",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		}
		}

	}


