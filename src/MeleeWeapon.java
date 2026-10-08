public class MeleeWeapon extends Weapon {
    int damage;

    MeleeWeapon(String n, String sh, int d){
        super(n, sh);
        damage = d;
    }

    @Override
    public Attack attack(Enemy target){
        String descrip = "you swing against the " + target.getName();
        return new Attack(damage, descrip, true);
    }


}

