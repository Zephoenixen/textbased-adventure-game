void main() {
    IO.println("LOOK around for any available door to go through, and GO through to map out the area." + "\n");
    UserInterface userInterface = new UserInterface(new Adventure());
    userInterface.run();
}