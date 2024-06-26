public class Item {

    private String name;
    private int id;


    public Item(String name, int id) {
        setName(name);
        setId(id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name==null) {
            throw new IllegalArgumentException("Name cannot be null");
        }
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id<0) {
            throw new IllegalArgumentException("Id cannot be negative");
        }
        this.id = id;
    }

    public void show() {
        System.out.println("Item: "+name+ ", "+ id);
    }
}
