public class AmmoWeapon extends Item implements Weapon {
    int damage;
    int ammo;

    AmmoWeapon(String n, String sh, String g, int d, int a){
        super(n, sh, g);
        damage = d;
        ammo = a;
    }

    @Override
    public void Attack(){
        if(ammo <= 0) {
            IO.println("You have no ammo with the " + name);
            return;
        }
        IO.println("you attack the " + "the air" + " with your " + name + "it takes " + damage + " damage.");
        ammo --;
        IO.println("you have " + ammo + " left in your weapon");
    }
}
