public class MeleeWeapon extends Weapon {
    int damage;

    MeleeWeapon(String n, String sh, int d){
        super(n, sh);
        damage = d;
    }

    @Override
    public void Attack(){
        IO.println("you attack the " + "the air" + " with your " + name + "it takes " + damage + " damage.");
    }

    @Override
    public String toString() {
        return Grammar(name) + name;
    }
}

