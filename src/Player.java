public class Player {
    Adventure adv = new Adventure();
    Inventory inv = new Inventory();
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
        if(canLoot()) IO.println("There is a " + myRoom.getLoot() + " in this room");
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

    public void takeItemInRoom(String sub) {
        if (myRoom.TakeItemFromRoom(sub)) {
            inv.AddItem(sub);
            IO.println("You have taken the " + sub + " and it is now in your inventory");
        } else {
            IO.println("There is no " + sub + " in this room");
        }
    }

    public void placeItemInRoom(String sub) {
       if (inv.RemoveItem(sub)){
           myRoom.PutItemInRoom(sub);
           IO.println("You have dropped the " + sub + " in this room");
       } else {
           IO.println("You dont have " + sub + " in your inventory");
       }
    }

    public void ListItems(){
        if (inv.notEmpty()) IO.println("You are carrying: " + inv.ItemList());
        else IO.println("Your inventory is empty");
    }

    private boolean canLoot(){
        return myRoom.isLoot();
    }
}
