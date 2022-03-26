/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import javax.swing.JOptionPane;

/**
 *
 * @author UVEG
 */
public class ThreadRunner extends Thread {

  private String name;
  private int time;

  public ThreadRunner(String name, int time) {
    this.name = name;
    this.time = time;
  }

  public void run() {
    try {
      Thread.sleep((long) (1000 * time));
    } catch (InterruptedException ignore) {
      JOptionPane.showMessageDialog(null, "Error: " + ignore);
    }
  }
}
