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

                case "go north" -> TryGoNorth();
                case "go east" -> TryGoEast();
                case "go south" -> TryGoSouth();
                case "go west" -> TryGoWest();
                case "look" -> IO.println(adventure.currentRoomInfo());
                case "help" -> HelpList();
                case "exit" -> running = false;
                default -> IO.println("Unkown command");
            }
        }
    }

    private void TryGoWest() {
        if (adventure.goWest()) {
            IO.println("Going west");
            IO.println(adventure.currentRoomInfo());
        } else {
            IO.println("You cannot go that way");
        }
    }

    private void TryGoSouth() {
        if (adventure.goSouth()) {
            IO.println("Going south");
            IO.println(adventure.currentRoomInfo());
        } else {
            IO.println("You cannot go that way");
        }
    }

    private void TryGoEast() {
        if (adventure.goEast()) {
            IO.println("Going east");
            IO.println(adventure.currentRoomInfo());
        } else {
            IO.println("You cannot go that way");
        }
    }

    private void TryGoNorth() {
        if (adventure.goNorth()) {
            IO.println("Going north");
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



