public class AmmoWeapon extends Weapon {
    int damage;
    int ammo;

    AmmoWeapon(String n, String sh, int d, int a){
        super(n, sh);
        damage = d;
        ammo = a;
    }

    @Override
    public boolean Attack(Enemy enemy){
        if(ammo <= 0) {
            IO.println("You have no ammo with the " + name);
            return false;
        }
        IO.println("you attack the " + "air" + " with your " + name + " it takes " + damage + " damage.");
        ammo --;
        IO.println("you have " + ammo + "ammunition left in your weapon");
        return true;
    }
}
