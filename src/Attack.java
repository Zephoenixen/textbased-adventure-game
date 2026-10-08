public class Attack {
    private String description;
    private int damage;
    private boolean success;

    Attack(int damage, String description, boolean success){
        this.damage = damage;
        this.description = description;
        this.success = success;
    }

    public int getDamage() {
        return damage;
    }

    public String getDescription() {
        return description;
    }

    public boolean getSuccess() {
        return success;
    }
}
