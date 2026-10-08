public class AmmoWeapon extends Weapon {
    int damage;
    int ammo;

    AmmoWeapon(String n, String sh, int d, int a){
        super(n, sh);
        damage = d;
        ammo = a;
    }
    @Override
    public Attack attack(Enemy target){
        String descript;

        if (ammo <= 0){
            descript = "Your " + name + " has no ammunition";
            return new Attack(damage, descript, false);
        }

        ammo--;
        descript = "You attack the " + target + " with your " + name + ". It takes " + damage + " damage.";
        return new Attack(damage, descript, true);
    }
}
