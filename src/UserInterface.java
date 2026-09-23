public class UserInterface {
    private Adventure adventure;

    public UserInterface(Adventure adventure) {
        this.adventure = adventure;
    }

    public void run() {
        boolean running = true;


        while (running) {
            String kommando = IO.readln();
            switch (kommando) {

                case "go north" -> TryGo(adventure.goNorth(), "Going North");
                case "go east" -> TryGo(adventure.goEast(), "Going East");
                case "go south" -> TryGo(adventure.goSouth(), "Going South");
                case "go west" -> TryGo(adventure.goWest(), "Going West");
                case "look" -> IO.println(adventure.currentRoomInfo());
                case "help" -> HelpList();
                case "exit" -> running = false;
                default -> IO.println("Unkown command");
            }
        }
    }

    private void TryGo(boolean condition, String dir_text){
        if (condition) {
            IO.println(dir_text);
            IO.println(adventure.currentRoomInfo());
        } else {
            IO.println("You cannot go that way");
        }
    }

    private void HelpList() {
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



