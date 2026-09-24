void main() {
    Adventure adventure = new Adventure();
    Player player = new Player(adventure);
    UserInterface userInterface = new UserInterface(player);
    userInterface.run();
}