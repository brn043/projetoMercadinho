/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import frames.TelaProdutos;

/**
 *
 * @author Senai
 */
public class Main {
    
  public static void main (String[] Args){
      java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaProdutos().setVisible(true);
            }
        });
  }  
}

