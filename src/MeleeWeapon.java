public class MeleeWeapon extends Item implements Weapon {
    int damage;

    MeleeWeapon(String n, String sh, String g, int d){
        super(n, sh, g);
        damage = d;
    }

    @Override
    public void Attack(){
        IO.println("you attack the " + "the air" + " with your " + name + "it takes " + damage + " damage.");
    }
}

