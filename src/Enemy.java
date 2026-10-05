public class Enemy {
    private final String name;
    private int hitpoints;
    private int damage;
    private String[] descriptions;

    Enemy(String n, int hp, int dmg){
        name = n;
        hitpoints = hp;
        damage = dmg;
    }

    public void setDescriptions(String aliveDescriptions, String deadDescriptions) {
        this.descriptions[0] = aliveDescriptions;
        this.descriptions[1] = deadDescriptions;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public String getDescription() {
        if(alive()) return descriptions[0];
        else return descriptions[1];
    }

    public void setHitpoints(int hitpoints) {
        this.hitpoints = hitpoints;
    }

    public void takeDamage(int damage){
        setHitpoints(hitpoints-damage);
    }

    private boolean alive(){
        return (hitpoints > 0);
    }
}
