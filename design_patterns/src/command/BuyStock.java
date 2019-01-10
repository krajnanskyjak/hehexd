package command;

public class BuyStock implements Order {
    private Stock plankStock;

    public BuyStock(Stock plankStock) {
        this.plankStock = plankStock;
    }

    @Override
    public void execute() {
        plankStock.buy();
    }
}
