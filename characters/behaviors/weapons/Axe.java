package behaviors.weapons;
import behaviors.Weapon;

public class Axe implements Weapon{

  @Override
  public void useWeapon(){
    System.out.println("Heavy attack");
  }
}