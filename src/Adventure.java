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
    // Tjekker hvis der er et rum vores spillere kan gå ind i. Hvis ik return false.
    public boolean goNorth(){
        Room nextRoom = currentRoom.getNorthRoom();
        if (nextRoom != null) {
            currentRoom = nextRoom;
            return true;
        }
        return false;
    }
    public boolean goEast(){
        Room nextRoom = currentRoom.getEastRoom();
        if (nextRoom != null){
            currentRoom = nextRoom;
            return true;
        }
        return false;
    }
    public boolean goSouth(){
        Room nextRoom = currentRoom.getSouthRoom();
        if (nextRoom != null) {
            currentRoom = nextRoom;
            return true;
        }
        return false;
    }
    public boolean goWest(){
        Room nextRoom = currentRoom.getWestRoom();
        if (nextRoom != null) {
            currentRoom = nextRoom;
            return true;
        }
        return false;
    }
    public  Room getCurrentRoom(){
        return currentRoom;
    }
}
