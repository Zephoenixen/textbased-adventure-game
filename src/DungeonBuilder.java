public class DungeonBuilder {
    Room room1;
    Room room2;
    Room room3;
    Room room4;
    Room room5;
    Room room6;
    Room room7;
    Room room8;
    Room room9;

    private void RightConnection(Room r1, Room r2){
        r1.AssignEast(r2);
        r2.AssignWest(r1);
    }

    private void DownConnection(Room r1, Room r2){
        r1.AssignSouth(r2);
        r2.AssignNorth(r1);
    }

    public void AssignRooms(){
        /*
        |---|
        | | |
        |-|-|

        */

        // Assign first row.
        RightConnection(room1, room2);
        RightConnection(room2, room3);
        DownConnection(room1, room4);
        DownConnection(room3, room6);

        // Assign second row.
        DownConnection(room4, room7);
        DownConnection(room5, room8);
        DownConnection(room6, room9);

        //Assign third row.
        RightConnection(room7, room8);
        RightConnection(room8, room9);
    }

    public void MakeRooms(){
        room1 = new Room(new Vector2(0,0));
        room2 = new Room(new Vector2(0,1));
        room3 = new Room(new Vector2(0,2));
        room4 = new Room(new Vector2(1,0));
        room5 = new Room(new Vector2(1,1));
        room6 = new Room(new Vector2(1,2));
        room7 = new Room(new Vector2(2,0));
        room8 = new Room(new Vector2(2,1));
        room9 = new Room(new Vector2(2,2));
    }
    public Room getRoom1(){
        return room1;
    }
}
