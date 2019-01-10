package command;

public class SellStock implements Order {
    private Stock plankStock;

    public SellStock(Stock plankStock) {
        this.plankStock = plankStock;
    }

    @Override
    public void execute() {
        plankStock.sell();
    }
}
