public abstract class Weapon extends Item {

    Weapon(String n, String sh) {
        super(n, sh);
    }

    public abstract boolean Attack(String target);


}


