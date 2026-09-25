public class Room {
    private Vector2 roomID;
    private String name;
    private String description;
    private Inventory loot;

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

    public boolean isLoot(){
        return loot.notEmpty();
    }

    public String getLoot() {
        return loot.ItemList();
    }

    public void TakeItemFromRoom(String item){
        loot.RemoveItem(item);
    }
    public void PutItemInRoom(String item){
        loot.AddItem(item);
    }
}
