public class Adventure {
    //Spillerens nuværende position
    private Room startingRoom;


    public Adventure(){
        DungeonBuilder dungeonBuilder = new DungeonBuilder();
        dungeonBuilder.MakeRooms();
        dungeonBuilder.MakeItems();
        dungeonBuilder.MakeWeapons();
        dungeonBuilder.AssignRooms();
        dungeonBuilder.AssignNames();
        dungeonBuilder.AssignDescriptions();
        dungeonBuilder.assignItems();
        startingRoom = dungeonBuilder.getRoom1();
    }

    public Room getStartingRoom() {
        return startingRoom;
    }


}
