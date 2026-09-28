import java.util.ArrayList;

public class Inventory {
    private ArrayList<Item> items = new ArrayList<>();

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



    public void AddItem(Item item){
        items.add(item);
    }

    public boolean RemoveItem(String itemName){
       Item itemToRemove = Search(itemName);
       if(itemToRemove == null) return false;
       items.remove(itemToRemove);
       return true;
    }

    public Item Search(String sub){
        if(items.isEmpty()) return null;
        for (Item item : items) {
            if (item.getShorthand().equals(sub)) {
                return item;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return items.toString();
    }
}
