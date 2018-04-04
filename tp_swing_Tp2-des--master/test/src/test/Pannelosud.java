package test;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Pannelosud extends JPanel {
	
	private JButton stat;
	private JButton roll;
	private JButton fin;
	
	public Pannelosud() {
		this.stat = new JButton("Stats");
		this.roll = new JButton("Roll");
		this.fin = new JButton("Fin");
		this.setLayout(new FlowLayout()); 
		this.add(stat);
		this.add(roll);
		this.add(fin);
	}

	public JButton getStat() {
		return stat;
	}

	public JButton getRoll() {
		return roll;
	}

	public JButton getFin() {
		return fin;
	}
	public void desactiver(){
		roll.setEnabled(false);
	}

}
