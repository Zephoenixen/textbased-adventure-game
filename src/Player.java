public class Player {
    Adventure adv = new Adventure();
    Room myRoom = adv.getStartingRoom();


    public Player(Adventure adv){
        this.adv = adv;
    }

    public void GoNorth(){
        GoToCardinal(North(), myRoom.getNorthRoom(), "Going North");
    }

    public void GoEast(){
        GoToCardinal(East(), myRoom.getEastRoom(), "Going East");
    }

    public void GoSouth(){
        GoToCardinal(South(), myRoom.getSouthRoom(), "Going South");
    }

    public void GoWest(){
        GoToCardinal(West(), myRoom.getWestRoom(), "Going West");
    }

    private void GoToCardinal(boolean cardinal, Room room, String cardinalText) {
        if (!cardinal) IO.println("You cannot go that way");
        else {
            myRoom = room;
            IO.println(cardinalText);
            Look();
        }
    }

    public void Look(){
        IO.println("You are in the " + myRoom.getName() + ", it is " + myRoom.getDescription());
    }

    public boolean North(){
        return RoomExist(myRoom.getNorthRoom());
    }
    public boolean East(){
        return RoomExist(myRoom.getEastRoom());
    }
    public boolean South(){
        return RoomExist(myRoom.getSouthRoom());
    }
    public boolean West(){
        return RoomExist(myRoom.getWestRoom());
    }
    public boolean RoomExist(Room room){
        return room != null;
    }
}
