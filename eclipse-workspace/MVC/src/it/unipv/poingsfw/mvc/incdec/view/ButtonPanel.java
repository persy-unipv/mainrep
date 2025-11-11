/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unipv.poingsfw.mvc.incdec.view;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import it.unipv.poingsfw.mvc.incdec.model.Contatore;

public class ButtonPanel extends JPanel {

	private JLabel label;
	private JTextField text;
	private JButton incButton;
	private JButton decButton;

	public ButtonPanel(Contatore c) {
		//Create Components
		label = new JLabel("0");
		text=new JTextField("1");

		incButton = new JButton("Incrementa");
		decButton = new JButton("Decrementa");

		incButton.setActionCommand("incrementa ");
		decButton.setActionCommand("decrementa");

		//Define Layout
		setLayout(new BorderLayout());

		

		//Create one panel for all the Buttons
		JPanel south = new JPanel();
		south.add(incButton);
		south.add(decButton);

		//Add the panel of the Buttons, the label, and the text to this panel
		add(south, BorderLayout.SOUTH);
		add(label, BorderLayout.CENTER); 
		add(text, BorderLayout.NORTH); 
	}



	public void setLabel(int counter) {
		label.setText(counter + "");
	}

	public int getPasso() {
		try {
			return Integer.parseInt(text.getText());
		}catch(NumberFormatException e) {
			e.printStackTrace();
			return 1;
		}
	}



	public JButton getIncButton() {
		return incButton;
	}



	public JButton getDecButton() {
		return decButton;
	}



	public void setText(int val) {
		label.setText(String.valueOf(val));
	}
	
	
	
	
} // fine ButtonPanel

