import java.util.ArrayList;

public class Encounter {
    private ArrayList<Enemy> enemies = new ArrayList<Enemy>();

    public boolean noEnemies(){
        return enemies.isEmpty();
    }

    public String enemyList(){
        StringBuilder invReadout;
        invReadout = new StringBuilder();

        if(noEnemies()) return "nothing";


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

    public Enemy search(String sub){
        if(enemies.isEmpty()) return null;
        for (Enemy enemy : enemies) {
            if (enemy != null && enemy.getShorthand().equals(sub)) {
                return enemy;
            }
        }
        return null;
    }

    public void addEnemy(Enemy enemy){
        enemies.add(enemy);
    }

    public void removeEnemy(String enemyName){
        Enemy enemyToRemove = search(enemyName);
        if(enemyToRemove == null) return;
        enemies.remove(enemyToRemove);
    }

    @Override
    public String toString() {
        return enemyList();
    }
}
