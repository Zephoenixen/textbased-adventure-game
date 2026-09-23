public class Adventure {
    //Spillerens nuværende position
    private Room currentRoom;
    private DungeonBuilder dungeonBuilder;


    public Adventure(){
        dungeonBuilder = new DungeonBuilder();
        dungeonBuilder.MakeRooms();
        dungeonBuilder.AssignRooms();
        dungeonBuilder.AssignNames();
        dungeonBuilder.AssignDescriptions();

        currentRoom = dungeonBuilder.getRoom1();
    }
    // Tjekker hvis der er et rum vores spillere kan gå ind i. Hvis ik return false.
    public boolean goNorth(){
        return goToRoom(currentRoom.getNorthRoom());
    }
    public boolean goEast(){
        return goToRoom(currentRoom.getEastRoom());
    }
    public boolean goSouth(){
        return goToRoom(currentRoom.getSouthRoom());
    }
    public boolean goWest(){
        return goToRoom(currentRoom.getWestRoom());
    }
    public Room getCurrentRoom(){
        return currentRoom;
    }

    public boolean goToRoom(Room r){
        if (r == null) return false;
        currentRoom = r;
        return true;
    }
}
