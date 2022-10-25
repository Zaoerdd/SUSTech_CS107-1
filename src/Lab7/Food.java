package Lab7;

public class Food {
    private int id;
    private String name;
    private String type;
    private int size;
    private double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void showInformation() {
        System.out.printf("[id] %1d  ", this.id);
        System.out.printf("[type] %7s  ", this.type);
        System.out.printf("[name] %10s  ", this.name);
        System.out.printf("[size] %3d (inches)  ", this.size);
        System.out.printf("[price] %.2f $\n", this.price);
    }
}
