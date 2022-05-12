import behaviors.Weapon;

public abstract class Character{
  
  Weapon weapon;
  
  public Character(){}

  public void fight(){
    weapon.useWeapon();
  }

  public void setWeapon(Weapon w){
    weapon = w;
  }
}