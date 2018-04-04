package test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Pannel extends JPanel implements ActionListener{
	private PannelRadio nord;
	private JLabel tirage;
	private JLabel roll;
	private JLabel resultat;
	private Pannelosud sud;
	private int click=0;
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
		
		sud.getStat().addActionListener(this);
		sud.getRoll().addActionListener(this);
		sud.getFin().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(sud.getStat())){
			
		}
		if (e.getSource().equals(sud.getRoll())){
			resultat.setText(" "+this.lancer());
			click++;
			if(click ==10)
				sud.desactiver();
			
		}
		if (e.getSource().equals(sud.getFin())){
			System.exit(0);
		}
		if(e.getSource().equals(nord.getBox()))
			roll.setText(nord.getBoxAction().getText());
		
		
	}
	private int lancer(){
		int alea = (int) (Math.random()*nord.valeurBoutton());
		return alea;
		
	}
}
