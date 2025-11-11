/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package it.unipv.poingsfw.mvc.incdec;

import javax.swing.JFrame;

import it.unipv.poingsfw.mvc.incdec.controller.IncDecAction;
import it.unipv.poingsfw.mvc.incdec.model.Contatore;
import it.unipv.poingsfw.mvc.incdec.view.ButtonFrame;

public class ButtonTest{
	public static void main(String[] args){
		Contatore c=new Contatore();
		ButtonFrame frame = new ButtonFrame(c);
		
		IncDecAction controller=new IncDecAction(frame, c);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
