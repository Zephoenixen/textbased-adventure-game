public class Adventure {
    //Spillerens nuværende position
    private Room startingRoom;
    private DungeonBuilder dungeonBuilder;


    public Adventure(){
        dungeonBuilder = new DungeonBuilder();
        dungeonBuilder.MakeRooms();
        dungeonBuilder.AssignRooms();
        dungeonBuilder.AssignNames();
        dungeonBuilder.AssignDescriptions();
        startingRoom = dungeonBuilder.getRoom1();
    }

    public Room getStartingRoom() {
        return startingRoom;
    }


}
