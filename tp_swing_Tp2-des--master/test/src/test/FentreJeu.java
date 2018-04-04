package test;

import javax.swing.JFrame;

public class FentreJeu extends JFrame {
	
	public FentreJeu(){
	this.setTitle("Premiere fenetre");
	this.setSize(600,250);
	this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	this.getContentPane().add(new Pannel());
	this.setVisible(true);
	}
}
