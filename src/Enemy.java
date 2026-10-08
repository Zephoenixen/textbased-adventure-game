public class Enemy {
    private final String name;
    private final String shortHand;
    private String aliveInfo;
    private String deadInfo;

    private int health;

    private Weapon weapon;
    private Room room;
    private String deathDescription;

    public Enemy(String name,
                 String shorthand,
                 String visualInfo,
                 String corpseInfo,
                 int health,
                 Weapon weapon,
                 Room room){
        this.name = name;
        this.shortHand = shorthand;
        this.aliveInfo = visualInfo;
        this.deadInfo = corpseInfo;
        this.health = health;
        this.weapon = weapon;
        this.room = room;
        deathDescription = name + " dies, dropping " + Grammar(weapon.getName()) + weapon.getName();
    }
    public String getName(){
        return name;
    }

    public String getShorthand(){
        return shortHand;
    }

    public String getDeathDescription() {
        return deathDescription;
    }

    public String getDescription(){
        if (alive()) return aliveInfo;
        else return deadInfo;
    }
    public int getHealth(){
        return health;
    }

    private boolean alive() {
        return (health > 0);
    }

    public boolean takeDamage(int damage){
        health -= damage;
        if (!alive()){
            Die();
            return false;
        }
        return true;
    }

    public Attack dealDamage(){
        return weapon.attack(this, true);
    }

    private void Die(){
        health = 0;
        room.PutItemInRoom(weapon);
        room.removeEnemyFromRoom(this.shortHand);
    }

    @Override
    public String toString() {
        return Grammar(name) + name;
    }

    public String Grammar(String word){
        char ch = word.toLowerCase().charAt(0);
        if(isVowel(ch)) return "an ";
        else return "a ";
    }

    private boolean isVowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'y';
    }
}
