public class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    Stock(){
        symbol = "";
        name = "";
        previousClosingPrice = 1;
        currentPrice = 1;
    }

    Stock(String newSymbol, String newName, double newPreviousClosingPrice){
        symbol = newSymbol;
        name = newName;
        previousClosingPrice = newPreviousClosingPrice;
    }

    void addCurrentPrice(double newCurrentPrice){
        currentPrice = newCurrentPrice;
    }

    double getChangePercent(){
        if (previousClosingPrice > currentPrice){
            return (previousClosingPrice - currentPrice) / previousClosingPrice * 100;
        }
        else{
            return (previousClosingPrice - currentPrice) / previousClosingPrice * -100;
        }
    }
}
