package command;

public class Stock {
    private String name = "planks";
    private int quantity = 10;

    public void buy() {
        System.out.println("Stock: " + name + ", quantity: " + quantity + ", BOUGHT");
    }

    public void sell() {
        System.out.println("Stock: " + name + ", quantity: " + quantity + ", SOLD");
    }
}
