public class Enemy {
    private String name;
    private String shortHand;
    private String description;

    private int health;

    private Weapon weapon;
    private Room room;

    public Enemy(String name,
                 String shorthand,
                 String description,
                 int health,
                 Weapon weapon,
                 Room room){
        this.name = name;
        this.shortHand = shorthand;
        this.description = description;
        this.health = health;
        this.weapon = weapon;
        this.room = room;
    }
    public String getName(){
        return name;
    }
    public String getShortHand(){
        return shortHand;
    }
    public String getDescription(){
        return description;
    }
    public int getHealth(){
        return health;
    }
    public boolean Hit (int damage){
        health -= damage;
        if (health <= 0){
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
