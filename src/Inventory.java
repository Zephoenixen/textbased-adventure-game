import java.util.ArrayList;

public class Inventory {
    private ArrayList<Item> items = new ArrayList<>();

    public boolean noItems(){
        return items.isEmpty();
    }

    public String itemList(){
        StringBuilder invReadout;
        invReadout = new StringBuilder();

        if(noItems()) return "nothing";


        invReadout.append(items.getFirst());
        if(items.size() == 1) return invReadout.toString();

        for (int i = 1; i < items.size(); i++) {
            if (i+1 == items.size()) invReadout.append(" and ");
            else invReadout.append(", ");

            if(items.get(i) == null) {
                invReadout.append("ERROR");
            }
            invReadout.append(items.get(i));
        }
        return invReadout.toString();
    }



    public void addItem(Item item){
        items.add(item);
    }

    public void removeItem(String itemName){
       Item itemToRemove = search(itemName);
       if(itemToRemove == null) return;
       items.remove(itemToRemove);
    }

    public Item search(String sub){
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
        return itemList();
    }
}
