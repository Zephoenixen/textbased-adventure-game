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
            switch (kommando) {

                case "go north", "n", "north" -> player.GoNorth();
                case "go east", "e", "east" -> player.GoEast();
                case "go south", "s", "south" -> player.GoSouth();
                case "go west", "w", "west" -> player.GoWest();
                case "look" -> player.Look();
                case "help" -> HelpList();
                case "exit" -> running = false;
                default -> IO.println("Unknown command");
            }
        }
    }

    private void HelpList(){
        IO.println("""
        go north -> moves the player north
        go east -> moves the player east
        go south -> moves the player south
        go west -> moves the player west
        look -> describes the current room
        help -> brings out the list of commands with explainations
        exit -> exits the program
        """);
    }
}



