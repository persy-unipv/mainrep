/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unipv.ingsfw.pattern.observer;


public class MatchTester {

   public static void main(String[] args) throws InterruptedException {
      ObservableMatch match = new ObservableMatch();
      match.addObserver(new TextMatchObserver());
      match.addObserver(new GUIMatchObserver());
      Thread.sleep(2000);
      for (int i = 0; i < 18; i++) {
         match.setMatchScore(i + "");
         Thread.sleep(1000);
      }
   }
}
