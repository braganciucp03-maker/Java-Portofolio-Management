public class Stock {
    private String symbol;
    private String name;
    private double currentPrice;

    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCurrentPrice(double price) {
        this.currentPrice = price;
    }
}
