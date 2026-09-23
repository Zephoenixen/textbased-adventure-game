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

                case "go north" -> {
                    if (adventure.goNorth()) {
                        IO.println("Going north");
                        IO.println(adventure.currentRoomInfo());
                    } else {
                        IO.println("You cannot go that way");
                    }
                }
                case "go east" -> {
                    if (adventure.goEast()) {
                        IO.println("Going east");
                        IO.println(adventure.currentRoomInfo());
                    } else {
                        IO.println("You cannot go that way");
                    }
                }
                case "go south" -> {
                    if (adventure.goSouth()) {
                        IO.println("Going south");
                        IO.println(adventure.currentRoomInfo());
                    } else {
                        IO.println("You cannot go that way");
                    }
                }
                case "go west" -> {
                    if (adventure.goWest()) {
                        IO.println("Going west");
                        IO.println(adventure.currentRoomInfo());
                    } else {
                        IO.println("You cannot go that way");
                    }
                }
                case "look" -> IO.println(adventure.currentRoomInfo());
                case "help" -> IO.println("Help for commands");
                case "exit" -> running = false;
                default -> IO.println("Unkown command");
            }
        }
    }
}



