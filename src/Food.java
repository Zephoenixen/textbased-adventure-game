public class Food extends Item{
    private int healthPoints;

    public Food(String n, String sh, String g, int healthPoints){
        super(n, sh, g);
        this.healthPoints = healthPoints;
    }
    public int getHealthPoints(){
        return healthPoints;
    }
}
