public class Food extends Item{
    private int healthPoints;

    public Food(String n, String sh, int healthPoints){
        super(n, sh);
        this.healthPoints = healthPoints;
    }
    public int getHealthPoints(){
        return healthPoints;
    }
}
