import java.util.*;

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

        ArrayList<Item> itemsMore = new ArrayList<>();
        itemsMore.add(new Item("Mouse", 6));
        itemsMore.add(new Item("Keyboard", 7));
        itemsMore.add(new Item("Disc", 8));
        itemsMore.add(new Item("Pendrive", 9));
        itemsMore.add(new Item("Screen", 10));
        itemsMore.add(new Item("Speakers", 11));
        itemsMore.add(new Item("Printer", 12));
        itemsMore.add(new Item("Scanner", 13));
        itemsMore.add(new Item("Camera", 14));
        itemsMore.add(new Item("Microphone", 15));

        itemsMore.subList(0,5);

        HashSet<Item> hashSet = new HashSet<Item>(itemsMore);
    }
}
