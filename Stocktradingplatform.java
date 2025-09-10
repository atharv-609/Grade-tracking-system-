import java.util.*;

class Stock {
    String symbol;
    double price;
    Stock(String symbol, double price) {
        this.symbol = symbol;
        this.price = price;
    }
}

class Portfolio {
    Map<String, Integer> holdings = new HashMap<>();
    void buy(String symbol, int amount) {
        holdings.put(symbol, holdings.getOrDefault(symbol, 0) + amount);
    }
    void sell(String symbol, int amount) {
        holdings.put(symbol, Math.max(0, holdings.getOrDefault(symbol, 0) - amount));
    }
    void display() {
        System.out.println("Portfolio:");
        for(String sym : holdings.keySet())
            System.out.println(sym + ": " + holdings.get(sym));
    }
}

public class TradingPlatform {
    public static void main(String[] args) {
        List<Stock> market = Arrays.asList(
            new Stock("AAPL", 170.15),
            new Stock("GOOG", 135.23),
            new Stock("TSLA", 250.80)
        );
        Portfolio p = new Portfolio();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Market:");
            for(Stock s : market) System.out.println(s.symbol + ": $" + s.price);
            System.out.print("Buy/Sell/Exit? ");
            String action = sc.next().toLowerCase();
            if(action.equals("exit")) break;
            System.out.print("Symbol? ");
            String symbol = sc.next();
            System.out.print("Amount? ");
            int amt = sc.nextInt();
            if(action.equals("buy")) p.buy(symbol, amt);
            else if(action.equals("sell")) p.sell(symbol, amt);
            p.display();
        }
    }
}
