package it.unipv.ingsfw.pattern.observer;

import java.util.Observable;


public class ObservableMatch extends Observable {

   private String matchScore;

   public ObservableMatch() {
      this.matchScore = "0-0";
   }

   public void setMatchScore(String newScore) {
      this.matchScore = newScore;
      this.setChanged();
      this.notifyObservers(System.currentTimeMillis());
   }

   public String getMatchScore() {
      return matchScore;
   }
   
}
