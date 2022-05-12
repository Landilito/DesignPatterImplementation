package behaviors.weapons;
import behaviors.Weapon;

public class Knife implements Weapon{

  @Override
  public void useWeapon(){
    System.out.println("Stab attack");
  }
}