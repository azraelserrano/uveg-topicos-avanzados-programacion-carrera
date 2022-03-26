/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author UVEG
 */
public class Runner {

  private String name;
  private int speed;
  private final String[] array;
  
  private ThreadRunner thread;

  public Runner() {
    array = new String[5];
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getSpeed() {
    return speed;
  }

  public void setSpeed() {
    this.speed = (int) (Math.random() * 30);
  }

  public int getArrayLength() {
    int count = 0;
    for (int i = 0; i < array.length; i++) {
      if (this.array[i] != null) {
        count++;
      }
    }
    return count;
  }

  public String getArray() {
    String text = "";
    for (int i = 0; i < array.length; i++) {
      if (this.array[i] != null) {
        text += (i + 1) + " - " + this.array[i] + "\n";
      } else {
        break;
      }

    }
    return text;
  }

  public void setArray() {
    for (int i = 0; i < array.length; i++) {
      if (this.array[i] == null) {
        this.array[i] = this.name;
        break;
      }
    }
  }
  
  public String startThread() {
    String message = "";
    for (int i = 0; i < array.length; i++) {
      setSpeed();
      thread = new ThreadRunner(this.array[i],getSpeed());
      message += (i+1) + " - " +this.array[i]+"- Tiempo: "+getSpeed()+" segundos\n";
    }
    thread.start();
    return message;
  }
}
