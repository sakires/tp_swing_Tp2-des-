package test;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import javafx.scene.control.RadioButton;

public class PannelRadio extends JPanel{
	private JRadioButton b4;
	private JRadioButton b6;
	private JRadioButton b8;
	private JRadioButton b10;
	private JRadioButton b12;
	private JRadioButton b20;
	private JRadioButton b100;
	
	private ButtonGroup box;
	
	public PannelRadio(){
		this.b4 = new JRadioButton("4");
		this.b6 = new JRadioButton("6");
		this.b8 = new JRadioButton("8");
		this.b10 = new JRadioButton("10");
		this.b12 = new JRadioButton("12");
		this.b20 = new JRadioButton("20");
		this.b100 = new JRadioButton("100");
		this.box = new ButtonGroup();
		box.add(b4);
		box.add(b6);
		box.add(b8);
		box.add(b10);
		box.add(b12);
		box.add(b20);
		box.add(b100);
		this.setLayout(new FlowLayout());
		this.add(b4);
		this.add(b6);
		this.add(b8);
		this.add(b10);
		this.add(b12);
		this.add(b20);
		this.add(b100);
		b100.
	}

	public RadioButton getBoxAction() {
		return (RadioButton) box.getSelection();
	}
	
	public double valeurBoutton(){
		double valeur=0;
		if(null != box.getSelection()){
		ModelBu	radio = box.getSelection();
		if("4".equals(radio.getText()))
			valeur=4;
		if("6".equals(radio.getText()))
			valeur=6;
		if("8".equals(radio.getText()))
			valeur=8;
		if("10".equals(radio.getText()))
			valeur=10;
		if("12".equals(radio.getText()))
			valeur=12;
		if("20".equals(radio.getText()))
			valeur=20;
		if("100".equals(radio.getText()))
			valeur=100;
		}
		return valeur;		
	}

	public ButtonGroup getBox() {
		return box;
	}
	
}
