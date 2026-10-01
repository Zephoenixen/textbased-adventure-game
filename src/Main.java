void main() {
    Adventure adventure = new Adventure();
    Player player = new Player();
    UserInterface userInterface = new UserInterface(player);
    userInterface.run();
}