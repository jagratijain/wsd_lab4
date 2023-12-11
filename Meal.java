
package HostelItems;
import Interfaces.Customizable;

public final class Meal extends HostelItem implements Customizable {
    private String type;

    public Meal(String name, double price, String type) {
        super(name, price);
        this.type = type;
    }

    @Override
    public void displayItem() {
        System.out.println("Meal: " + name + " (Type: " + type + "), Price: Rs" + price);
    }

    @Override
    public void customize(String preference) {
        System.out.println("--------------------------------");
        System.out.println("Customizing meal with " + preference);
        System.out.println("--------------------------------");
    }
}
