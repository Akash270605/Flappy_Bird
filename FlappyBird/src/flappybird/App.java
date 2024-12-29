/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flappybird;

import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception{
      int boardWidth =360;
      int boardHeight= 640;
      
      JFrame frame= new JFrame("Flappy Bird");
    // frame.setVisible(true);
      frame.setSize(boardWidth, boardHeight);
      frame.setLocationRelativeTo(null);
      frame.setResizable(false);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      FlappyBird flappyBird= new FlappyBird();
      frame.add(flappyBird);
      frame.pack();
      flappyBird.requestFocus();
      frame.setVisible(true);
    }
}
