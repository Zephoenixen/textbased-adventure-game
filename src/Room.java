public class Room {
    Vector2 roomID;
    Room northRoom;
    Room eastRoom;
    Room southRoom;
    Room westRoom;

    Room(Vector2 ID) {
        this.roomID = ID;
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
