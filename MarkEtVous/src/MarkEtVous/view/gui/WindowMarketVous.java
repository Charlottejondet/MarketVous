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
	private JButton button1 = new JButton("RT");
	private JButton button2 = new JButton("INFO");
	private JButton button3 = new JButton("GEA");
	private JButton button4 = new JButton("TC");

	public WindowMarketVous()
	{
		
		
		this.setTitle("Mark&Vous");
		this.setSize(600, 700);
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


	
