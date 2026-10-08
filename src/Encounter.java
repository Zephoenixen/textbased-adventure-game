import java.util.ArrayList;

public class Encounter {
    private ArrayList<Enemy> enemies = new ArrayList<Enemy>();

    public String enemyList(){
        StringBuilder invReadout;
        invReadout = new StringBuilder();

        if(enemies.isEmpty()) return "nothing";


        invReadout.append(enemies.getFirst());
        if(enemies.size() == 1) return invReadout.toString();

        IO.println(enemies.size());

        for (int i = 1; i < enemies.size(); i++) {
            if (i+1 == enemies.size()) invReadout.append(" and ");
            else invReadout.append(", ");

            if(enemies.get(i) == null) {
                invReadout.append("ERROR");
            }
            invReadout.append(enemies.get(i));
        }
        return invReadout.toString();
    }
}
