public class MeleeWeapon extends Weapon {
    int damage;

    MeleeWeapon(String n, String sh, int d){
        super(n, sh);
        damage = d;
    }

    @Override
    public boolean Attack(String target){
        IO.println("you attack the " + "air" + " with your " + name + " it takes " + damage + " damage.");
        return true;
    }


}

