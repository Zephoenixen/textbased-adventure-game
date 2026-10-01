import java.util.ArrayList;

public class Inventory {
    private ArrayList<Item> items = new ArrayList<>();

    public boolean notEmpty(){
        return !items.isEmpty();
    }



    public String ItemList(){
        StringBuilder invReadout;
        invReadout = new StringBuilder();

        if(items.isEmpty()) return "nothing";


        invReadout.append(items.getFirst());
        if(items.size() == 1) return invReadout.toString();

        for (int i = 1; i < items.size(); i++) {

            if(items.get(i) == null) break;
            if (i+1 == items.size()) invReadout.append(" and ");
            else invReadout.append(", ");

            invReadout.append(items.get(i).toString());
        }
        return invReadout.toString();
    }



    public void AddItem(Item item){
        items.add(item);
    }

    public void RemoveItem(String itemName){
       Item itemToRemove = Search(itemName);
       if(itemToRemove == null) return;
       items.remove(itemToRemove);
    }

    public Item Search(String sub){
        if(items.isEmpty()) return null;
        for (Item item : items) {
            if (item != null && item.getShorthand().equals(sub)) {
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
