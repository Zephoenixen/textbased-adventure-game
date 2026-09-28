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
        if(canLoot()) IO.println("There is " + myRoom.getLoot() + " in this room");
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
        Item takenItem = myRoom.TakeItemFromRoom(sub);
        if (takenItem == null) {
            IO.println("There is no " + sub + " in this room");
            return;
        }
        inv.AddItem(takenItem);
        IO.println("You have taken " + takenItem + " and it is now in your inventory");
    }

    public void placeItemInRoom(String sub) {
        Item itemToPlace = inv.Search(sub);
        if (itemToPlace == null){
            IO.println("You dont have " + sub + " in your inventory");
            return;
        }
        myRoom.PutItemInRoom(itemToPlace);
        IO.println("You have dropped " + itemToPlace + " in this room");
    }

    public void ListItems(){
        if (inv.notEmpty()) IO.println("You are carrying: " + inv.ItemList());
        else IO.println("Your inventory is empty");
    }

    private boolean canLoot(){
        return myRoom.isLoot();
    }
}
