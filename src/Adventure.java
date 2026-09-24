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

<<<<<<< Updated upstream
    public boolean goToRoom(Room r){
        if (r == null) return false;
        currentRoom = r;
        return true;
    }
    public String currentRoomInfo(){
        return "You are in the " + currentRoom.getName() + "\n"
                + "You find yourself in " + currentRoom.getDescription();

=======
    public Room getStartingRoom() {
        return startingRoom;
>>>>>>> Stashed changes
    }


}
