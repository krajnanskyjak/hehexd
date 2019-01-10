package command;

public class CommandTest {
    public static void main(String[] args) {
        Stock plankStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(plankStock);
        SellStock sellStockOrder = new SellStock(plankStock);

        Broker b = new Broker();
        b.takeOrder(buyStockOrder);
        b.takeOrder(sellStockOrder);
        b.placeOrders();
    }
}
