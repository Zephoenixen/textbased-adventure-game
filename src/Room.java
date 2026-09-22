public class Room {
    Room northRoom;
    Room eastRoom;
    Room southRoom;
    Room westRoom;

    Room(Room n, Room e, Room s, Room w){
        this.northRoom = n;
        this.eastRoom = e;
        this.southRoom = s;
        this.westRoom = w;
    }
}
