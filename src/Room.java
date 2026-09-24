public class Room {
    private Vector2 roomID;
    private String name;
    private String description;

    private Room northRoom;
    private Room eastRoom;
    private Room southRoom;
    private Room westRoom;

    Room(Vector2 ID) {
        this.roomID = ID;
    }

    public Vector2 getRoomID() {
        return roomID;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

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

     //Getters for vores Rooms
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
}
