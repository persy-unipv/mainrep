/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unipv.ingsfw.pattern.observer;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class GUIMatchObserver extends JFrame implements Observer {

   private JLabel label;

   public GUIMatchObserver() {
      setTitle("Realtime Match score");
      getContentPane().setLayout(new BorderLayout());
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      label = new JLabel("0");
      label.setForeground(Color.red);
      label.setFont(new Font("Courier", Font.BOLD, 30));
      getContentPane().add(label);
      setSize(700, 200);
   
      setVisible(true);
   }

   @Override
   public void update(Observable o, Object arg) {
      Date d = new Date((long) arg);
      SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
      label.setText(df.format(d)+"  " +((ObservableMatch) o).getMatchScore());
   }
}
