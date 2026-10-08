import javax.swing.*;

public class DungeonBuilder {
    private Room room1,room2,room3,room4,room5,room6,room7,room8,room9;

    private Item Diamond, Bottle, Mirror, Rope, Coin, Amulet, Candle, Book, Doll, Lantern, Jar, Shoes, Clock;

    private Weapon Sword, Bow, Torch, Club, Dagger;

    private Enemy Troll, Goblin, Bug;

    private void RightConnection(Room r1, Room r2){
        r1.AssignEast(r2);
        r2.AssignWest(r1);
    }

    private void DownConnection(Room r1, Room r2){
        r1.AssignSouth(r2);
        r2.AssignNorth(r1);
    }

    public void MakeRooms(){
        room1 = new Room(new Vector2(0,0));
        room2 = new Room(new Vector2(0,1));
        room3 = new Room(new Vector2(0,2));
        room4 = new Room(new Vector2(1,0));
        room5 = new Room(new Vector2(1,1));
        room6 = new Room(new Vector2(1,2));
        room7 = new Room(new Vector2(2,0));
        room8 = new Room(new Vector2(2,1));
        room9 = new Room(new Vector2(2,2));
    }

    public void MakeItems(){
        Diamond = new Item("beautiful diamond" , "diamond");
        Bottle = new Item("empty glass bottle" , "bottle");
        Mirror = new Item("reflective mirror" , "mirror");
        Rope = new Item("hempen rope" , "rope");
        Coin = new Item("gold coin from an old empire" , "coin");
        Amulet = new Item("amulet with elven engravings" , "amulet");
        Candle = new Item("unlit candle" , "candle");
        Book = new Item("dusty book with unreadable words" , "book");
        Doll = new Item("childlike doll" , "doll");
        Lantern = new Item("lit lantern" , "lantern");
        Jar = new Item("tiny jar" , "jar");
        Shoes = new Item("leather shoes" , "shoes");
        Clock = new Item("broken clock" , "clock");
    }

    public void MakeWeapons(){
        Sword = new MeleeWeapon("silver sword", "sword", 10 );
        Torch = new MeleeWeapon("burning torch", "torch", 5);
        Bow = new AmmoWeapon("elven bow", "bow", 15, 10);
        Club = new MeleeWeapon("heavy stick", "club", 7);
        Dagger = new MeleeWeapon("small  sword", "dagger", 5);
    }
    Food Bread = new Food(
            "loaf of stale bread",
            "bread",
            10
    );

    Food Mushroom = new Food(
            "pale glowing mushroom\"",
            "mushroom",
            -50
    );

    public void MakeEnemies(){
        Troll = new Enemy(
                "cave troll",
                "troll",
                "Alive",
                "Dead",
                20,
                Club,
                room3
        );
        Goblin = new Enemy(
                "ugly goblin",
                "goblin",
                "akin to a green, ugly child",
                "corpse of an ugly, green child",
                10,
                Dagger,
                room6
        );


    }

    public void AssignRooms(){
               // Assign first row.
        RightConnection(room1, room2);
        RightConnection(room2, room3);
        DownConnection(room1, room4);
        DownConnection(room3, room6);

        // Assign second row.
        DownConnection(room4, room7);
        DownConnection(room5, room8);
        DownConnection(room6, room9);

        //Assign third row.
        RightConnection(room7, room8);
        RightConnection(room8, room9);
    }

    public void AssignNames(){
          room1.setName("first room");
          room2.setName("second room");
          room3.setName("third room");
          room4.setName("fourth room");
          room5.setName("fifth room");
          room6.setName("sixth room");
          room7.setName("seventh room");
          room8.setName("eighth room");
          room9.setName("ninth room");
    }

    public void AssignDescriptions(){
        room1.setDescription("a dark and webby room, with many broken bricks laying");
        room2.setDescription("a dark and webby room, with two ransacked cupboards");
        room3.setDescription("a dark and webby room, with a skeleton chained to the wall");
        room4.setDescription("a grey and webby room, with weak light beams coming from holes in the ceiling");
        room5.setDescription("a dark and webby room, with a small waterfall in its midst");
        room6.setDescription("a dark and webby room, with a deep sense of dread filling the air");
        room7.setDescription("a lighted room, with a very pristine doll set in the southeast corner");
        room8.setDescription("a dark and webby room, with spiders in every corner");
        room9.setDescription("a dark and webby room, with two old dilapited shoes filled with mud. A small seedling can be seen emerging from them");
    }


    public Room getRoom1(){
        return room1;
    }

    public void assignItems() {
        room1.PutItemInRoom(Bread);
        room1.PutItemInRoom(Bow);
        room1.PutItemInRoom(Diamond);
        room1.PutItemInRoom(Torch);
        room2.PutItemInRoom(Sword);
        room3.PutItemInRoom(Bottle);
        room3.PutItemInRoom(Mirror);
        room3.PutItemInRoom(Rope);
        room3.PutItemInRoom(Mushroom);
        room4.PutItemInRoom(Coin);
        room5.PutItemInRoom(Amulet);
        room6.PutItemInRoom(Candle);
        room6.PutItemInRoom(Book);
        room7.PutItemInRoom(Doll);
        room8.PutItemInRoom(Lantern);
        room8.PutItemInRoom(Jar);
        room9.PutItemInRoom(Shoes);
        room9.PutItemInRoom(Clock);

    }
    public void assignEnemies(){
        room3.putEnemyInRoom(Troll);
        room6.putEnemyInRoom(Goblin);
    }
}
