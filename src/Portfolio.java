import java.util.ArrayList;
import java.util.List;

public class Portfolio {
    private String name;
    private String owner;
    private List<Investment> investments;

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
        this.investments = new ArrayList<Investment>();
    }

    public void addInvestment(Investment investment) {
        this.investments.add(investment);
    }
    public double getTotalValue() {
        double total = 0;
        for(Investment inv : investments){
            total = inv.getCurrentValue();
        }
        return total;
    }

    public double getTotalProfitLoss() {
        double total = 0;
        for(Investment inv : investments){
            total += inv.getProfitLost();
        }
        return total;
    }

    public List<Investment> getInvestments(String symbol) {
        List<Investment> result = new ArrayList<>();
        for(Investment inv : investments){
            if(inv.getStock().getSymbol().equalsIgnoreCase(symbol)){
                result.add(inv);
            }
        }
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public List<Investment> getInvestments() {
        return investments;
    }

    public void setInvestments(List<Investment> investments) {
        this.investments = investments;
    }
}
