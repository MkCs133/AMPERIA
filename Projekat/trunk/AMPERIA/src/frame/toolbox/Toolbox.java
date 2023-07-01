package frame.toolbox;


import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import listeneri.ToolbarListener;

public class Toolbox extends JPanel{

	private static final long serialVersionUID = 1L;
	private JButton resistor1Button = null;
	private JButton resistor2Button = null;
	private JButton capacitorButton = null;
	private JButton inductorButton = null;
	private JButton dcVoltageSourceButton = null;
	private JButton acVoltageSourceButton = null;
	private JButton currentSourceButton = null;
	private JButton electricalSwitchButton = null;
	private JButton wireButton;

	ToolbarListener toolbarListener = new ToolbarListener();
	
	public Toolbox() {
		setLayout(new GridLayout(3, 3));
				
                
		
		resistor1Button = new JButton();
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Image resistor1Image = toolkit.getImage("Ikonice/toolbox1.png");
		resistor1Button.setIcon(new ImageIcon(resistor1Image));
		resistor1Button.setBackground(Color.WHITE);
		resistor1Button.setToolTipText("Otpornik");   
		resistor1Button.setActionCommand("toolbarButton");
		resistor1Button.addActionListener(toolbarListener);
		add(resistor1Button);
		
		resistor2Button = new JButton();
		Image resistor2Image = toolkit.getImage("Ikonice/toolbox2.png");
		resistor2Button.setIcon(new ImageIcon(resistor2Image));
		resistor2Button.setBackground(Color.WHITE);
		resistor2Button.setToolTipText("Izvor DC napona");
		resistor2Button.setActionCommand("toolbarButton");
		resistor2Button.addActionListener(toolbarListener);
		add(resistor2Button);
		
		capacitorButton = new JButton();
		Image capacitorImage = toolkit.getImage("Ikonice/toolbox3.png");
		capacitorButton.setIcon(new ImageIcon(capacitorImage));
		capacitorButton.setToolTipText("prekidac");
		capacitorButton.setActionCommand("toolbarButton");
		capacitorButton.addActionListener(toolbarListener);
		add(capacitorButton);
		
		inductorButton = new JButton();
		Image inductorImage = toolkit.getImage("Ikonice/toolbox4.png");
		inductorButton.setIcon(new ImageIcon(inductorImage));
		inductorButton.setBackground(Color.WHITE);
		inductorButton.setToolTipText("provodnik");
		inductorButton.setActionCommand("toolbarButton");
		inductorButton.addActionListener(toolbarListener);
		add(inductorButton);
		
		dcVoltageSourceButton = new JButton();
		Image dcVoltageSourceImage = toolkit.getImage("Ikonice/toolbox11.png");
		dcVoltageSourceButton.setIcon(new ImageIcon(dcVoltageSourceImage));
		dcVoltageSourceButton.setBackground(Color.WHITE);
		dcVoltageSourceButton.setToolTipText("zavojnica");
		dcVoltageSourceButton.setActionCommand("toolbarButton");
		dcVoltageSourceButton.addActionListener(toolbarListener);
		add(dcVoltageSourceButton);
		
		acVoltageSourceButton = new JButton();
		Image acVoltageSourceImage = toolkit.getImage("Ikonice/toolbox6.png");
		acVoltageSourceButton.setIcon(new ImageIcon(acVoltageSourceImage));
		acVoltageSourceButton.setBackground(Color.WHITE);
		acVoltageSourceButton.setToolTipText("uzemljenje");
		acVoltageSourceButton.setActionCommand("toolbarButton");
		acVoltageSourceButton.addActionListener(toolbarListener);
		add(acVoltageSourceButton);
		
		currentSourceButton = new JButton();
		Image currentSourceImage = toolkit.getImage("Ikonice/toolbox7.png");
		currentSourceButton.setIcon(new ImageIcon(currentSourceImage));
		currentSourceButton.setBackground(Color.WHITE);
		currentSourceButton.setToolTipText("izvor AC napona");
		currentSourceButton.setActionCommand("toolbarButton");
		currentSourceButton.addActionListener(toolbarListener);
		add(currentSourceButton);
		
		wireButton = new JButton();
		Image wireImage = toolkit.getImage("Ikonice/toolbox8.png");
		wireButton.setIcon(new ImageIcon(wireImage));
		wireButton.setBackground(Color.WHITE);
		wireButton.setToolTipText("izvor struje");
		wireButton.setActionCommand("toolbarButton");
		wireButton.addActionListener(toolbarListener);
		add(wireButton);
		
		electricalSwitchButton = new JButton();
		Image electricalSwitchImage = toolkit.getImage("Ikonice/toolbox9.png");
		electricalSwitchButton.setIcon(new ImageIcon(electricalSwitchImage));
		electricalSwitchButton.setBackground(Color.WHITE);
		electricalSwitchButton.setToolTipText("kondezator");
		electricalSwitchButton.setActionCommand("toolbarButton");
		electricalSwitchButton.addActionListener(toolbarListener);
		add(electricalSwitchButton);




}



	
}
