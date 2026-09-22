public class Adventure {
    //Spillerens nuværende position
    private Room currentRoom;
    private DungeonBuilder dungeonBuilder;


    public Adventure(){
        dungeonBuilder = new DungeonBuilder();
        dungeonBuilder.MakeRooms();
        dungeonBuilder.AssignRooms();

        currentRoom = dungeonBuilder.getRoom1();
    }
}
