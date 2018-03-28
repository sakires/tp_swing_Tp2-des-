package test;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicBorders;

public class Pannel extends JPanel{
	private PannelRadio nord;
	private JLabel tirage;
	private JLabel roll;
	private JLabel resultat;
	private Pannelosud sud;
	
	public Pannel(){
		
		//cree bordure

		this.setLayout(new BorderLayout());
		this.nord = new PannelRadio();
		this.tirage = new JLabel("tirage : ");
		this.roll = new JLabel("Roll the DICE ");
		this.resultat = new JLabel();
		resultat.setBorder(BorderFactory.createLineBorder(Color.black));
		this.sud = new Pannelosud();
		
		
		this.add(nord, BorderLayout.NORTH);
		this.add(roll, BorderLayout.WEST);
		this.add(tirage, BorderLayout.EAST);
		this.add(resultat, BorderLayout.CENTER);
		this.add(sud, BorderLayout.SOUTH);
		

	}

}
