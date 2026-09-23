public class UserInterface {
    boolean running = true;

    public void run() {
        while (running){
            String kommando = IO.readln();
            switch (kommando) {

                case "go north" -> IO.println("Going north");
                case "go south" -> IO.println("Going south");
                case "go west" -> IO.println("Going west");
                case "go east" -> IO.println("Going east");
                case "look" -> IO.println("Looking around");
                case "help" -> IO.println("Help for commands");
                case "exit" -> running = false;
                default -> IO.println("Unkown command");
            }
        }
        IO.println("goodbye!");
    }
}



