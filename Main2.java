import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main2 {
    public static void main(String[] args){
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("Laptop", 1));
        items.add(new Item("Smartphone", 2));
        items.add(new Item("Tablet", 3));
        items.add(new Item("Smartwatch", 4));
        items.add(new Item("Headphones", 5));

        for (Item item : items) {
            item.show();
        }

        HashMap<Integer, String> itemMap = new HashMap<>();
        for (Item item : items) {
            itemMap.put(item.getId(), item.getName());
        }

        for (Map.Entry<Integer, String> entry : itemMap.entrySet()) {
            System.out.println("Item id: " + entry.getKey() + ", Item name: " + entry.getValue());
        }
    }
}
