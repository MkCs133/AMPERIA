package frame.tabs;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class CustomTabbedPane extends JTabbedPane {

	private static final long serialVersionUID = 1L;

	public void AddCloseButton() {
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel.setBackground(Color.white);
		JLabel titleLabel = new JLabel(this.getTitleAt(0));
		titleLabel.setBackground(Color.white);
		JLabel closeButton = new JLabel("X");
		closeButton.setPreferredSize(new Dimension(20, 20));
		closeButton.setBackground(Color.white);
		panel.add(titleLabel, BorderLayout.WEST);
		panel.add(closeButton, BorderLayout.EAST);
	}
}
