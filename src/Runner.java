
public class Runner {

  private String name;
  private int speed;

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
    this.speed = (int) (Math.random()*30);
  }

}
