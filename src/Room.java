import java.util.ArrayList;

public class Room {
    private ArrayList<Enemy> enemies = new ArrayList<>();
    private final Vector2 roomID;
    private String name;
    private String description;
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

    // lootManagement
    public boolean noRoomLoot(){
        return roomItems.isEmpty();
    }

    public String getRoomLoot() {
        return roomItems.itemList();
    }

    public Item TakeItemFromRoom(String item){
        Item itemToTake = roomItems.search(item);
        roomItems.removeItem(item);
        return itemToTake;
    }

    public void PutItemInRoom(Item item){
        roomItems.addItem(item);
    }

    public void addEnemy(Enemy enemy){
        enemies.add(enemy);
    }
    public void removeEnemy(Enemy enemy){
        enemies.remove(enemy);
    }
    public Enemy SearchEnemy(String shorthand){
        for (Enemy enemy : enemies){
            if(enemy.getShorthand().equals(shorthand)){
                return enemy;
            }
        }
        return null;
    }
    public Enemy getFirstEnemy(){
        if (enemies.isEmpty()){
            return null;
        }
        return enemies.getFirst();
    }
    public boolean hasEnemies(){
        return !enemies.isEmpty();
    }
}
