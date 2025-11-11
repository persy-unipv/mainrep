/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unipv.poingsfw.mvc.incdec.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import it.unipv.poingsfw.mvc.incdec.model.Contatore;
import it.unipv.poingsfw.mvc.incdec.view.ButtonFrame;


public class IncDecAction {

   private Contatore c;
   private ButtonFrame f;
   
   public IncDecAction(ButtonFrame f, Contatore c) {
      this.f=f;
      this.c=c;
      addListeners();
   }

   
   
   private void addListeners() {
	   
	   f.getIncButton().addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			c.incVal(f.getPasso());
			f.setText(c.getVal());
		}
	});
	   
	   f.getDecButton().addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			c.decVal(f.getPasso());
			f.setText(c.getVal());
		}
	});
	   
   }
   
   
   
}
