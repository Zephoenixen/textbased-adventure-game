public class Enemy {
    private final String name;
    private final String shortHand;
    private String bodyDescription;
    private String corpseDescription;

    private int health;

    private Weapon weapon;
    private Room room;

    public Enemy(String name,
                 String shorthand,
                 String aliveDescription,
                 String deadDescription,
                 int health,
                 Weapon weapon,
                 Room room){
        this.name = name;
        this.shortHand = shorthand;
        this.bodyDescription = aliveDescription;
        this.corpseDescription = deadDescription;
        this.health = health;
        this.weapon = weapon;
        this.room = room;
    }
    public String getName(){
        return name;
    }
    public String getShorthand(){
        return shortHand;
    }
    public String getDescription(){
        if (alive()) return bodyDescription;
        else return corpseDescription;
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

    private void Die(){
        IO.println(name + "dies, dropping " + weapon.getName());
        room.PutItemInRoom(weapon);
        room.removeEnemy(this);
    }
}
