import behaviors.weapons.*;
class Main {
  public static void main(String[] args) {
    Character king = new King();
    Character knight = new Knight();

    king.fight();
    knight.fight();
    king.setWeapon(new Knife());
    knight.setWeapon(new Sword());
    king.fight();
    knight.fight();
    
  }
}