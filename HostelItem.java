
package HostelItems;
import Interfaces.Item;

public abstract class HostelItem implements Item {
    protected String name;
    protected double price;

    public HostelItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
