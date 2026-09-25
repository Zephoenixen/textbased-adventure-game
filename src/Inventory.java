import java.util.ArrayList;

public class Inventory {
    private ArrayList<String> items = new ArrayList<>();

    public boolean notEmpty(){
        return !items.isEmpty();
    }

    public String ItemList(){
        StringBuilder invReadout;
        invReadout = new StringBuilder();

        invReadout.append(items.getFirst());
        for (int i = 1; i < items.size(); i++) {
            if (i+1 == items.size()) invReadout.append(" and");
            else invReadout.append(",");
            invReadout.append(" ").append(items.get(i));
        }
        if (invReadout.isEmpty()) return "";
        return invReadout.toString();
    }


    public void AddItem(String item){
        items.add(item);
    }

    public void RemoveItem(String itemRemoved){
        if(items.isEmpty()) return ;
        for (int i = 0; i < items.size(); i++) {
            if(items.get(i).equals(itemRemoved)){
                items.remove(i);
                return;
            }
        }
    }
}
