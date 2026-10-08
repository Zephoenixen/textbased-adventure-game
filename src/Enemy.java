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
        IO.println(name + " dies, dropping " + weapon.getName());
        room.PutItemInRoom(weapon);
        room.removeEnemyFromRoom(this.shortHand);
    }

    @Override
    public String toString() {
        return Grammar(name) + name;
    }

    public String Grammar(String word){
        char ch = word.toLowerCase().charAt(1);
        if(isVowel(ch)) return "an ";
        else return "a ";
    }

    private boolean isVowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
