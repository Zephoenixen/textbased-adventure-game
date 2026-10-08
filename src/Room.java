public class Room {
    private final Vector2 roomID;
    private String name;
    private String description;
    private Encounter encounter = new Encounter();
    private Inventory roomItems = new Inventory();

    private Room northRoom;
    private Room eastRoom;
    private Room southRoom;
    private Room westRoom;

    Room(Vector2 ID) {
        this.roomID = ID;
    }

    // Getters for position, name and description.

    public Vector2 getRoomID() {
        return roomID;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    //Setters for Name and Description.
    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    //Setters for Rooms.
    public void AssignNorth(Room room) {
        this.northRoom = room;
    }

    public void AssignEast(Room room) {
        this.eastRoom = room;
    }

    public void AssignSouth(Room room) {
        this.southRoom = room;
    }

    public void AssignWest(Room room) {
        this.westRoom = room;
    }


     //Getters for Rooms.
    public Room getNorthRoom() {
        return northRoom;
    }

    public Room getEastRoom() {
        return eastRoom;
    }

    public Room getSouthRoom() {
        return southRoom;
    }

    public Room getWestRoom() {
        return westRoom;
    }

    // Loot Management
    public boolean noRoomLoot(){
        return roomItems.noItems();
    }

    public String getRoomLoot() {
        return roomItems.toString();
    }

    public Item TakeItemFromRoom(String item){
        Item itemToTake = roomItems.search(item);
        roomItems.removeItem(item);
        return itemToTake;
    }

    public void PutItemInRoom(Item item){
        roomItems.addItem(item);
    }

    // Enemy Management

    public void putEnemyInRoom(Enemy enemy){
        encounter.addEnemy(enemy);
    }

    public void removeEnemyFromRoom(String enemyName){
        encounter.removeEnemy(enemyName);
    }

    public String getEncounter(){
        if(noEncounter()) return null;
        return encounter.toString();
    }

    public boolean noEncounter(){
        return encounter.noEnemies();
    }

    public Enemy nameToEnemy(String name){
        return encounter.search(name);
    }

    public boolean attackEnemy(Enemy enemy, int damage){
        if(enemy == null) return false;
        enemy.takeDamage(damage);
        return true;
    }
}
