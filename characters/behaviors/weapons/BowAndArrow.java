package behaviors.weapons;
import behaviors.Weapon;

public class BowAndArrow implements Weapon{

  @Override
  public void useWeapon(){
    System.out.println("Ranged attack");
  }
}