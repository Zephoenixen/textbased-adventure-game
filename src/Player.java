public class Player {
    Adventure adv = new Adventure();
    Room myRoom = adv.getStartingRoom();


    public Player(Adventure adv){
        this.adv = adv;
    }

    public void GoNorth(){
        if(!North()) IO.println("You cannot go that way");
        else {
            myRoom = myRoom.getNorthRoom();
            IO.println("Going North");
            Look();
        }
    }

    public void GoEast(){
        if(!East()) IO.println("You cannot go that way");
        else {
            myRoom = myRoom.getEastRoom();
            IO.println("Going East");
            Look();
        }
    }

    public void GoSouth(){
        if(!South()) IO.println("You cannot go that way");
        else {
            myRoom = myRoom.getSouthRoom();
            IO.println("Going South");
            Look();
        }
    }

    public void GoWest(){
        if(!West()) IO.println("You cannot go that way");
        else {
            myRoom = myRoom.getWestRoom();
            IO.println("Going West");
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
