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

    public void AssignNames(){
          room1.setName("first room");
          room2.setName("second room");
          room3.setName("third room");
          room4.setName("fourth room");
          room5.setName("fifth room");
          room6.setName("sixth room");
          room7.setName("seventh room");
          room8.setName("eighth room");
          room9.setName("ninth room");
    }

    public void AssignDescriptions(){
        room1.setDescription("a dark and webby room, with many broken bricks laying");
        room2.setDescription("a dark and webby room, with two ransacked cupboards");
        room3.setDescription("a dark and webby room, with a skeleton chained to the wall");
        room4.setDescription("a grey and webby room, with weak light beams coming from holes in the ceiling");
        room5.setDescription("a dark and webby room, with a small waterfall in its midst");
        room6.setDescription("a dark and webby room, with a deep sense of dread filling the air");
        room7.setDescription("a lighted room, with a very pristine doll set in the southeast corner");
        room8.setDescription("a dark and webby room, with spiders in every corner");
        room9.setDescription("a dark and webby room, with two old dilapited shoes filled with mud. A small seedling can be seen emerging from them");
    }


    public Room getRoom1(){
        return room1;
    }
}
