public class UserInterface {
    private Player player;

    public UserInterface(Player player) {
        this.player = player;
    }

    public void run() {
        boolean running = true;
        player.Look();

        while (running) {
            String kommando = IO.readln().trim().toLowerCase();
            if(kommando.contains("take")){
                String item = kommando.substring(5);
                player.takeItemInRoom(item);
            }

            else if (kommando.startsWith("drop")){
                String sub = kommando.substring(5);
                player.PlaceItemInRoom(sub);
            }

            else if (kommando.startsWith("equip")){
                String sub = kommando.substring(6);
                player.EquipItem(sub);
            }

            else if (kommando.startsWith("eat ")) {
                String item = kommando.substring(4);
                EatResult result = player.Eat(item);

                switch (result) {
                    case NOT_FOUND ->
                            IO.println("There is nothing like " + item + " to eat around here");
                    case NOT_FOOD ->
                            IO.println("You cannot eat the " + item);
                    case EATEN ->
                            IO.println("You eat the " + item);
                }
            }
            else {

            switch (kommando) {

                case "go north", "n", "north" -> player.GoNorth();
                case "go east", "e", "east" -> player.GoEast();
                case "go south", "s", "south" -> player.GoSouth();
                case "go west", "w", "west" -> player.GoWest();

                case "attack" -> player.Attack();
                case "look" -> player.Look();
                case "inventory", "i" -> player.ListItems();

                case "health" -> DisplayPlayerHealth();
                case "help" -> HelpList();

                case "exit" -> running = false;
                default -> IO.println("Unknown command");
                }
            }
        }
    }

    private void DisplayPlayerHealth(){
        IO.println("health: " + player.getHealth() + " - " + player.getHealthStatus());
    }

    private void HelpList(){
        IO.println("""
        go north -> moves the player north
        go east -> moves the player east
        go south -> moves the player south
        go west -> moves the player west
        
        attack -> attack with an equipped weapon
        take "item" -> takes the item specified if it is in the room and puts it in your inventory
        drop "item" -> drops the item specified if it is in your inventory
        
        look -> describes the current room
        inventory -> view the items you are currently carrying in your inventory
        health -> shows your current health

        help -> brings out the list of commands with explanations
        exit -> exits the program
        """);
    }
}



