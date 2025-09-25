public class Investment {
    private Stock stock;
    private int quantity;
    private double averagePrice;

    public Investment(Stock stock, int quantity, double averagePrice) {
        this.stock = stock;
        this.quantity = quantity;
        this.averagePrice = averagePrice;
    }
    public double getCurrentValue(){
        return (stock.getCurrentPrice() - averagePrice) * quantity;
    }

    public double getProfitLost() {
        return (stock.getCurrentPrice() - averagePrice) * quantity;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getAveragePrice() {
        return averagePrice;
    }

    public void setAveragePrice(double averagePrice) {
        this.averagePrice = averagePrice;
    }
}
