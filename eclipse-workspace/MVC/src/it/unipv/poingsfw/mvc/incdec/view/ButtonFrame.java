/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unipv.poingsfw.mvc.incdec.view;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import it.unipv.poingsfw.mvc.incdec.model.Contatore;

public class ButtonFrame extends JFrame {
	
	private ButtonPanel panel;

   public ButtonFrame(Contatore c) {
      setTitle("ButtonCounter");
      setSize(300, 200);
      panel = new ButtonPanel(c);
      Container contentPane = getContentPane();
      contentPane.add(panel);
   }
   
   public JButton getIncButton() {
		return panel.getIncButton();
	}



	public JButton getDecButton() {
		return panel.getDecButton();
	}



	public void setText(int i) {
		panel.setText(i);
	}
	
	public int getPasso() {
		return panel.getPasso();
	}
	
	
} // fine della classe ButtonFrame
