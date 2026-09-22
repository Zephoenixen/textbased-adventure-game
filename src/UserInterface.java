public class UserInterface {
        String kommando = IO.readln("Hvor vil du gå hen? ");
        switch (kommando) {
            case "go north", "north", "n" -> IO.println("Going north");
            case "go west", "west", "w" -> IO.println("Going west");
            case "go south", "south", "s" -> IO.println("Going south");
            case "go east", "east", "e" -> IO.println("Going east");
            case "look" -> IO.println("Looking around");
            default -> IO.println("Unkown command");
        }
    }



