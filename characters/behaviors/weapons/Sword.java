package behaviors.weapons;
import behaviors.Weapon;

public class Sword implements Weapon{

  @Override
  public void useWeapon(){
    System.out.println("Slash attack");
  }
}