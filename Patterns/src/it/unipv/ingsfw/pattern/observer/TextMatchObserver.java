/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package it.unipv.ingsfw.pattern.observer;

import java.util.Observable;
import java.util.Observer;


public class TextMatchObserver implements Observer{

   @Override
   public void update(Observable o, Object arg) {
      System.out.println("Score Update "+((ObservableMatch)o).getMatchScore());
   }

}
