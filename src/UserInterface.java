public class UserInterface {
    public void run() {
        String kommando = IO.readln();
        switch (kommando) {

            case "go north" -> IO.println("Going north");
            case "go south" -> IO.println("Going south");
            case "go west" -> IO.println("Going west");
            case "go east" -> IO.println("Going east");
            case "look" -> IO.println("Looking around");
            case "help" ->
            case "exit" ->
            default -> IO.println("Unkown command");
        }
    }
}



