package MarkEtVous;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Graphics;

public class WindowMarketVous extends JFrame implements Runnable 
{
	
	 static JButton button1 = new JButton("Col1");
	 static JButton button2 = new JButton("Col2");
	 static JButton button3 = new JButton("Col3");
	 static JButton button4 = new JButton("Col4");
	 static JButton button5 = new JButton("Col5");
	 static JButton button6 = new JButton("Col6");
	 static JButton button7 = new JButton("Col7");
	 static JFrame fenetre;
		
	public void run()
	{		
	// Cr�ation du composant graphique associ� � la fen�tre	
	// (� ce stade rien n'est affich�)
		
	fenetre = new JFrame();
	
	// Modification des propri�t�s de la fen�tre
	// Titre, dimensions (en pixel)
	fenetre.setTitle("Power 4 ");
	
	fenetre.setSize(Grid.NUMBER_OF_COLUMNS*100, Grid.NUMBER_OF_LINES*100);
	
	// Affichage de la fen�tre
	fenetre.setVisible(true);
	fenetre.setContentPane(new Panneau());
	fenetre.setBackground(Color.BLACK);
	
