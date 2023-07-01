package frame.panels;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class StatubarPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	public StatubarPanel() {
		setLayout(new BorderLayout());
		setBackground(new Color(151, 171, 215));

		JLabel lblStatus = new JLabel("Spreman");
		lblStatus.setFont(new Font("Arial", 1, 14));
		lblStatus.setForeground(Color.white);
		
		JLabel lblPozicija = new JLabel("Pozicija: X:     Y:     ");
		lblPozicija.setFont(new Font("Arial", 1, 14));
		lblPozicija.setForeground(Color.white);

		this.add(lblStatus, BorderLayout.WEST);
		this.add(lblPozicija, BorderLayout.EAST);


	}
	
}
