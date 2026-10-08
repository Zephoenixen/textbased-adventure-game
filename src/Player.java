public class Player {
    Adventure adv = new Adventure();
    Inventory inv = new Inventory();

    Weapon weaponSlot;

    Room myRoom = adv.getStartingRoom();
    private int health = 100;

    public int getHealth(){
        return health;
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
        IO.println(" ");
        if(!cannotLoot()) IO.println("There is " + myRoom.getRoomLoot());
        IO.println(" ");
        if(!myRoom.noEncounter()) IO.println("There is " + myRoom.getEncounter());
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


    // Items.
    public boolean takeItemInRoom(String sub) {
        Item takenItem = myRoom.TakeItemFromRoom(sub);
        if (takenItem == null) return false;

        inv.addItem(takenItem);
        return true;
    }

    public boolean placeItemInRoom(String sub) {
        Item itemToPlace = inv.search(sub);
        if (itemToPlace == null) return false;

        myRoom.PutItemInRoom(itemToPlace);
        return true;
    }

    public boolean listItems(){
        if(inv.noItems()) return false;
        IO.println("You are carrying: " + inv.itemList());
        return true;
    }

    private boolean cannotLoot(){
        return myRoom.noRoomLoot();
    }
    // Equipment
    public String attack(String enemy) {
        if(weaponSlot == null) return null;

        Enemy enemyToAttack = myRoom.nameToEnemy(enemy);

        if(enemyToAttack == null) return "no enemy of that name in this room";

        String death = null;

        Attack attackInfo = weaponSlot.attack(enemyToAttack);

        StringBuilder attackFeedback = new StringBuilder(attackInfo.getDescription());

        if(attackInfo.getSuccess()) {
            String attackResult = myRoom.attackEnemy(enemyToAttack, attackInfo.getDamage());
            if(attackResult.charAt(0) == ' ') attackFeedback.append(" It has").append(attackResult).append(" health left.");
            else death = " The " + attackResult;
        }

        if (death == null){
            Attack attackBack;
            attackBack = enemyToAttack.dealDamage();

            health -= attackBack.getDamage();
            attackFeedback.append("\n").append(attackBack.getDescription()).append(". You now have ").append(health).append(" health left");
            return attackFeedback.toString();
        }
        else return attackInfo.getDescription() + death;
    }

    public boolean equipItem(String sub) {
        Weapon weaponToEquip = (Weapon) inv.search(sub);
        if (weaponToEquip == null) return false;

        weaponSlot = weaponToEquip;
        return true;
    }

    // Food.
    public String getHealthStatus(){
        if (health == 100){
            return "You are in perfect health";
        }
        if (health >= 50){
            return "You are in good health, but avoid fighting right now";
        }
        if (health > 0){
            return "You are in poor health";
        }
        return "You are dead";
    }

    public EatResult Eat(String name) {
        Item item = inv.search((name));
        boolean fromInventory = true;
        if (item == null) {
            item = myRoom.TakeItemFromRoom(name);
            fromInventory = false;
        }
        if (item == null) return EatResult.NOT_FOUND;
        if (!(item instanceof Food food)) {
            if (!fromInventory) myRoom.PutItemInRoom(item);
            return EatResult.NOT_FOOD;
        }
        health += food.getHealthPoints();
        if (fromInventory) inv.removeItem(item.getShorthand());
        return EatResult.EATEN;
    }
}


