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
                    } else {
                        IO.println("You cannot go that way");
                    }
                }
                case "go east" -> {
                    if (adventure.goEast()) {
                        IO.println("Going east");
                    } else {
                        IO.println("You cannot go that way");
                    }
                }
                case "go south" -> {
                        if (adventure.goSouth()) {
                            IO.println("Going south");
                        } else {
                            IO.println("You cannot go that way");
                        }
                    }
                case "go west" -> {
                            if (adventure.goWest()) {
                                IO.println("Going west");
                            } else {
                                IO.println("You cannot go that way");
                            }
                        }
                case "look" -> DescribeMyRoom();
                case "help" -> HelpList();
                case "exit" -> running = false;
                default -> IO.println("Unknown command");
            }
        }
    }

    private void WhereAmI(){
        IO.println("you are now in " + adventure.getCurrentRoom().getName());
    }

    private void DescribeMyRoom(){
        IO.println("The room you are standing in is " + adventure.getCurrentRoom().getDescription());
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



