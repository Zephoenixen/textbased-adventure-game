public class MeleeWeapon extends Weapon {
    MeleeWeapon(String n, String sh, int d){
        super(n, sh, d);
    }

    @Override
    public Attack attack(Enemy target){
        String descrip = "you swing against the " + target.getName();
        return new Attack(damage, descrip, true);
    }

    @Override
    public Attack attack(Enemy attacker, boolean enemyAttack){
        String descrip = attacker + " swings against you";
        return new Attack(damage, descrip, true);
    }


}

