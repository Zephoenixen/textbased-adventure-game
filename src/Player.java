public class Player {
    Adventure adv;

    public Player(Adventure adv){
        this.adv = adv;
    }

    public void GoNorth(){
        TryGo(adv.goNorth(), "Going North");
    }

    public void GoEast(){
        TryGo(adv.goEast(), "Going East");
    }

    public void GoSouth(){
        TryGo(adv.goSouth(), "Going South");
    }

    public void GoWest(){
        TryGo(adv.goWest(), "Going West");
    }
    private void TryGo(boolean condition, String dir_text){
        if (condition) {
            IO.println(dir_text);
            IO.println(adv.currentRoomInfo());
        } else {
            IO.println("You cannot go that way");
        }
    }

    public void Look(){
        IO.println(adv.currentRoomInfo());
    }
}
