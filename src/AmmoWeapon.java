public class AmmoWeapon extends Weapon {
    int damage;
    int ammo;

    AmmoWeapon(String n, String sh, int d, int a){
        super(n, sh);
        damage = d;
        ammo = a;
    }
    @Override
    public boolean Attack(String target){
        if (ammo <= 0){
            IO.println("You have no ammo with " + name);
            return false;
        }

        ammo--;
        IO.println("You attack the " + target + " with your " + name +
                ". It takes " + damage + " damage.");
        return true;
    }
}
