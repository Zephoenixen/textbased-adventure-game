public class UserInterface {
    boolean running;
    Adventure adventure;

    public void run() {
        running = true;
        adventure = new Adventure();

        while (running){
            String kommando = IO.readln();
            switch (kommando) {

                case "go north" -> TryGoingSouth();
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

    private void TryGoingSouth() {
        if(!adventure.goSouth()){
            IO.println("There is a wall this way");
        }
    }
}



