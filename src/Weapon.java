public abstract class Weapon extends Item {
    int damage;
    Weapon(String n, String sh, int d) {
        super(n, sh);
        this.damage = d;
    }

    public abstract Attack attack(Enemy target);

    public abstract Attack attack(Enemy attacker, boolean enemyAttack);
}


