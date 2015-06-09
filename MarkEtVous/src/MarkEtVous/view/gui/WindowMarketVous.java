package MarkEtVous.view.gui;



import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WindowMarketVous extends JFrame 
{
	 static JButton button1 = new JButton("RT");
	 static JButton button2 = new JButton("INFO");
	 static JButton button3 = new JButton("GEA");
	 static JButton button4 = new JButton("TC");

	public WindowMarketVous()
	{
		
		
		this.setTitle("MarketVous");
		this.setSize(900, 500);
		this.setVisible(true);
		JPanel background= new JPanel();
		background.setBackground(Color.WHITE);
		this.add(background);
		
		button1.setPreferredSize(new Dimension(65, 30));
		button2.setPreferredSize(new Dimension(65, 30));
		button3.setPreferredSize(new Dimension(65, 30));
		button4.setPreferredSize(new Dimension(65, 30));
		
		
	}

}


	
